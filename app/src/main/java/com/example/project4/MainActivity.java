package com.example.project4;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {


    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BottomNavigationView bottomview = findViewById(R.id.bottom_navigation);
        bottomview.setOnNavigationItemSelectedListener(navListner);


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

    private BottomNavigationView.OnNavigationItemSelectedListener navListner = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            Fragment selectedFragment = null;

            switch (menuItem.getItemId()){


                case R.id.calender:
                    selectedFragment = new CalenderFragmentBottom();
                    break;
                case R.id.favourites:
                    selectedFragment = new FavouriteFragmentBottom();
                    break;
                case R.id.contacts:
                    selectedFragment = new ContactsFragmentBottom();
                    break;
                case R.id.settings:
                    selectedFragment = new SettingsFragmentBottom();
                    break;

            }

            getSupportFragmentManager().beginTransaction().replace(R.id.home,selectedFragment).commit();

            return true;
        }
    };
}
