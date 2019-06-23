package com.example.project4;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.project4.BottomNavigation.CalenderFragmentBottom;
import com.example.project4.BottomNavigation.ContactsFragmentBottom;
import com.example.project4.BottomNavigation.FavouriteFragmentBottom;
import com.example.project4.BottomNavigation.HomeFragmentBottom;
import com.example.project4.BottomNavigation.SettingsFragmentBottom;
import com.example.project4.Home.FragmentCallTabs;
import com.example.project4.Home.FragmentContactTabs;
import com.example.project4.Home.FragmentFavTabs;

public class MainActivity extends AppCompatActivity {


    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        BottomNavigationView bottomview = findViewById(R.id.bottom_navigation);
//        bottomview.setOnNavigationItemSelectedListener(navListner);


        tabLayout=(TabLayout) findViewById(R.id.tablayout_id);
        viewPager= (ViewPager) findViewById(R.id.viewpager_id);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());



        //Add Fragment Here


        adapter.AddFragment(new FragmentCallTabs(),"Calls");
        adapter.AddFragment(new FragmentContactTabs(),"Contacts");
        adapter.AddFragment(new FragmentFavTabs(),"Favs");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);


        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        //Toolbar

        toolbar=findViewById(R.id.toolbar);
        this.setSupportActionBar(toolbar);
    }

//    private BottomNavigationView.OnNavigationItemSelectedListener navListner = new BottomNavigationView.OnNavigationItemSelectedListener() {
//        @Override
//        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
//
//            switch (menuItem.getItemId()){
//
//                case R.id.home:
//                    Intent intent1 = new Intent(MainActivity.this,HomeFragmentBottom.class);
//                    startActivity(intent1);
//                    break;
//                case R.id.calender:
//                    Intent intent2 = new Intent(MainActivity.this,CalenderFragmentBottom.class);
//                    startActivity(intent2);
//                    break;
//                case R.id.favourites:
//                    Intent intent3 = new Intent(MainActivity.this,FavouriteFragmentBottom.class);
//                    startActivity(intent3);
//                    break;
//                case R.id.contacts:
//                    Intent intent4 = new Intent(MainActivity.this,ContactsFragmentBottom.class);
//                    startActivity(intent4);
//                    break;
//                case R.id.settings:
//                    Intent intent5 = new Intent(MainActivity.this,SettingsFragmentBottom.class);
//                    startActivity(intent5);
//                    break;
//
//            }
//
//            return false;
//        }
//    };


}
