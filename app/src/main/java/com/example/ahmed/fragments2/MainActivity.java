package com.example.ahmed.fragments2;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v4.view.ViewPager;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MAinActivity";

    private SectionPageAdapter mSectionPageAdapter;

    private ViewPager mViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSectionPageAdapter = new SectionPageAdapter(getSupportFragmentManager());

        mViewPager = findViewById(R.id.container);

        setupViewPager(mViewPager);

        TabLayout tabLayout = findViewById(R.id.tabs);

        tabLayout.setupWithViewPager(mViewPager);


    }

    private void setupViewPager(ViewPager viewPager){
        SectionPageAdapter adapter = new SectionPageAdapter(getSupportFragmentManager());

        adapter.addFragment(new Tab1Fragment(),"TAB1");
        adapter.addFragment(new Tab2Fragment(),"TAB2");
        adapter.addFragment(new Tab3Fragment(),"TAB3");
        viewPager.setAdapter(adapter);

    }







}
