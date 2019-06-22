package com.example.project4;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {


    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout=(TabLayout) findViewById(R.id.tablayout_id);
        viewPager= (ViewPager) findViewById(R.id.viewpager_id);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());



        //Add Fragment Here


        adapter.AddFragment(new FragmentCall(),"Calls");
        adapter.AddFragment(new FragmentContact(),"Contacts");
        adapter.AddFragment(new FragmentFav(),"Favs");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);


        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        //Toolbar

        toolbar=findViewById(R.id.toolbar);
        this.setSupportActionBar(toolbar);
    }
}
