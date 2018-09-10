package com.example.zino.actionbarapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class MyPagerAdapter extends FragmentStatePagerAdapter{

    Fragment[] fragments=new Fragment[3];

    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
        fragments[0]=new RedFragment();
        fragments[1]=new YellowFragment();
        fragments[2]=new GreenFragment();
    }

    /*인수로 넘어온 i 번째 프레그먼트를 반환해줌*/
    public Fragment getItem(int i) {
        return fragments[i];
    }

    /*총 몇페이지 인지 반환하는 메서드*/
    public int getCount() {
        return fragments.length;
    }
}
