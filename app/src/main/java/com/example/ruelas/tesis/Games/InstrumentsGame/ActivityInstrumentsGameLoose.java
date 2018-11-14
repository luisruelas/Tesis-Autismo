package com.example.ruelas.tesis.Games.InstrumentsGame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.ruelas.tesis.R;

public class ActivityInstrumentsGameLoose extends AppCompatActivity {
    private Intent gotoInstrumentsGame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_instruments_game_loose);
        gotoInstrumentsGame=new Intent(this, ActivityInstrumentsGame.class);
    }
    public void gotoInstrumentsGame(View view){
        startActivity(gotoInstrumentsGame);
    }
}
