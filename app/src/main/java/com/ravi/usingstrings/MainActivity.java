package com.ravi.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtMsg2 = findViewById(R.id.TvForMsg2);
        txtMsg2.setText(R.string.Msg2);


       Log.i("LifeCycle", "OnCreate Called ! ");

    }

    @Override
    protected void onStart() {
        super.onStart();


        Log.i("LifeCycle", "OnStart Called !");
    }


    @Override
    protected void onResume() {
        super.onResume();

        Log.i("LifeCycle", "OnResume Called !");

    }


    @Override
    protected void onPause() {
        super.onPause();

        Log.i("LifeCycle", "OnPause Called !");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i("LifeCycle", "OnStop Called !");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i("LifeCycle", "OnDestroy Called !");
    }
}