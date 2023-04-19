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

public class HardMode extends AppCompatActivity {

    SharedPreferences sp;
    public static final String MyPREFERENCES = "HardReaction";
    public static final String Time1 = "Time1";
    public static final String Time2 = "Time2";
    public static final String Time3 = "Time3";
    public static final String Time4 = "Time4";
    public static final String Time5 = "Time5";

    ImageButton BT1, BT2, BT3, BT4, BT5;
    int score_min_h=35, score_max_h=50, current_score, c2_h, c3_h, c4_h, c5_h, final_score_h;
    Button BTScore;
    long time, time_c1, time_c2, time_c3, time_c4, time_c5;
    float time_c1_final_h, time_c2_final_h, time_c3_final_h, time_c4_final_h, time_c5_final_h;
    TextView TXScore, TXInstructions;
    public static final String Score_h = "Score";
    public static final String Mode_h = "Mode";
    public static final String date_h = "Date";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hard_mode);

        time = System.currentTimeMillis();

        BT1 = (ImageButton) findViewById(R.id.Circle1_h);
        BT2 = (ImageButton) findViewById(R.id.Circle2_h);
        BT3 = (ImageButton) findViewById(R.id.Circle3_h);
        BT4 = (ImageButton) findViewById(R.id.Circle4_h);
        BT5 = (ImageButton) findViewById(R.id.Circle5_h);
        BTScore = (Button) findViewById(R.id.BTScore_h);
        TXScore = (TextView) findViewById(R.id.TX2);
        TXInstructions = (TextView) findViewById(R.id.TXInstuctions);
    }

    public void Circle1_h(View view){
        TXInstructions.setVisibility(View.INVISIBLE);
        BT2.setVisibility(View.VISIBLE);
        BT1.setVisibility(View.INVISIBLE);
        time_c1 = System.currentTimeMillis();
        time_c1_final_h = (time_c1-time)/1000F;
        Toast.makeText(this, "Time Taken: "+time_c1_final_h+" Seconds", Toast.LENGTH_SHORT).show();
        if(time_c1_final_h<2){
            TXScore.setText(""+score_max_h);
        } else if (time_c1_final_h<5) {
            TXScore.setText(""+score_min_h);
        }
    }
    public void Circle2_h(View view){
        BT3.setVisibility(View.VISIBLE);
        BT2.setVisibility(View.INVISIBLE);
        time_c2 = System.currentTimeMillis();
        time_c2_final_h = (time_c2-time_c1)/1000F;
        Toast.makeText(this, "Time Taken: "+time_c2_final_h+" Seconds", Toast.LENGTH_SHORT).show();
        if(time_c2_final_h<2){
            current_score = Integer.parseInt(TXScore.getText().toString());
            c2_h= current_score+score_max_h;
            TXScore.setText(""+c2_h);
        } else if (time_c1_final_h<5) {
            current_score = Integer.parseInt(TXScore.getText().toString());
            c2_h= current_score+score_min_h;
            TXScore.setText(""+c2_h);
        }
    }
    public void Circle3_h(View view){
        BT4.setVisibility(View.VISIBLE);
        BT3.setVisibility(View.INVISIBLE);
        time_c3 = System.currentTimeMillis();
        time_c3_final_h = (time_c3-time_c2)/1000F;
        Toast.makeText(this, "Time Taken: "+time_c3_final_h+" Seconds", Toast.LENGTH_SHORT).show();
        if(time_c3_final_h<2){
            current_score = Integer.parseInt(TXScore.getText().toString());
            c3_h= current_score+score_max_h;
            TXScore.setText(""+c3_h);
        } else if (time_c1_final_h<5) {
            current_score = Integer.parseInt(TXScore.getText().toString());
            c3_h= current_score+score_min_h;
            TXScore.setText(""+c3_h);
        }
    }
    public void Circle4_h(View view){
        BT5.setVisibility(View.VISIBLE);
        BT4.setVisibility(View.INVISIBLE);
        time_c4 = System.currentTimeMillis();
        time_c4_final_h = (time_c4-time_c3)/1000F;
        Toast.makeText(this, "Time Taken: "+time_c4_final_h+" Seconds", Toast.LENGTH_SHORT).show();
        if(time_c4_final_h<2){
            current_score = Integer.parseInt(TXScore.getText().toString());
            c4_h= current_score+score_max_h;
            TXScore.setText(""+c4_h);
        } else if (time_c1_final_h<5) {
            current_score = Integer.parseInt(TXScore.getText().toString());
            c4_h= current_score+score_min_h;
            TXScore.setText(""+c4_h);
        }
    }
    public void Circle5_h(View view){
        BTScore.setVisibility(View.VISIBLE);
        BT5.setVisibility(View.INVISIBLE);
        time_c5 = System.currentTimeMillis();
        time_c5_final_h = (time_c5-time_c4)/1000F;
        Toast.makeText(this, "Time Taken: "+time_c5_final_h+" Seconds", Toast.LENGTH_SHORT).show();
        if(time_c5_final_h<2){
            current_score = Integer.parseInt(TXScore.getText().toString());
            c5_h= current_score+score_max_h;
            TXScore.setText(""+c5_h);
        } else if (time_c1_final_h<5) {
            current_score = Integer.parseInt(TXScore.getText().toString());
            c5_h= current_score+score_min_h;
            TXScore.setText(""+c5_h);
        }
        final_score_h = c5_h;
    }

    public void Score_h(View view){
        sp = getSharedPreferences(MyPREFERENCES, MODE_PRIVATE);
        SharedPreferences.Editor ed = sp.edit();
        ed.putString(Time1,""+time_c1_final_h);
        ed.putString(Time2,""+time_c2_final_h);
        ed.putString(Time3,""+time_c3_final_h);
        ed.putString(Time4,""+time_c4_final_h);
        ed.putString(Time5,""+time_c5_final_h);
        ed.commit();
        String m = "Hard";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
        String currentDate = sdf.format(new Date());
        Intent VS = new Intent(HardMode.this, ViewScore.class);
        VS.putExtra(Score_h,final_score_h);
        VS.putExtra(Mode_h,m);
        VS.putExtra(date_h,currentDate);
        startActivity(VS);
    }
}