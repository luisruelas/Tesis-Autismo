package com.example.ruelas.tesis.Games.HousesGame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.ruelas.tesis.R;
import com.example.ruelas.tesis.Utilities;

import java.util.Random;

public class ActivityHouseGame extends AppCompatActivity implements View.OnClickListener {
    private Utilities.House correctHouse;
    private TextView housegame;
    private Button btrojo, btamarillo, btazul;
    private Intent gotoWinLoose;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_house_game);
        overridePendingTransition(0,0);
        Utilities utilities=new Utilities(this);
        Random r=new Random();
        correctHouse=utilities.getHouses().get(r.nextInt(3));

        gotoWinLoose=new Intent(this, ActivityHouseGameWinLoose.class);

        housegame= (TextView) findViewById(R.id.tvhousegame);
        housegame.setText("Cual es la casa "+correctHouse.getName().toLowerCase()+"¿");

        btrojo= (Button) findViewById(R.id.btrojo);
        btrojo.setOnClickListener(this);
        btamarillo= (Button) findViewById(R.id.btamarillo);
        btamarillo.setOnClickListener(this);
        btazul= (Button) findViewById(R.id.btazul);
        btazul.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view.getId()==correctHouse.getAnswer()){
            gotoWinLoose.putExtra("win",true);
        }
        else{
            gotoWinLoose.putExtra("win",false);
            gotoWinLoose.putExtra("color",correctHouse.getColor());
        }
        startActivity(gotoWinLoose);
    }
}
