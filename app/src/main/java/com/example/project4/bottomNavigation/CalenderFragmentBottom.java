package com.example.project4.bottomNavigation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.project4.contactsNavigation.ContactsFragmentBottom;
import com.example.project4.MainActivity;
import com.example.project4.R;

public class CalenderFragmentBottom extends AppCompatActivity {
    private Context context = CalenderFragmentBottom.this;
    private static final int ACTIVITY_NUM = 1;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bottom_calender);
//        setupBottomNavigationView();
        BottomNavigationView bottomview = findViewById(R.id.bottom_navigation);
        bottomview.setOnNavigationItemSelectedListener(navListner);
        Menu menu = bottomview.getMenu();
        MenuItem menuItem = menu.getItem(ACTIVITY_NUM);
        menuItem.setChecked(true);
    }

//    private void setupBottomNavigationView(){
//        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
//        BottomNavigationViewHelper.enableNavigation(context, bottomNavigationView);
//        Menu menu = bottomNavigationView.getMenu();
//        MenuItem menuItem = menu.getItem(ACTIVITY_NUM);
//        menuItem.setChecked(true);
//
//
//
//    }
    private BottomNavigationView.OnNavigationItemSelectedListener navListner = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

            switch (menuItem.getItemId()){

                case R.id.home_fav:
                    Intent intent1 = new Intent(CalenderFragmentBottom.this,MainActivity.class);
                    startActivity(intent1);
                    Toast.makeText(CalenderFragmentBottom.this,"Working Home",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.calender:
//                    Intent intent2 = new Intent(CalenderFragmentBottom.this,CalenderFragmentBottom.class);
//                    startActivity(intent2);
                    Toast.makeText(CalenderFragmentBottom.this,"Working Calender",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.favourites:
                    Intent intent3 = new Intent(CalenderFragmentBottom.this,FavouriteFragmentBottom.class);
                    startActivity(intent3);
                    Toast.makeText(CalenderFragmentBottom.this,"Working Favourites",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.contacts:
                    Intent intent4 = new Intent(CalenderFragmentBottom.this, ContactsFragmentBottom.class);
                    startActivity(intent4);
                    Toast.makeText(CalenderFragmentBottom.this,"Working Contacts",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.settings:
                    Intent intent5 = new Intent(CalenderFragmentBottom.this,SettingsFragmentBottom.class);
                    startActivity(intent5);
                    Toast.makeText(CalenderFragmentBottom.this,"Working Settings",Toast.LENGTH_SHORT).show();
                    break;

            }

            return false;
        }
    };

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(CalenderFragmentBottom.this, MainActivity.class));
        finish();
    }
}
