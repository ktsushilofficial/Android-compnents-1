package com.example.maxcomponent.Fragments;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;

public class SimpleDialogCallBackFragment  extends AppCompatDialogFragment {
    private  SimpleDialogListner listner;

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Simple Call Back Alert").setMessage("Do you want to increase count?").setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
               listner.increaseCount();
            }
        }).setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        return builder.create();
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try {
 listner = (SimpleDialogListner) context;
        }catch (ClassCastException e)
        {
            throw  new ClassCastException(e.getLocalizedMessage());
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    public interface SimpleDialogListner
    {
        void increaseCount();
    }
}
