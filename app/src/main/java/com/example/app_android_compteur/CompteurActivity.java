package com.example.app_android_compteur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class CompteurActivity extends AppCompatActivity {

    private TextView points;
    private ImageView compte;
    private int clicks;
    private Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compteur);

        this.points = (TextView) findViewById(R.id.points);
        this.compte = (ImageView) findViewById(R.id.compte);
        this.back = (Button) findViewById(R.id.back) ;

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent otherActivity = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(otherActivity);
                finish();
            }
        });

        compte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicks++;
                if (clicks >= 2)
                {
                    points.setText("Points : " + clicks);
                }else {
                    points.setText("Point : " + clicks);
                }

            }
        });
    }
}