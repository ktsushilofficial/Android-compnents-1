package com.example.maxcomponent.FragmentWorld;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.maxcomponent.R;


public class CommunicationFragment1 extends Fragment {
    public  interface  Communicatewith1
    {
        void sendMessageFrom1(CharSequence charSequence);
    }
    Communicatewith1 listner;
EditText editText;
Button button;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_communication1, container, false);
        editText = v.findViewById(R.id.edittextfragcomm1);
        button = v.findViewById(R.id.fragComm1ComunicateBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listner.sendMessageFrom1(editText.getText());
            }
        });
        return v;
    }
    public void setTextMessage(CharSequence charSequence){
        editText.setText(charSequence);
    }
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if(context instanceof Communicatewith1)
        {
            listner = (Communicatewith1) context;

        }else
        {
            throw  new RuntimeException(context.toString() + "pleaze implement Communicatewith1 interface ");
        }
    }
}