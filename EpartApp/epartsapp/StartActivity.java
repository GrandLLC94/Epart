package epartsapp.epartsapp.epartsapp.epartsapp;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toolbar;

import epartapp.epartapp.epartapp.epartapp.R;


public class StartActivity extends AppCompatActivity {

    ProgressBar progressBar;
    Toolbar toolbar;
    ImageView car;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

         progressBar = (ProgressBar)findViewById(R.id.progressBar);
         toolbar =(Toolbar) findViewById(R.id.toolbar);
         car =(ImageView) findViewById(R.id.car);

        progressBar.setMax(100);
        progressBar.setProgress(0);


       final Thread thread = new Thread(){

           @Override
           public void run() {
               try {
                   for(int i = 0;i<100;i++){
                     progressBar.setProgress(i);
                     sleep(30);
                   }
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }finally {
                   Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                   startActivity(intent);
                   finish();
               }
           }
       };
       thread.start();
    }
}
