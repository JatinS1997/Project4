package com.example.project4.calenderNavigation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CalendarView;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.project4.MainActivity;
import com.example.project4.R;
import com.example.project4.bottomNavigation.FavouriteFragmentBottom;
import com.example.project4.bottomNavigation.SettingsFragmentBottom;
import com.example.project4.contactsNavigation.ContactsFragmentBottom;

public class CalenderViewActivity extends AppCompatActivity {


    private CalendarView mCalenderView;

    private Context context = CalenderViewActivity.this;
    private static final int ACTIVITY_NUM = 1;




    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bottom_calender_view);



        BottomNavigationView bottomview = findViewById(R.id.bottom_navigation);
        bottomview.setOnNavigationItemSelectedListener(navListner);
        Menu menu = bottomview.getMenu();
        MenuItem menuItem = menu.getItem(ACTIVITY_NUM);
        menuItem.setChecked(true);


        //calender background images
//        ImageView imageview = (ImageView) findViewById(R.id.backgroundblurred);


                mCalenderView = (CalendarView) findViewById(R.id.calendarView2);


        mCalenderView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {

                String date = (dayOfMonth+1)+"/"+month+"/"+year;

                Intent intent = new Intent(CalenderViewActivity.this, CalenderFragmentBottom.class);
                intent.putExtra("date",date);
                startActivity(intent);

            }
        });

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListner = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

            switch (menuItem.getItemId()){

                case R.id.home_fav:
                    Intent intent1 = new Intent(context, MainActivity.class);
                    startActivity(intent1);
                    Toast.makeText(context,"Working Home",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.calender:
//                    Intent intent2 = new Intent(CalenderFragmentBottom.this,CalenderFragmentBottom.class);
//                    startActivity(intent2);
                    Toast.makeText(context,"Working Calender",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.favourites:
                    Intent intent3 = new Intent(context, FavouriteFragmentBottom.class);
                    startActivity(intent3);
                    Toast.makeText(context,"Working Favourites",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.contacts:
                    Intent intent4 = new Intent(context, ContactsFragmentBottom.class);
                    startActivity(intent4);
                    Toast.makeText(context,"Working Contacts",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.settings:
                    Intent intent5 = new Intent(context, SettingsFragmentBottom.class);
                    startActivity(intent5);
                    Toast.makeText(context,"Working Settings",Toast.LENGTH_SHORT).show();
                    break;

            }

            return false;
        }
    };
}
