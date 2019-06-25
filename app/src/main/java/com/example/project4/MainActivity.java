package com.example.project4;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.project4.bottomNavigation.CalenderFragmentBottom;
import com.example.project4.contactsNavigation.ContactsFragmentBottom;
import com.example.project4.bottomNavigation.FavouriteFragmentBottom;
import com.example.project4.bottomNavigation.SettingsFragmentBottom;
import com.example.project4.home.FragmentCallTabs;
import com.example.project4.home.FragmentContactTabs;
import com.example.project4.home.FragmentFavTabs;

public class MainActivity extends AppCompatActivity {


    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;
    Toolbar toolbar;
    private Context context = MainActivity.this;
    private static final int ACTIVITY_NUM = 0;
    Dialog dialogsort, dialogsettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BottomNavigationView bottomview = findViewById(R.id.bottom_navigation);
        bottomview.setOnNavigationItemSelectedListener(navListner);
        Menu menu = bottomview.getMenu();
        MenuItem menuItem = menu.getItem(ACTIVITY_NUM);
        menuItem.setChecked(true);


        tabLayout = (TabLayout) findViewById(R.id.tablayout_id);
        viewPager = (ViewPager) findViewById(R.id.viewpager_id);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());


        //Add Fragment Here


        adapter.AddFragment(new FragmentCallTabs(), "Calls");
        adapter.AddFragment(new FragmentContactTabs(), "Contacts");
        adapter.AddFragment(new FragmentFavTabs(), "Favs");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);


        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        //Toolbar

        toolbar = findViewById(R.id.toolbar);
        this.setSupportActionBar(toolbar);


        //Dialog for Toolbar

        dialogsort = new Dialog(this);
        dialogsettings = new Dialog(this);


    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListner = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

            switch (menuItem.getItemId()) {

                case R.id.home_fav:
//                    Intent intent1 = new Intent(MainActivity.this,HomeFragmentBottom.class);
//                    startActivity(intent1);
                    Toast.makeText(MainActivity.this, "Working Home", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.calender:
                    Intent intent2 = new Intent(MainActivity.this, CalenderFragmentBottom.class);
                    startActivity(intent2);
                    Toast.makeText(MainActivity.this, "Working Calender", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.favourites:
                    Intent intent3 = new Intent(MainActivity.this, FavouriteFragmentBottom.class);
                    startActivity(intent3);
                    Toast.makeText(MainActivity.this, "Working Favourites", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.contacts:
                    Intent intent4 = new Intent(MainActivity.this, ContactsFragmentBottom.class);
                    startActivity(intent4);
                    Toast.makeText(MainActivity.this, "Working Contacts", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.settings:
                    Intent intent5 = new Intent(MainActivity.this, SettingsFragmentBottom.class);
                    startActivity(intent5);
                    Toast.makeText(MainActivity.this, "Working Settings", Toast.LENGTH_SHORT).show();
                    break;

            }

            return false;
        }
    };


    //menu for toolbar


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_toolbar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.item_1) {
            Toast.makeText(MainActivity.this, "Settings", Toast.LENGTH_SHORT).show();
        }
        if (item.getItemId() == R.id.item_2) {
            Toast.makeText(MainActivity.this, "Sort", Toast.LENGTH_SHORT).show();
            return super.onOptionsItemSelected(item);
        }
        return true;
    }



    //Show Toolbar Dialog

//    public void ShowDialogsort(View v){
//
//        ConstraintLayout constraintLayout;
//        TextView textView;
//        ImageView imageView;
//
//        dialogsort.setContentView(R.layout.dialog_toolbar_sort);
//        textView = (TextView) dialogsort.findViewById(R.id.toolbar_sort_text);
//        imageView = (ImageView) dialogsort.findViewById(R.id.toolbar_sort_img);
//        textView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                dialogsort.dismiss();
//            }
//        });
//        dialogsort.show();
//
//    }



}

