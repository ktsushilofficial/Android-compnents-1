package com.example.maxcomponent.FragmentWorld;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.example.maxcomponent.R;
import com.google.android.material.appbar.MaterialToolbar;

public class CommunicationFragActivity extends AppCompatActivity implements  CommunicationFragment1.Communicatewith1,CommunicationFragment2.Communicatewith2 {
FrameLayout frameLayout1 , frameLayout2;
CommunicationFragment1 communicationFragment1;
CommunicationFragment2 communicationFragment2;
    MaterialToolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_communication_frag);

        toolbar = findViewById(R.id.toolbarfragComm);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        communicationFragment1 = new CommunicationFragment1();
        communicationFragment2 = new CommunicationFragment2();

        frameLayout1 = findViewById(R.id.fragCommFL1);
        frameLayout2 = findViewById(R.id.fragCommFL2);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragCommFL1,communicationFragment1).replace(R.id.fragCommFL2,communicationFragment2).commit();

    }

    @Override
    public void sendMessageFrom1(CharSequence charSequence) {
        communicationFragment2.setTextMessage(charSequence);
    }

    @Override
    public void sendMessageFrom2(CharSequence charSequence) {
       communicationFragment1.setTextMessage(charSequence);
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }


        return super.onOptionsItemSelected(item);
    }
}