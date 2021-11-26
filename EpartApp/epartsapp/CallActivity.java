package epartsapp.epartsapp.epartsapp.epartsapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import epartapp.epartapp.epartapp.epartapp.R;


public class CallActivity extends AppCompatActivity {

    TextView tell1,tell2,tell3;
    ImageView imagecall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);

       tell1 =(TextView) findViewById(R.id.tell1);
       tell2 =(TextView) findViewById(R.id.tell2);
       tell3=(TextView)findViewById(R.id.tell3);
       imagecall =(ImageView) findViewById(R.id.imagecall);


       tell1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(Intent.ACTION_DIAL);
               intent.setData(Uri.parse("tel:094333377"));
               startActivity(intent);
           }
       });
       tell2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(Intent.ACTION_DIAL);
               intent.setData(Uri.parse("tel:093636611"));
               startActivity(intent);
           }
       });
        tell3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:093832926"));
                startActivity(intent);
            }
        });

    }
}
