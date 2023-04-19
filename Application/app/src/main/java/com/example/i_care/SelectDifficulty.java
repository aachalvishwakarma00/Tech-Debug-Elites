package com.example.i_care;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SelectDifficulty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_difficulty);
    }

    public void Easy(View view){
        Intent easy = new Intent(SelectDifficulty.this, EasyMode.class);
        startActivity(easy);
    }

    public void Medium(View view){
        Intent medium = new Intent(SelectDifficulty.this, MediumMode.class);
        startActivity(medium);
    }

    public void Hard(View view){
        Intent hard = new Intent(SelectDifficulty.this, HardMode.class);
        startActivity(hard);
    }

}