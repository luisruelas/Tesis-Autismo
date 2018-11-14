package com.example.ruelas.tesis.Games.HousesGame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.ruelas.tesis.R;

public class ActivityHouseGameAnimation1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_house_game_animation1);
        overridePendingTransition(0,0);
    }

    public void gotoHousesInstructions(View view) {
        startActivity(new Intent(this,ActivityHouseGameInstructions.class));
    }
}
