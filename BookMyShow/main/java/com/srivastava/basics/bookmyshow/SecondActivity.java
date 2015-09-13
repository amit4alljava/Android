package com.srivastava.basics.bookmyshow;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView tv = (TextView)this.findViewById(R.id.textView);
        String value = this.getIntent().getStringExtra("moviename");
        Bundle b = this.getIntent().getBundleExtra("bundle");
        tv.setText("Movie Name is "+b.getString("moviename")+" Price "+b.getInt("price"));
    }



}
