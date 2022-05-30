package com.example.viewpagerjava;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import com.example.viewpagerjava.Adapter.ViewPagerAdapter;
import com.example.viewpagerjava.Fragment.PageOneFragment;
import com.example.viewpagerjava.Fragment.PageTwoFragment;
import com.google.android.material.tabs.TabLayout;

public class ViewPegerActivity extends AppCompatActivity {
    ViewPagerAdapter viewPagerAdapter;
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpeger);
        initView();
    }
    void initView(){
        viewPager=findViewById(R.id.viewpeger);
        viewPagerAdapter=new ViewPagerAdapter(getSupportFragmentManager());

        viewPagerAdapter.Add(new PageOneFragment(),"Page 1");
        viewPagerAdapter.Add(new PageTwoFragment(),"Page 2");
        viewPager.setAdapter(viewPagerAdapter);
        tabLayout=findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);
    }
}