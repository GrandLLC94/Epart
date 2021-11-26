package epartsapp.epartsapp.epartsapp.epartsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


import epartapp.epartapp.epartapp.epartapp.R;

public class Menu2 extends AppCompatActivity {

    ListView list_item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);

       list_item = (ListView)findViewById(R.id.list_item);


        ArrayAdapter<String>adapter = new ArrayAdapter<String>(getApplicationContext(),R.layout.mytextsize,getResources().getStringArray(R.array.City2));
        list_item.setAdapter(adapter);
        list_item.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String click = list_item.getItemAtPosition(position).toString();
                Toast.makeText(Menu2.this, "" + click + "", Toast.LENGTH_LONG).show();

            }
        });

    }
}
