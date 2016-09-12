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

public class MonstreListeAdapter extends ArrayAdapter<String> {

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

    private static class ViewHolder {
        private TextView txt;
        private ImageView image;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;

        if(convertView == null ) {
            LayoutInflater inflater = (LayoutInflater)
                    getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            convertView = inflater.inflate(R.layout.row_layout, parent, false);

            holder = new ViewHolder();
            holder.txt = (TextView) convertView.findViewById(R.id.label);
            holder.image = (ImageView) convertView.findViewById(R.id.icon);
            convertView.setTag(holder);
        }
        else {

            holder = (ViewHolder)convertView.getTag();
        }

        holder.txt.setText(getItem(position));
        holder.image.setImageResource(Mob[position]);

        return convertView;
    }

    public MonstreListeAdapter(Context context, String[] values) {
        super(context, R.layout.row_layout, values);
        Log.i("values length", Integer.toString(values.length));

    }
}

