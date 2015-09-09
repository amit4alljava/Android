package com.srivastava.basic.demo3;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity { //implements  View.OnClickListener  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b2  = (Button)this.findViewById(R.id.button2);
        Button okButton  = (Button)this.findViewById(R.id.okbt);
        // Register Event with Button
        //b2.setOnClickListener(this);
        //okButton.setOnClickListener(this);
        View.OnClickListener l = new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Toast.makeText(MainActivity.this.getApplicationContext(),"Hello U Click On Cancel",Toast.LENGTH_SHORT).show();

    }

};
   // b2.setOnClickListener((v)->printOk());

b2.setOnClickListener(l);
        okButton.setOnClickListener(new View.OnClickListener(){
          public void onClick(View v){
                printOk();
          }

        });
//View.OnClickListener l2 = (v)->printOk();
      //  okButton.setOnClickListener(l2);
    }

    /*// V hold the Current Button Object
    @Override
    public void onClick(View v){
        int currentButtonId = v.getId();
        if(currentButtonId==R.id.button2){
            TextView tv = (TextView)this.findViewById(R.id.textView);
            tv.setText("U Click on Cancel Button");
            Toast.makeText(this.getApplicationContext(),"Hello U Click On Cancel",Toast.LENGTH_SHORT).show();
        }
        else
        if(currentButtonId==R.id.okbt) {
            Toast.makeText(this.getApplicationContext(),"Hello U Click On Ok Button",Toast.LENGTH_SHORT).show();
        }

    }*/


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

    public void show(View v){
        TextView tv = (TextView)this.findViewById(R.id.textView);
        tv.setText("Hello U Click on Button");

    }

    private void printOk(){
        Toast.makeText(this.getApplicationContext(),"Hello U Click On Ok Button",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}
