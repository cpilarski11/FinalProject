package com.example.cwpila14.finalproject.TutorialStuff;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.widget.Button;

import com.example.cwpila14.finalproject.R;
import com.example.cwpila14.finalproject.TutorialStuff.CustomPagerAdapter;

public class TutorialActivity extends Activity {
    ViewPager viewPager;
    //CustomSwipeAdaptor adaptor;
    Button quit_tut;

    //MainActivity m = new MainActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pager_view);


        this.viewPager = (ViewPager) findViewById(R.id.view_pager);
        viewPager.setAdapter(new CustomPagerAdapter(this));


    }

    @Override
    protected void onPause() {
        super.onPause();

    }

    @Override
    protected void onResume() {
        super.onResume();

    }
}