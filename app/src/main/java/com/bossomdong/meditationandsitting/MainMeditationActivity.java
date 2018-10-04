package com.bossomdong.meditationandsitting;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.annotation.Nullable;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainMeditationActivity extends AppCompatActivity {

    Button one,two,tree,four,five,six;
    /*private Toolbar toolbar1;
    private ActionBarDrawerToggle toggle;
    private DrawerLayout drawerLayout;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_meditation);


         one = findViewById(R.id.btn_one);
         two = findViewById(R.id.btn_two);
         tree = findViewById(R.id.btn_tree);
         four = findViewById(R.id.btn_four);
         five = findViewById(R.id.btn_five);
         six = findViewById(R.id.btn_six);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewPage1();
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewPage2();
            }
        });

        tree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewPage3();
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewPage4();
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewPage5();
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewPage6();
            }
        });


  /*      toolbar1 = findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar1);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        drawerLayout = findViewById(R.id.drawer_layout);
        toggle = new ActionBarDrawerToggle(MainMeditationActivity.this,drawerLayout,R.string.drawer_open,R.string.drawer_close);

        drawerLayout.addDrawerListener(toggle);
    }
    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState){
        super.onPostCreate(savedInstanceState);
        toggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig){
       super.onConfigurationChanged(newConfig);
       toggle.onConfigurationChanged(newConfig);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if(toggle.onOptionsItemSelected(item))
            return true;
        return super.onOptionsItemSelected(item);*/
    }
    private void openNewPage1(){
        Intent intent = new Intent(this,pageoneActivity.class);
        startActivity(intent);

    }
    private void openNewPage2(){
        Intent intent = new Intent(this,page2Activity.class);
        startActivity(intent);

    }
    private void openNewPage3() {
        Intent intent = new Intent(this, page3Activity.class);
        startActivity(intent);
    }
    private void openNewPage4() {
        Intent intent = new Intent(this, page4Activity.class);
        startActivity(intent);
    }
    private void openNewPage5() {
        Intent intent = new Intent(this, page5Activity.class);
        startActivity(intent);
    }
    private void openNewPage6() {
        Intent intent = new Intent(this, page6Activity.class);
        startActivity(intent);
    }
}
