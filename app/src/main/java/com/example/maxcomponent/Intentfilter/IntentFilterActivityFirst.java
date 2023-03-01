package com.example.maxcomponent.Intentfilter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.maxcomponent.R;

public class IntentFilterActivityFirst extends AppCompatActivity {

Button buttonsend,buttonView,buttonbrowse;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_filter_first);
        buttonsend = findViewById(R.id.IFAsendButton);
        buttonView = findViewById(R.id.IFAbuttonView);
        buttonbrowse = findViewById(R.id.IFAbrouseView);

        buttonsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);

                intent.setType("text/plain");

                intent.putExtra(Intent.EXTRA_EMAIL, "niranjantest@gmail.com");
                intent.putExtra(Intent.EXTRA_SUBJECT, "This is a dummy message");
                intent.putExtra(Intent.EXTRA_TEXT, "Dummy test message");
                startActivity(intent);
            }
        });
        buttonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                startActivity(intent);

            }
        });
        buttonbrowse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (Intent.ACTION_VIEW, Uri.parse("http://androidium.org"));
                startActivity(intent);
            }
        });
    }
}