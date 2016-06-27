package net.androidbootcamp.finalproject;

import android.app.Activity;
import android.content.Intent;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class StopwatchMain extends Activity implements View.OnClickListener{
    private Chronometer chronometer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);
        chronometer = (Chronometer) findViewById(R.id.chronometer);
        findViewById(R.id.start).setOnClickListener(this);
        findViewById(R.id.stop).setOnClickListener(this);
    }

    public void onClick(View v){
        switch(v.getId()){
            case R.id.start:
                chronometer.setBase(SystemClock.elapsedRealtime());
                chronometer.start();
                break;
            case R.id.stop:
                chronometer.stop();
                break;
        }
    }
}
