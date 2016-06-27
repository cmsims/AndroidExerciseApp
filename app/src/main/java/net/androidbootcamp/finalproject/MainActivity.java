package net.androidbootcamp.finalproject;

import android.app.ListActivity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends ListActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] daysList={"Motivation", "Stop Watch", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main, R.id.travel, daysList));

    }
    protected void onListItemClick(ListView l, View v, int position, long id){
        switch(position){
            case 0:
                startActivity(new Intent(MainActivity.this, Animation.class));
                break;
            case 1:
                startActivity(new Intent(MainActivity.this, StopwatchMain.class));
                break;
            case 2:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bodybuilding.com/fun/lee-labrada-12-week-lean-body-trainer-week-1-day-1.html")));
                break;
            case 3:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bodybuilding.com/fun/lee-labrada-12-week-lean-body-trainer-week-1-day-2.html")));
                break;
            case 4:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bodybuilding.com/fun/lee-labrada-12-week-lean-body-trainer-week-1-day-3.html")));
                break;
            case 5:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bodybuilding.com/fun/lee-labrada-12-week-lean-body-trainer-week-1-day-4.html")));
                break;
            case 6:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bodybuilding.com/fun/lee-labrada-12-week-lean-body-trainer-week-1-day-5.html")));
                break;
            case 7:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bodybuilding.com/fun/lee-labrada-12-week-lean-body-trainer-week-1-day-6.html")));
                break;
            case 8:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bodybuilding.com/fun/lee-labrada-12-week-lean-body-trainer-week-1-day-7.html")));
                break;
        }
    }
}
