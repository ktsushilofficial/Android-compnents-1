package com.example.maxcomponent;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.example.maxcomponent.Fragments.FirstTablayoutFragment;
import com.example.maxcomponent.Fragments.SecondTabLayoutFrag;
import com.example.maxcomponent.Fragments.ThirdTabLayoutFrag;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class BottomNavigationActivity extends AppCompatActivity {
FrameLayout frameLayout;
BottomNavigationView bottomNavigationActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation);
        frameLayout = findViewById(R.id.frameLayoutbottomnavActivity);
        bottomNavigationActivity = findViewById(R.id.bottomNavigationView);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayoutbottomnavActivity,new FirstTablayoutFragment());
        fragmentTransaction.commit();

        bottomNavigationActivity.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch ( item.getItemId()){
                    case R.id.bottomnavfirst:
                       replaceFragmwnt(new FirstTablayoutFragment());
                       return  true;
                    case R.id.bottomnavSecond:
                        replaceFragmwnt(new SecondTabLayoutFrag());
                        return  true;
                    case R.id.bottomnavThird:
                        replaceFragmwnt(new ThirdTabLayoutFrag());
                        return  true;

                }
                return false;
            }
        });
    }

    void replaceFragmwnt(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayoutbottomnavActivity,fragment);
        fragmentTransaction.commit();

    }
}