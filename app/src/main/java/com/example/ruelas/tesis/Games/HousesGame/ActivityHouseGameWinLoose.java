package com.example.ruelas.tesis.Games.HousesGame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.ruelas.tesis.Menus.MainActivity;
import com.example.ruelas.tesis.R;

public class ActivityHouseGameWinLoose extends AppCompatActivity {
    private TextView tvhousewin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(0,0);
        if(getIntent().getExtras().getBoolean("win")){
            setContentView(R.layout.activity_house_activity_win);
            tvhousewin= (TextView) findViewById(R.id.tvhousewin);
            tvhousewin.setText("Correcto, ese es el color "+getIntent().getExtras().getString("color")+"! Ganaste 3 monedas más!");

        }else{
            setContentView(R.layout.activity_house_activity_loose);
        }

    }

    public void gotoMain(View view) {
        startActivity(new Intent(this, MainActivity.class));
    }

    public void gotoHousesGame(View view) {
        startActivity(new Intent(this, ActivityHouseGame.class));
    }
}
