package com.example.maxcomponent.Adapters;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.maxcomponent.Fragments.FirstTablayoutFragment;
import com.example.maxcomponent.Fragments.SecondTabLayoutFrag;
import com.example.maxcomponent.Fragments.ThirdTabLayoutFrag;

public class FirstViewPagerAdapter extends FragmentStateAdapter {


    public FirstViewPagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new FirstTablayoutFragment();
            case 1:
                return new SecondTabLayoutFrag();
            case 2:
                return new ThirdTabLayoutFrag();


        }
        return null;
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
