package com.example.maxcomponent.DiffComponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;

import com.example.maxcomponent.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;

public class EditTextActivity extends AppCompatActivity {
TextInputLayout tilName,tilPhone,tilEmail,tilPassword;
EditText etName,etPhone,etEmail,etPassword;
MaterialButton cleaBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);
        tilName = findViewById(R.id.til_name);
       tilEmail = findViewById(R.id.til_email);
       tilPassword = findViewById(R.id.til_password);
       etName = findViewById(R.id.et_nme);
       etPhone = findViewById(R.id.et_mobile);
       etEmail = findViewById(R.id.et_email);
       etPassword = findViewById(R.id.et_password);
       cleaBtn = findViewById(R.id.bt_clearall);

       etName.addTextChangedListener(new TextWatcher() {
           @Override
           public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

           }

           @Override
           public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
    if (!charSequence.toString().isEmpty() && !charSequence.toString().matches("[a-zA-Z]+"))
    {
        //if contain numeric
        tilName.setError("Allow Only Characters");
    }
    else{
        //hide error
        tilName.setError(null);
    }
           }

           @Override
           public void afterTextChanged(Editable editable) {

           }
       });

       tilEmail.setEndIconOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               etEmail.getText().clear();
           }
       });

       cleaBtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               etEmail.getText().clear();
               etName.getText().clear();
               etPassword.getText().clear();
               etPhone.getText().clear();
               //clear fous
               etPassword.clearFocus();
               etPhone.clearFocus();
               etName.clearFocus();
               etEmail.clearFocus();
           }
       });
    }
}