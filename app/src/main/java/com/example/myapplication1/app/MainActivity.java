package com.example.myapplication1.app;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button coolButton = (Button) findViewById(R.id.button1);
        coolButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Hi!", Toast.LENGTH_LONG).show();
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public void onClickMenuOther(MenuItem item){
        Toast toast = Toast.makeText(this,"Other Click",Toast.LENGTH_LONG);
        toast.show();
    }

    public void onClickMenuExit(MenuItem item){
        finish();
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        boolean handled = false;
        if (id == R.id.action_settings) {
            return true;
        }
        switch (id){
            case R.id.action_other:
                onClickMenuOther(item);
                handled = true;
                break;
            case R.id.action_exit:
                onClickMenuExit(item);
                handled = true;
                break;
            case R.id.action_showActivity2:
                onclickMenuShowActivity2(item);
                handled = true;
                break;

            default:
                handled = super.onOptionsItemSelected(item);

        }
        return handled;
    }

    private void onclickMenuShowActivity2(MenuItem item) {
        Intent intent = new Intent(this,Activity_2.class);
        startActivity(intent);

    }
}
