package net.androidbootcamp.finalproject;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by Various on 6/27/2016.
 */
public class Animation extends AppCompatActivity {
    AnimationDrawable lightsAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motivation);
        ImageView imgFrame = (ImageView) findViewById(R.id.imgLIghts);
        imgFrame.setBackgroundResource(R.drawable.animation);
        lightsAnimation = (AnimationDrawable) imgFrame.getBackground();
        Button button1 = (Button) findViewById(R.id.btnStart);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lightsAnimation.start();
            }
        });
    }
}
