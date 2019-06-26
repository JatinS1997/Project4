package com.example.project4.home;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.example.project4.R;

public class ContactDialog extends AppCompatActivity {

    Button button;
    ConstraintLayout constraintLayout;


    private AnimationDrawable animationDrawable;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_contact);


//        button = (Button) findViewById(R.id.Call);
        constraintLayout = (ConstraintLayout) findViewById(R.id.customshape);
        AnimationDrawable animationDrawable = (AnimationDrawable) constraintLayout.getBackground();
        animationDrawable.setEnterFadeDuration(2000);
        animationDrawable.setExitFadeDuration(4000);
        animationDrawable.start();
    }

//    @Override
//    protected void onResume() {
//        super.onResume();
//        if (animationDrawable != null && !animationDrawable.isRunning()) {
//            // start the animation
//            animationDrawable.start();
//        }
//
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        if (animationDrawable != null && animationDrawable.isRunning()) {
//            // stop the animation
//            animationDrawable.stop();
//        }
//    }
}
