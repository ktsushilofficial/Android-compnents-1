package com.example.maxcomponent.DiffComponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.maxcomponent.Fragments.SimpleDialogCallBackFragment;
import com.example.maxcomponent.Fragments.SimpleDialogFragment1;
import com.example.maxcomponent.R;

public class DilogAlertActivity extends AppCompatActivity implements SimpleDialogCallBackFragment.SimpleDialogListner {
Button button1,button2;
TextView textView1;
private int counter ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dilog_alert);
        button1 = findViewById(R.id.dialogActivitybtn1);



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SimpleDialogFragment1 simpleDialogFragment1 = new SimpleDialogFragment1();
                simpleDialogFragment1.show(getSupportFragmentManager(),"simple dialog");
            }
        });

        button2 = findViewById(R.id.dialogActivitybtn2);
        textView1 = findViewById(R.id.dialogActivitytext1);
// call back simple dialog
  button2.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
          SimpleDialogCallBackFragment simpleDialogCallBackFragment = new SimpleDialogCallBackFragment();
          simpleDialogCallBackFragment.show(getSupportFragmentManager(),"call back dialog");
      }
  });
         counter = 0;
        textView1.setText(String.valueOf(counter));
    }

    @Override
    public void increaseCount() {
       counter = counter + 1;
        textView1.setText(String.valueOf(counter));
    }
}