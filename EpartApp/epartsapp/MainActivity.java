package epartsapp.epartsapp.epartsapp.epartsapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;
import android.widget.VideoView;

import java.util.Timer;
import java.util.TimerTask;

import epartapp.epartapp.epartapp.epartapp.R;


public class MainActivity extends AppCompatActivity {

    ImageButton call,iaaplus,copplus;
    ImageView copphoto,iaaphoto,menubtn,menubtn2;
    Toolbar toolbar;
    VideoView videoView;
    Button maxbtn;

    @Override
    protected void onPostResume() {
        videoView.start();
        super.onPostResume();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


         menubtn = (ImageView) findViewById(R.id.menubtn);
         menubtn2 = (ImageView)findViewById(R.id.menubtn2);
         call = (ImageButton)findViewById(R.id.call);
         copphoto=(ImageView)findViewById(R.id.copphoto);
         toolbar = (Toolbar) findViewById(R.id.toolbar);
         iaaphoto =(ImageView) findViewById(R.id.iaaphoto);
         iaaplus = (ImageButton) findViewById(R.id.iaaplus);
         copplus = (ImageButton) findViewById(R.id.copplus);
         maxbtn=(Button)findViewById(R.id.maxbtn);

         call.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(getApplicationContext(),CallActivity.class);
                 startActivity(intent);


             }



         });

         copplus.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(getApplicationContext(),Menu.class);
                 startActivity(intent);
             }
         });
         iaaplus.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(getApplicationContext(),Menu2.class);
                 startActivity(intent);
             }
         });
         maxbtn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intent = new Intent(Intent.ACTION_VIEW);
                 intent.setData(Uri.parse("https://www.petekamutner.am/csOS_VehiclesCVC.aspx"));
                 startActivity(intent);
             }
         });

        videoView = (VideoView) findViewById(R.id.videoView);
        String videouri = "android.resource://"+getPackageName()+"/" + R.raw.epart;
        Uri uri = Uri.parse(videouri);
        videoView.setVideoURI(uri);

        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                videoView.start();
            }

        };
        timer.schedule(timerTask,37000,37000);

    }


}
