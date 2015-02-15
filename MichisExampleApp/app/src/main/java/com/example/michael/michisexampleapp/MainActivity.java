package com.example.michael.michisexampleapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.TextView;
//Useless comment

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initiateElements();
        //((TextView) getElementById(R.id.textView)).setText("Hallo du");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void initiateElements() {
        TextView tv = (TextView)findViewById(R.id.textView3);
        tv.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getActionMasked())
                {
                    case MotionEvent.ACTION_DOWN:

                        int offset_x = (int)event.getX();
                        int offset_y = (int)event.getY();
                        v.setAnimation(new RotateAnimation(0, 3.14f));
                        v.animate();
                        //v.setLeft(offset_x);
                        //v.setTop(offset_y);
                        //selected_item = v;
                        break;
                    default:
                        break;
                }
                return false;
            }
        });
    }
}
