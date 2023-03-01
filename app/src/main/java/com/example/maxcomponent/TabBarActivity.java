package com.example.maxcomponent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.maxcomponent.Adapters.FirstViewPagerAdapter;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class TabBarActivity extends AppCompatActivity {
ViewPager2 viewPager2 ;
TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_bar);
        viewPager2 = findViewById(R.id.viewpagerTabActivity);
        tabLayout = findViewById(R.id.tablayout);
        FirstViewPagerAdapter firstViewPagerAdapter = new FirstViewPagerAdapter(getSupportFragmentManager(),getLifecycle());
        viewPager2.setAdapter(firstViewPagerAdapter);

tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        viewPager2.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
});
viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        super.onPageScrolled(position, positionOffset, positionOffsetPixels);
    }

    @Override
    public void onPageSelected(int position) {
        super.onPageSelected(position);
        tabLayout.selectTab(tabLayout.getTabAt(position));
    }

    @Override
    public void onPageScrollStateChanged(int state) {
        super.onPageScrollStateChanged(state);
    }
});
    }



}