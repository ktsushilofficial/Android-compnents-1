package com.example.maxcomponent.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.maxcomponent.Models.CountryFlag;
import com.example.maxcomponent.R;

import java.util.ArrayList;

public class CountryAdapter  extends ArrayAdapter<CountryFlag> {
    public  CountryAdapter(Context context, ArrayList<CountryFlag> arrayList)
    {
        super(context,0,arrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position,convertView,parent);
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position,convertView,parent);
    }

    private  View initView(int position,  View convertView,  ViewGroup parent)
    {
        if (convertView == null)
        {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_spineercountries,parent,false);
        }
        ImageView imageView = convertView.findViewById(R.id.spineeritemimgview);
        TextView textView = convertView.findViewById(R.id.spineeritemtxtview);
       CountryFlag countryFlag = getItem(position);
       imageView.setImageResource(countryFlag.getmFlagImage());
       textView.setText(countryFlag.getmCounty());
        return  convertView;
    }
}
