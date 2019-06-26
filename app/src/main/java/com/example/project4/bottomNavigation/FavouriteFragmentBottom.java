package com.example.project4.bottomNavigation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.transition.TransitionManager;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


import com.example.project4.calenderNavigation.CalenderFragmentBottom;
import com.example.project4.contactsNavigation.ContactsFragmentBottom;
import com.example.project4.MainActivity;
import com.example.project4.R;

public class FavouriteFragmentBottom extends AppCompatActivity {
    private Context context = FavouriteFragmentBottom.this;
    private static final int ACTIVITY_NUM = 2;

    private ConstraintLayout constraintLayout;
    private ConstraintSet constraintSet1 = new ConstraintSet();
    private ConstraintSet constraintSet2 = new ConstraintSet();
    private boolean altLayout;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bottom_favourites);
//        setupBottomNavigationView();
        BottomNavigationView bottomview = findViewById(R.id.bottom_navigation);
        bottomview.setOnNavigationItemSelectedListener(navListner);
        Menu menu = bottomview.getMenu();
        MenuItem menuItem = menu.getItem(ACTIVITY_NUM);
        menuItem.setChecked(true);



        //Constraints Animation

        constraintLayout= findViewById(R.id.home_fav);
        constraintSet1.clone(constraintLayout);
        constraintSet2.clone(this,R.layout.bottom_favourites2);
    }


    public void click(View v){
        Log.d("click", "click: Clicked");
        TransitionManager.beginDelayedTransition(constraintLayout);

        if(!altLayout){
            constraintSet2.applyTo(constraintLayout);
            altLayout=true;

        }else{
            constraintSet1.applyTo(constraintLayout);
            altLayout=false;
        }

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
                    Intent intent1 = new Intent(FavouriteFragmentBottom.this,MainActivity.class);
                    startActivity(intent1);
                    Toast.makeText(FavouriteFragmentBottom.this,"Working Home",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.calender:
                    Intent intent2 = new Intent(FavouriteFragmentBottom.this, CalenderFragmentBottom.class);
                    startActivity(intent2);
                    Toast.makeText(FavouriteFragmentBottom.this,"Working Calender",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.favourites:
//                    Intent intent3 = new Intent(FavouriteFragmentBottom.this,FavouriteFragmentBottom.class);
//                    startActivity(intent3);
                    Toast.makeText(FavouriteFragmentBottom.this,"Working Favourites",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.contacts:
                    Intent intent4 = new Intent(FavouriteFragmentBottom.this, ContactsFragmentBottom.class);
                    startActivity(intent4);
                    Toast.makeText(FavouriteFragmentBottom.this,"Working Contacts",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.settings:
                    Intent intent5 = new Intent(FavouriteFragmentBottom.this,SettingsFragmentBottom.class);
                    startActivity(intent5);
                    Toast.makeText(FavouriteFragmentBottom.this,"Working Settings",Toast.LENGTH_SHORT).show();
                    break;

            }

            return false;
        }
    };

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(FavouriteFragmentBottom.this, MainActivity.class));
        finish();
    }
}
