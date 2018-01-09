package com.example.admin.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    RadioButton genderradiobutton;
    RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup = (RadioGroup) findViewById(R.id.radiogroup);
        radioGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int slectedId = radioGroup.getCheckedRadioButtonId();
                genderradiobutton = (RadioButton) findViewById(slectedId);
                if (slectedId == 1) {
                    Toast.makeText(MainActivity.this, "Nothing slected", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(MainActivity.this, genderradiobutton.getText(), Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}
