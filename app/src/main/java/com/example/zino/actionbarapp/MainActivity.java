package com.example.zino.actionbarapp;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;


public class MainActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener{
    String TAG=this.getClass().getName();
    ViewPager viewPager;
    MyPagerAdapter myPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("민쌤닷컴");

        myPagerAdapter = new MyPagerAdapter(getSupportFragmentManager());
        viewPager =(ViewPager) findViewById(R.id.viewPager);
        viewPager.setAdapter(myPagerAdapter);
        viewPager.addOnPageChangeListener(this);
    }

    public void next() {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.friends:next();break;
            case R.id.chat:;break;
            case R.id.store:;break;
            case R.id.settings:;break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onPageScrolled(int i, float v, int i1) {
        //Log.d(TAG,"onPageScrolled("+i+")");
    }

    @Override
    public void onPageSelected(int i) {
        Log.d(TAG,"onPageSelected("+i+")");
    }

    @Override
    public void onPageScrollStateChanged(int i) {
        //Log.d(TAG,"onPageScrollStateChanged("+i+")");
    }

    public void page(View view){
        switch (view.getId()){
            case R.id.bt_red:viewPager.setCurrentItem(0);break;
            case R.id.bt_yellow:viewPager.setCurrentItem(1);break;
            case R.id.bt_green:viewPager.setCurrentItem(2);break;
        }
    }

}
