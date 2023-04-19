package com.example.i_care;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.Button;

public class EasyMode extends AppCompatActivity {

    Button BT1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_mode);

        BT1 = (Button) findViewById(R.id.Circle1);


    }
}