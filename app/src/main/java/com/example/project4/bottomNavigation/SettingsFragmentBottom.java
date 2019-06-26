package com.example.project4.bottomNavigation;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.project4.calenderNavigation.CalenderFragmentBottom;
import com.example.project4.contactsNavigation.ContactsFragmentBottom;
import com.example.project4.MainActivity;
import com.example.project4.R;

public class SettingsFragmentBottom extends AppCompatActivity {
    private Context context = SettingsFragmentBottom.this;
    private static final int ACTIVITY_NUM = 4;


    private AnimationDrawable animationDrawable;
    ConstraintLayout constraintLayout;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bottom_settings);
//        setupBottomNavigationView();
        BottomNavigationView bottomview = findViewById(R.id.bottom_navigation);
        bottomview.setOnNavigationItemSelectedListener(navListner);
        Menu menu = bottomview.getMenu();
        MenuItem menuItem = menu.getItem(ACTIVITY_NUM);
        menuItem.setChecked(true);

        constraintLayout = (ConstraintLayout) findViewById(R.id.customshape);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();

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
                    Intent intent1 = new Intent(SettingsFragmentBottom.this,MainActivity.class);
                    startActivity(intent1);
                    Toast.makeText(SettingsFragmentBottom.this,"Working Home",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.calender:
                    Intent intent2 = new Intent(SettingsFragmentBottom.this, CalenderFragmentBottom.class);
                    startActivity(intent2);
                    Toast.makeText(SettingsFragmentBottom.this,"Working Calender",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.favourites:
                    Intent intent3 = new Intent(SettingsFragmentBottom.this,FavouriteFragmentBottom.class);
                    startActivity(intent3);
                    Toast.makeText(SettingsFragmentBottom.this,"Working Favourites",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.contacts:
                    Intent intent4 = new Intent(SettingsFragmentBottom.this, ContactsFragmentBottom.class);
                    startActivity(intent4);
                    Toast.makeText(SettingsFragmentBottom.this,"Working Contacts",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.settings:
//                    Intent intent5 = new Intent(SettingsFragmentBottom.this,SettingsFragmentBottom.class);
//                    startActivity(intent5);
                    Toast.makeText(SettingsFragmentBottom.this,"Working Settings",Toast.LENGTH_SHORT).show();
                    break;

            }

            return false;
        }
    };

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(SettingsFragmentBottom.this, MainActivity.class));
        finish();
    }
}
