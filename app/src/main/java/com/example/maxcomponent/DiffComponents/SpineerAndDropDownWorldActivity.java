package com.example.maxcomponent.DiffComponents;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.maxcomponent.Adapters.CountryAdapter;
import com.example.maxcomponent.Models.CountryFlag;
import com.example.maxcomponent.R;
import com.google.android.material.appbar.MaterialToolbar;

import java.util.ArrayList;

public class SpineerAndDropDownWorldActivity extends AppCompatActivity {
    MaterialToolbar toolbar;
AutoCompleteTextView autoCompleteTextView;
Spinner  spinner,spinner2;
CountryAdapter countryAdapter;
ArrayList<CountryFlag> countryFlagArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spineer_and_drop_down_world);
        toolbar = findViewById(R.id.spinnerActivityToolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle(getResources().getText(R.string.Spineer_Drop_Activity));
        setTitle("Spinner");

        //Drop down menu using Autocomplete text kind of spineer
        autoCompleteTextView = findViewById(R.id.spineerautoText);
        //layout is used is custom
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,R.layout.item_language,getResources().getStringArray(R.array.languages));
        autoCompleteTextView.setAdapter(arrayAdapter);

        //spineer normal
        spinner = findViewById(R.id.spineerindropActivity);
        ArrayAdapter<CharSequence> arrayAdaptersp = ArrayAdapter.createFromResource(this, R.array.spineer1, android.R.layout.simple_spinner_item);
        arrayAdaptersp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdaptersp);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String choice = adapterView.getItemAtPosition(i).toString();
                Toast.makeText(getApplicationContext(),choice,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
       //Custom Spineer
        spinner2 = findViewById(R.id.spineerindropActivity2);
        initCountryList();
        countryAdapter = new CountryAdapter(this,countryFlagArrayList);
        spinner2.setAdapter(countryAdapter);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                CountryFlag countryFlag = (CountryFlag) adapterView.getItemAtPosition(i);
                Toast.makeText(getApplicationContext(),countryFlag.getmCounty(),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }

void initCountryList()
{
    countryFlagArrayList = new ArrayList<>();
    countryFlagArrayList.add(new CountryFlag("India",R.drawable.indiaflag));
    countryFlagArrayList.add(new CountryFlag("USA",R.drawable.indiaflag));
    countryFlagArrayList.add(new CountryFlag("Germany",R.drawable.indiaflag));
    countryFlagArrayList.add(new CountryFlag("France",R.drawable.indiaflag));
}



    // for back button
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