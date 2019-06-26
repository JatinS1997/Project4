package com.example.project4.contactsNavigation;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.project4.calenderNavigation.CalenderFragmentBottom;
import com.example.project4.bottomNavigation.FavouriteFragmentBottom;
import com.example.project4.bottomNavigation.SettingsFragmentBottom;
import com.example.project4.MainActivity;
import com.example.project4.R;
import com.example.project4.databinding.BottomContactsBinding;

public class ContactsFragmentBottom extends AppCompatActivity {
    private Context context = ContactsFragmentBottom.this;
    private static final int ACTIVITY_NUM = 3;
    private ClickHandler clickHandler;
    private Contacts_DB contacts_db;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bottom_contacts);

        BottomNavigationView bottomview = findViewById(R.id.bottom_navigation);
        bottomview.setOnNavigationItemSelectedListener(navListner);
        Menu menu = bottomview.getMenu();
        MenuItem menuItem = menu.getItem(ACTIVITY_NUM);
        menuItem.setChecked(true);




        // Data Binding

        BottomContactsBinding bottomContactsBinding = DataBindingUtil.setContentView(this,R.layout.bottom_contacts);



        contacts_db = new Contacts_DB();
        contacts_db.setFirstname("Jatin");
        contacts_db.setLastname("Sharma");
        bottomContactsBinding.setContact(contacts_db);

//        Contacts_DB contacts_db = new Contacts_DB("Jatin","Sharma");
//        bottomContactsBinding.setContact(contacts_db);


        //clickhandler for DataBinding Layout Button

        clickHandler = new ClickHandler(bottomContactsBinding.secondLayout.firstnameEnter,bottomContactsBinding.secondLayout.lastnameEnter);
        bottomContactsBinding.secondLayout.setClickhandler(clickHandler);
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
                    Intent intent1 = new Intent(context,MainActivity.class);
                    startActivity(intent1);
                    Toast.makeText(context,"Working Home",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.calender:
                    Intent intent2 = new Intent(context, CalenderFragmentBottom.class);
                    startActivity(intent2);
                    Toast.makeText(context,"Working Calender",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.favourites:
                    Intent intent3 = new Intent(context,FavouriteFragmentBottom.class);
                    startActivity(intent3);
                    Toast.makeText(context,"Working Favourites",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.contacts:
//                Intent intent4 = new Intent(context, ContactsFragmentBottom.class);
//                startActivity(intent4);
                    Toast.makeText(context,"Working Contacts",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.settings:
                    Intent intent5 = new Intent(context,SettingsFragmentBottom.class);
                    startActivity(intent5);
                    Toast.makeText(context,"Working Settings",Toast.LENGTH_SHORT).show();
                    break;

            }

            return false;
        }
    };



    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(ContactsFragmentBottom.this, MainActivity.class));
        finish();
    }


    //Click Handler for 2nd Layout of Data Binding in Contacts Tab

    public class ClickHandler {

        private EditText fname,lname;

        public ClickHandler(EditText fname,EditText lname)

        {
            this.fname = fname;
            this.lname = lname;


        }

        public void updateUser(View v)
        {
            contacts_db.setFirstname(fname.getText().toString());
            contacts_db.setLastname(lname.getText().toString());
            fname.setText("");
            lname.setText("");



        }

    }

}
