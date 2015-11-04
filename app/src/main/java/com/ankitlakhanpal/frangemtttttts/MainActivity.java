package com.ankitlakhanpal.frangemtttttts;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FragmentManager manager = getFragmentManager();
        FragmentTransaction transection = manager.beginTransaction();

        FragmentContainer frag=new FragmentContainer();
        transection.add(R.id.My_Layout, frag, "TAG");
        transection.commit();



    }


    public void WhenClicked(View view){

        FragmentManager manager = getFragmentManager();
        FragmentTransaction transection = manager.beginTransaction();

        BlankFragment frag12=new BlankFragment();
        transection.replace(R.id.Fragment_contaier, frag12, "TAG2wdaw");
        transection.commit();

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
}
