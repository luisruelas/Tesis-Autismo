package com.example.ruelas.tesis.Games.InstrumentsGame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.ruelas.tesis.R;

public class ActivityInstrumentsGameAnimation1 extends AppCompatActivity {
    private Button btnext;
    private Intent nextAnimation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instruments_game_animation1);
        overridePendingTransition(0,0);

        nextAnimation=new Intent(this,ActivityInstrumentsGameInstructions.class);
        btnext= (Button) findViewById(R.id.btanimation5next);


    }
    public void toInstrumentsGame(View view){
        startActivity(nextAnimation);
    }
}
