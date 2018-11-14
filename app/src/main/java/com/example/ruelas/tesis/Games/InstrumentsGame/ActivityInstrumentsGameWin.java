package com.example.ruelas.tesis.Games.InstrumentsGame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.example.ruelas.tesis.Games.HousesGame.ActivityHouseGameAnimation1;

import com.example.ruelas.tesis.Games.HousesGame.ActivityHouseGameInstructions;
import com.example.ruelas.tesis.R;

public class ActivityInstrumentsGameWin extends AppCompatActivity {
    private TextView tvcorrecto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_instruments_game_win);
        tvcorrecto= (TextView) findViewById(R.id.tvcorrecto);
        Bundle b=getIntent().getExtras();
        String instrumento=b.getString("instrumento");

        tvcorrecto.setText("Muy bien! "+instrumento+" Ganaste 3 monedas por responder correctamente!");
        overridePendingTransition(0,0);
    }
    public void gotoHousesGame(View view){
        startActivity(new Intent(this,ActivityHouseGameAnimation1.class));
    }
}
