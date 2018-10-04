package com.bossomdong.meditationandsitting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    Button btnMeditation,btnManual,btnHolyday,btnTemple,btnPrayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnMeditation = findViewById(R.id.btn_meditation);
        btnManual = findViewById(R.id.btn_manual);
        btnHolyday = findViewById(R.id.btn_holyday);
        btnTemple = findViewById(R.id.btn_temple);
        btnPrayer = findViewById(R.id.btn_prayer);

        btnMeditation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPageMeditation();
            }
        });
        btnManual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPageManual();
            }
        });


    }
    private void openPageMeditation(){
        Intent intent = new Intent(this,MainMeditationActivity.class);
        startActivity(intent);
    }
    private void openPageManual(){
        Intent intent = new Intent(this,ManualActivity.class);
        startActivity(intent);
    }
}
