package com.example.maxcomponent.DiffComponents;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import com.example.maxcomponent.Fragments.DatePickerFragment;
import com.example.maxcomponent.Fragments.TimePickerFragmeent;
import com.example.maxcomponent.R;

import java.text.DateFormat;
import java.util.Calendar;

public class DateTimeCalenderActivity extends AppCompatActivity  implements DatePickerDialog.OnDateSetListener, TimePickerDialog.OnTimeSetListener {
Button button1,button2;
TextView textView1,textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_time_calender);

        //Calender Date Picker
        button1 = findViewById(R.id.datepicketbtn1);
        textView1 = findViewById(R.id.datetxtview1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatePickerFragment datePickerFragment = new DatePickerFragment();
                datePickerFragment.show(getSupportFragmentManager(),"date picker");
            }
        });

        //TimePicker

        button2 = findViewById(R.id.datepicketbtn2);
        textView2 = findViewById(R.id.datetxtview2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TimePickerFragmeent timePickerFragmeent = new TimePickerFragmeent();
                timePickerFragmeent.show(getSupportFragmentManager(),"time picker");
            }
        });



    }

    @Override
    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR,i);
        c.set(Calendar.MONTH,i1);
        c.set(Calendar.DAY_OF_MONTH,i2);
        String date = DateFormat.getDateInstance(DateFormat.FULL).format(c.getTime());
        textView1.setText(date);



    }

    @Override
    public void onTimeSet(TimePicker timePicker, int i, int i1) {
     textView2.setText("Hours: " + i + " Minute: " + i1);

    }
}