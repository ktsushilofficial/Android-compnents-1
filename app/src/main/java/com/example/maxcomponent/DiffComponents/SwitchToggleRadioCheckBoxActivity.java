package com.example.maxcomponent.DiffComponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.example.maxcomponent.R;

public class SwitchToggleRadioCheckBoxActivity extends AppCompatActivity {
Switch aSwitch;
TextView textView1,textView2,textView3;
ImageView imageView1;
ToggleButton toggleButton;
Button buttonapply;
RadioGroup radioGroup;
RadioButton radioButton;
CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch_toggle_radio_check_box);
        aSwitch = findViewById(R.id.switchActivitySwitch1);
        textView1 = findViewById(R.id.switchActivityTV1);
        textView1.setText("Switch is Not Selected");
        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b)
                {
                    textView1.setText("Switch is Selected");
                }else{
                    textView1.setText("Switch is Not Selected");
                }
            }
        });

        //toogle button

        imageView1 = findViewById(R.id.switchActivityImage1);
        toggleButton = findViewById(R.id.switchActivityToogle1);
        toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toggleButton.isChecked())
                {
                    imageView1.setImageResource(R.drawable.bulboff);
                }else{
                    imageView1.setImageResource(R.drawable.bulbon);
                }
            }
        });

        //Radio button
        radioGroup = findViewById(R.id.switchActivityRagiogroup);
        buttonapply = findViewById(R.id.switchActivityBtn1);
        textView2 = findViewById(R.id.switchActivityTV2);
        buttonapply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int radioBtnCheckedid = radioGroup.getCheckedRadioButtonId();
                radioButton = findViewById(radioBtnCheckedid);

                if (radioButton != null)
                {
                    Toast.makeText(SwitchToggleRadioCheckBoxActivity.this,radioButton.getText(), Toast.LENGTH_SHORT).show();
                    textView2.setText("Selected radio Btn is :" + radioButton.getText());
                }

            }
        });
radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        int radioBtnCheckedid = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(radioBtnCheckedid);

        if (radioButton != null)
        {
            Toast.makeText(SwitchToggleRadioCheckBoxActivity.this,radioButton.getText(), Toast.LENGTH_SHORT).show();
            textView2.setText("Selected radio Btn is :" + radioButton.getText());
        }
    }
});
        //CheckBox
        checkBox = findViewById(R.id.switchActivityCheckBox);
        textView3 = findViewById(R.id.switchActivityTV3);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b)
                {
                    textView3.setText("Checkbox Checked");
                }else{
                    textView3.setText("Checkbox UnChecked");
                }
            }
        });
    }
}