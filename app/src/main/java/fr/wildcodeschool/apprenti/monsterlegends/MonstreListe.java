package fr.wildcodeschool.apprenti.monsterlegends;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by apprenti on 09/09/16.
 */

public class MonstreListe extends ArrayAdapter<String> {

    private Integer[] Mob = {
            R.drawable.feu,
            R.drawable.terre,
            R.drawable.eau,
            R.drawable.nature,
            R.drawable.foudre,
            R.drawable.lumiere,
            R.drawable.mort,
            R.drawable.magie,
            R.drawable.metal };

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Log.i("position", Integer.toString(position));
        View rowView;

        if(convertView == null ) {
            LayoutInflater inflater = (LayoutInflater)
                    getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            rowView = inflater.inflate(R.layout.row_layout, parent, false);

            TextView textView = (TextView) rowView.findViewById(R.id.label);
            ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);

            textView.setText(getItem(position));
            imageView.setImageResource(Mob[position]);
        }
        else {

            rowView = convertView;
        }

        return rowView;
    }

    public MonstreListe(Context context, String[] values) {
        super(context, R.layout.row_layout, values);
        Log.i("values length", Integer.toString(values.length));

    }
}

