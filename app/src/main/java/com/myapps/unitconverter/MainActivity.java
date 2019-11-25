package com.myapps.unitconverter;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends FragmentActivity {
    private ViewPager viewpager;
    private ViewPagerAdapter viewPagerAdapter;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewpager = findViewById(R.id.view_pager);
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), 0);
        viewpager.setAdapter(viewPagerAdapter);

        tabLayout = findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewpager);

    }
}
