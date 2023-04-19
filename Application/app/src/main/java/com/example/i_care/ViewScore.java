package com.example.i_care;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ViewScore extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_score);

        TextView TXMode = (TextView) findViewById(R.id.TxMode);
        TextView TXScore = (TextView) findViewById(R.id.TxScore);
        TextView TXDate = (TextView) findViewById(R.id.TxDate);

        Intent Easy = getIntent();
        String x_e = Easy.getStringExtra(EasyMode.Mode_e);
        int y_e = Easy.getIntExtra(EasyMode.Score_e,0);
        String z_e = Easy.getStringExtra(EasyMode.date_e);
        TXMode.setText(x_e);
        TXScore.setText(""+y_e);
        TXDate.setText(z_e);

        Intent Medium = getIntent();
        String x_m = Medium.getStringExtra(MediumMode.Mode_m);
        int y_m = Medium.getIntExtra(MediumMode.Score_m,0);
        String z_m = Medium.getStringExtra(MediumMode.date_m);
        TXMode.setText(x_m);
        TXScore.setText(""+y_m);
        TXDate.setText(z_m);

        Intent Hard = getIntent();
        String x_h = Medium.getStringExtra(HardMode.Mode_h);
        int y_h = Medium.getIntExtra(HardMode.Score_h,0);
        String z_h = Medium.getStringExtra(HardMode.date_h);
        TXMode.setText(x_h);
        TXScore.setText(""+y_h);
        TXDate.setText(z_h);
    }
}