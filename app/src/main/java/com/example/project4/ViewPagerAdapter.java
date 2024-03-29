package com.example.project4;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private final List<Fragment> FirstFragment = new ArrayList<>();
    private final List<String> FirstTitles = new ArrayList<>();


    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        return FirstFragment.get(i);
    }

    @Override
    public int getCount() {
        return FirstTitles.size();
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return FirstTitles.get(position);
    }


    public void AddFragment(Fragment fragment,String title){


        FirstFragment.add(fragment);
        FirstTitles.add(title);
    }






}
