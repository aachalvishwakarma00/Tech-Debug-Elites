package com.example.i_care;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EasyMode extends AppCompatActivity {

    SharedPreferences sp;
    public static final String MyPREFERENCES = "EasyReaction";
    public static final String Time1 = "Time1";
    public static final String Time2 = "Time2";
    public static final String Time3 = "Time3";
    public static final String Time4 = "Time4";
    public static final String Time5 = "Time5";
    public static final String Score_e = "Score";
    public static final String Mode_e = "Mode";
    public static final String date_e = "Date";
    ImageButton BT1, BT2, BT3, BT4, BT5;
    int score_min_e=15, score_max_e=20, current_score, c2_e, c3_e, c4_e, c5_e, final_score_e;
    Button BTScore;
    long time, time_c1, time_c2, time_c3, time_c4, time_c5;
    float time_c1_final_e, time_c2_final_e, time_c3_final_e, time_c4_final_e, time_c5_final_e;
    TextView TXScore, TXInstructions;

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
        TXScore = (TextView) findViewById(R.id.TX2);
        TXInstructions = (TextView) findViewById(R.id.TXInstuctions);
    }

    public void Circle1_e(View view){
        TXInstructions.setVisibility(View.INVISIBLE);
        BT2.setVisibility(View.VISIBLE);
        BT1.setVisibility(View.INVISIBLE);
        time_c1 = System.currentTimeMillis();
        time_c1_final_e = (time_c1-time)/1000F;
        Toast.makeText(this, "Time Taken: "+time_c1_final_e+" Seconds", Toast.LENGTH_SHORT).show();
        if(time_c1_final_e<2){
            TXScore.setText(""+score_max_e);
        } else if (time_c1_final_e<5) {
            TXScore.setText(""+score_min_e);
        }
    }
    public void Circle2_e(View view){
        BT3.setVisibility(View.VISIBLE);
        BT2.setVisibility(View.INVISIBLE);
        time_c2 = System.currentTimeMillis();
        time_c2_final_e = (time_c2-time_c1)/1000F;
        Toast.makeText(this, "Time Taken: "+time_c2_final_e+" Seconds", Toast.LENGTH_SHORT).show();
        if(time_c2_final_e<2){
            current_score = Integer.parseInt(TXScore.getText().toString());
            c2_e= current_score+score_max_e;
            TXScore.setText(""+c2_e);
        } else if (time_c1_final_e<5) {
            current_score = Integer.parseInt(TXScore.getText().toString());
            c2_e= current_score+score_min_e;
            TXScore.setText(""+c2_e);
        }
    }
    public void Circle3_e(View view){
        BT4.setVisibility(View.VISIBLE);
        BT3.setVisibility(View.INVISIBLE);
        time_c3 = System.currentTimeMillis();
        time_c3_final_e = (time_c3-time_c2)/1000F;
        Toast.makeText(this, "Time Taken: "+time_c3_final_e+" Seconds", Toast.LENGTH_SHORT).show();
        if(time_c3_final_e<2){
            current_score = Integer.parseInt(TXScore.getText().toString());
            c3_e= current_score+score_max_e;
            TXScore.setText(""+c3_e);
        } else if (time_c1_final_e<5) {
            current_score = Integer.parseInt(TXScore.getText().toString());
            c3_e= current_score+score_min_e;
            TXScore.setText(""+c3_e);
        }
    }
    public void Circle4_e(View view){
        BT5.setVisibility(View.VISIBLE);
        BT4.setVisibility(View.INVISIBLE);
        time_c4 = System.currentTimeMillis();
        time_c4_final_e = (time_c4-time_c3)/1000F;
        Toast.makeText(this, "Time Taken: "+time_c4_final_e+" Seconds", Toast.LENGTH_SHORT).show();
        if(time_c4_final_e<2){
            current_score = Integer.parseInt(TXScore.getText().toString());
            c4_e= current_score+score_max_e;
            TXScore.setText(""+c4_e);
        } else if (time_c1_final_e<5) {
            current_score = Integer.parseInt(TXScore.getText().toString());
            c4_e= current_score+score_min_e;
            TXScore.setText(""+c4_e);
        }
    }
    public void Circle5_e(View view){
        BTScore.setVisibility(View.VISIBLE);
        BT5.setVisibility(View.INVISIBLE);
        time_c5 = System.currentTimeMillis();
        time_c5_final_e = (time_c5-time_c4)/1000F;
        Toast.makeText(this, "Time Taken: "+time_c5_final_e+" Seconds", Toast.LENGTH_SHORT).show();
        if(time_c5_final_e<2){
            current_score = Integer.parseInt(TXScore.getText().toString());
            c5_e= current_score+score_max_e;
            TXScore.setText(""+c5_e);
        } else if (time_c1_final_e<5) {
            current_score = Integer.parseInt(TXScore.getText().toString());
            c5_e= current_score+score_min_e;
            TXScore.setText(""+c5_e);
        }
        final_score_e = c5_e;
    }

    public void Score_e(View view){
        sp = getSharedPreferences(MyPREFERENCES, MODE_PRIVATE);
        SharedPreferences.Editor ed = sp.edit();
        ed.putString(Time1,""+time_c1_final_e);
        ed.putString(Time2,""+time_c2_final_e);
        ed.putString(Time3,""+time_c3_final_e);
        ed.putString(Time4,""+time_c4_final_e);
        ed.putString(Time5,""+time_c5_final_e);
        ed.commit();

        String m = "Easy";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
        String currentDate = sdf.format(new Date());
        Intent VS = new Intent(EasyMode.this, ViewScore.class);
        VS.putExtra(Score_e,final_score_e);
        VS.putExtra(Mode_e,m);
        VS.putExtra(date_e,currentDate);
        startActivity(VS);
    }

}