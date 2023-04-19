package com.example.i_care;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void SelectDiff(View view){
        Intent SD = new Intent(MainActivity.this, SelectDifficulty.class);
        startActivity(SD);
    }

    public void ViewScore(View view){
        Intent VS = new Intent(MainActivity.this, ViewScore.class);
        startActivity(VS);
    }

}