package com.example.i_care;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class EasyMode extends AppCompatActivity {

    ImageButton BT1, BT2, BT3, BT4, BT5;
    Button BTScore;
    long time, time_c1, time_c2, time_c3, time_c4, time_c5;
    float time_c1_final_e, time_c2_final_e, time_c3_final_e, time_c4_final_e, time_c5_final_e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_mode);

        time = System.currentTimeMillis();

        BT1 = (ImageButton) findViewById(R.id.Circle1_e);
        BT2 = (ImageButton) findViewById(R.id.Circle2_e);
        BT3 = (ImageButton) findViewById(R.id.Circle3_e);
        BT4 = (ImageButton) findViewById(R.id.Circle4_e);
        BT5 = (ImageButton) findViewById(R.id.Circle5_e);
        BTScore = (Button) findViewById(R.id.BTScore_e);
    }

    public void Circle1_e(View view){
        BT2.setVisibility(View.VISIBLE);
        BT1.setVisibility(View.INVISIBLE);
        time_c1 = System.currentTimeMillis();
        time_c1_final_e = (time_c1-time)/1000F;
        Toast.makeText(this, "Time Taken: "+time_c1_final_e+" Seconds", Toast.LENGTH_SHORT).show();
    }
    public void Circle2_e(View view){
        BT3.setVisibility(View.VISIBLE);
        BT2.setVisibility(View.INVISIBLE);
        time_c2 = System.currentTimeMillis();
        time_c2_final_e = (time_c2-time_c1)/1000F;
        Toast.makeText(this, "Time Taken: "+time_c2_final_e+" Seconds", Toast.LENGTH_SHORT).show();
    }
    public void Circle3_e(View view){
        BT4.setVisibility(View.VISIBLE);
        BT3.setVisibility(View.INVISIBLE);
        time_c3 = System.currentTimeMillis();
        time_c3_final_e = (time_c3-time_c2)/1000F;
        Toast.makeText(this, "Time Taken: "+time_c3_final_e+" Seconds", Toast.LENGTH_SHORT).show();
    }
    public void Circle4_e(View view){
        BT5.setVisibility(View.VISIBLE);
        BT4.setVisibility(View.INVISIBLE);
        time_c4 = System.currentTimeMillis();
        time_c4_final_e = (time_c4-time_c3)/1000F;
        Toast.makeText(this, "Time Taken: "+time_c4_final_e+" Seconds", Toast.LENGTH_SHORT).show();
    }
    public void Circle5_e(View view){
        BTScore.setVisibility(View.VISIBLE);
        BT5.setVisibility(View.INVISIBLE);
        time_c5 = System.currentTimeMillis();
        time_c5_final_e = (time_c5-time_c4)/1000F;
        Toast.makeText(this, "Time Taken: "+time_c5_final_e+" Seconds", Toast.LENGTH_SHORT).show();
    }

    public void Score_e(View view){
        Intent VS = new Intent(EasyMode.this, ViewScore.class);
        startActivity(VS);
    }

}