package com.example.i_care;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MediumMode extends AppCompatActivity {

    SharedPreferences sp;
    public static final String MyPREFERENCES = "MediumReaction";
    public static final String Time1 = "Time1";
    public static final String Time2 = "Time2";
    public static final String Time3 = "Time3";
    public static final String Time4 = "Time4";
    public static final String Time5 = "Time5";
    ImageButton BT1, BT2, BT3, BT4, BT5;
    int score_min_m=25, score_max_m=35, current_score, c2_m, c3_m, c4_m, c5_m, final_score_m;
    Button BTScore;
    long time, time_c1, time_c2, time_c3, time_c4, time_c5;
    float time_c1_final_m, time_c2_final_m, time_c3_final_m, time_c4_final_m, time_c5_final_m;
    TextView TXScore, TXInstructions;
    public static final String Score_m = "Score";
    public static final String Mode_m = "Mode";
    public static final String date_m = "Date";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medium_mode);

        time = System.currentTimeMillis();

        BT1 = (ImageButton) findViewById(R.id.Circle1_m);
        BT2 = (ImageButton) findViewById(R.id.Circle2_m);
        BT3 = (ImageButton) findViewById(R.id.Circle3_m);
        BT4 = (ImageButton) findViewById(R.id.Circle4_m);
        BT5 = (ImageButton) findViewById(R.id.Circle5_m);
        BTScore = (Button) findViewById(R.id.BTScore_m);
        TXScore = (TextView) findViewById(R.id.TX2);
        TXInstructions = (TextView) findViewById(R.id.TXInstuctions);
    }

    public void Circle1_m(View view){
        TXInstructions.setVisibility(View.INVISIBLE);
        BT2.setVisibility(View.VISIBLE);
        BT1.setVisibility(View.INVISIBLE);
        time_c1 = System.currentTimeMillis();
        time_c1_final_m = (time_c1-time)/1000F;
        Toast.makeText(this, "Time Taken: "+time_c1_final_m+" Seconds", Toast.LENGTH_SHORT).show();
        if(time_c1_final_m<2){
            TXScore.setText(""+score_max_m);
        } else if (time_c1_final_m<5) {
            TXScore.setText(""+score_min_m);
        }
    }
    public void Circle2_m(View view){
        BT3.setVisibility(View.VISIBLE);
        BT2.setVisibility(View.INVISIBLE);
        time_c2 = System.currentTimeMillis();
        time_c2_final_m = (time_c2-time_c1)/1000F;
        Toast.makeText(this, "Time Taken: "+time_c2_final_m+" Seconds", Toast.LENGTH_SHORT).show();
        if(time_c2_final_m<2){
            current_score = Integer.parseInt(TXScore.getText().toString());
            c2_m= current_score+score_max_m;
            TXScore.setText(""+c2_m);
        } else if (time_c1_final_m<5) {
            current_score = Integer.parseInt(TXScore.getText().toString());
            c2_m= current_score+score_min_m;
            TXScore.setText(""+c2_m);
        }
    }
    public void Circle3_m(View view){
        BT4.setVisibility(View.VISIBLE);
        BT3.setVisibility(View.INVISIBLE);
        time_c3 = System.currentTimeMillis();
        time_c3_final_m = (time_c3-time_c2)/1000F;
        Toast.makeText(this, "Time Taken: "+time_c3_final_m+" Seconds", Toast.LENGTH_SHORT).show();
        if(time_c3_final_m<2){
            current_score = Integer.parseInt(TXScore.getText().toString());
            c3_m= current_score+score_max_m;
            TXScore.setText(""+c3_m);
        } else if (time_c1_final_m<5) {
            current_score = Integer.parseInt(TXScore.getText().toString());
            c3_m= current_score+score_min_m;
            TXScore.setText(""+c3_m);
        }
    }
    public void Circle4_m(View view){
        BT5.setVisibility(View.VISIBLE);
        BT4.setVisibility(View.INVISIBLE);
        time_c4 = System.currentTimeMillis();
        time_c4_final_m = (time_c4-time_c3)/1000F;
        Toast.makeText(this, "Time Taken: "+time_c4_final_m+" Seconds", Toast.LENGTH_SHORT).show();
        if(time_c4_final_m<2){
            current_score = Integer.parseInt(TXScore.getText().toString());
            c4_m= current_score+score_max_m;
            TXScore.setText(""+c4_m);
        } else if (time_c1_final_m<5) {
            current_score = Integer.parseInt(TXScore.getText().toString());
            c4_m= current_score+score_min_m;
            TXScore.setText(""+c4_m);
        }
    }
    public void Circle5_m(View view){
        BTScore.setVisibility(View.VISIBLE);
        BT5.setVisibility(View.INVISIBLE);
        time_c5 = System.currentTimeMillis();
        time_c5_final_m = (time_c5-time_c4)/1000F;
        Toast.makeText(this, "Time Taken: "+time_c5_final_m+" Seconds", Toast.LENGTH_SHORT).show();
        if(time_c5_final_m<2){
            current_score = Integer.parseInt(TXScore.getText().toString());
            c5_m= current_score+score_max_m;
            TXScore.setText(""+c5_m);
        } else if (time_c1_final_m<5) {
            current_score = Integer.parseInt(TXScore.getText().toString());
            c5_m= current_score+score_min_m;
            TXScore.setText(""+c5_m);
        }
        final_score_m = c5_m;
    }

    public void Score_m(View view){
        sp = getSharedPreferences(MyPREFERENCES, MODE_PRIVATE);
        SharedPreferences.Editor ed = sp.edit();
        ed.putString(Time1,""+time_c1_final_m);
        ed.putString(Time2,""+time_c2_final_m);
        ed.putString(Time3,""+time_c3_final_m);
        ed.putString(Time4,""+time_c4_final_m);
        ed.putString(Time5,""+time_c5_final_m);
        ed.commit();
        String m = "Medium";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
        String currentDate = sdf.format(new Date());
        Intent VS = new Intent(MediumMode.this, ViewScore.class);
        VS.putExtra(Score_m,final_score_m);
        VS.putExtra(Mode_m,m);
        VS.putExtra(date_m,currentDate);
        startActivity(VS);
    }

}