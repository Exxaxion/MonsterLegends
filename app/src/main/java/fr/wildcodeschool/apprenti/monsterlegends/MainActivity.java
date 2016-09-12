package fr.wildcodeschool.apprenti.monsterlegends;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] values = new String[] { "Fire Lion", "Rockilla", "Turtle",
                "Panda", "Thunder Eagle", "Light Spirit",
                "Tyrannoking", "Genie", "Firesaur", "Mersnake", "Treezard", "Metalsaur" };

        MonstreListeAdapter adapter = new MonstreListeAdapter(this, values);
        setListAdapter(adapter);
    }

}
