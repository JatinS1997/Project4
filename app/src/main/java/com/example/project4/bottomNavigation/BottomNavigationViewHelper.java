package com.example.project4.bottomNavigation;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.project4.calenderNavigation.CalenderFragmentBottom;
import com.example.project4.contactsNavigation.ContactsFragmentBottom;
import com.example.project4.MainActivity;
import com.example.project4.R;

public class BottomNavigationViewHelper {


    public static void setupBotomNavigationView(BottomNavigationView bottomNavigationView){
    }


    public static void enableNavigation(final Context context, BottomNavigationView view){

        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()){

                    case R.id.home_fav:
                        Intent intent1 = new Intent(context,MainActivity.class); //Activity_num=0
                        context.startActivity(intent1);
                        Toast.makeText(context,"Clicked it",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.calender:
                        Intent intent2 = new Intent(context, CalenderFragmentBottom.class); //Activity_num=1
                        context.startActivity(intent2);
                        break;
                    case R.id.favourites:
                        Intent intent3 = new Intent(context,FavouriteFragmentBottom.class); //Activity_num=2
                        context.startActivity(intent3);
                        break;
                    case R.id.contacts:
                        Intent intent4 = new Intent(context, ContactsFragmentBottom.class); //Activity_num=3
                        context.startActivity(intent4);
                        break;
                    case R.id.settings:
                        Intent intent5 = new Intent(context,SettingsFragmentBottom.class); //Activity_num=4
                        context.startActivity(intent5);
                        break;

                }
                return false;
            }
        });


    }
}
