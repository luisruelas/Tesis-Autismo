package com.example.ruelas.tesis.Games.HousesGame;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.ruelas.tesis.Menus.MainActivity;
import com.example.ruelas.tesis.R;

import java.util.ArrayList;

public class ActivityHouseGameInstructions extends AppCompatActivity implements View.OnClickListener, MediaPlayer.OnCompletionListener {
    private Button btrojo, btamarillo, btazul;
    private MediaPlayer mpamarillo,mpazul,mprojo;
    private ArrayList<Button> allbuttons=new ArrayList<>();
    private ArrayList<MediaPlayer> allplayers=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_house_game_instructions);
        overridePendingTransition(0,0);

        btrojo= (Button) findViewById(R.id.btrojo);
        btrojo.setOnClickListener(this);
        btamarillo= (Button) findViewById(R.id.btamarillo);
        btamarillo.setOnClickListener(this);
        btazul= (Button) findViewById(R.id.btazul);
        btazul.setOnClickListener(this);

        allbuttons.add(btamarillo);
        allbuttons.add(btazul);
        allbuttons.add(btrojo);

        mpamarillo=MediaPlayer.create(this, R.raw.amarillo);
        mpamarillo.setOnCompletionListener(this);
        mprojo=MediaPlayer.create(this, R.raw.rojo);
        mprojo.setOnCompletionListener(this);
        mpazul=MediaPlayer.create(this, R.raw.azul);
        mpazul.setOnCompletionListener(this);

        allplayers.add(mpamarillo);
        allplayers.add(mpazul);
        allplayers.add(mprojo);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.btamarillo){
            mpamarillo.start();
            setClickableAllButtons(false);
        }
        if(view.getId()==R.id.btrojo){
            mprojo.start();
            setClickableAllButtons(false);
        }
        if(view.getId()==R.id.btazul){
            mpazul.start();
            setClickableAllButtons(false);
        }
    }
    public void setClickableAllButtons(Boolean b){
        for (int i=0;i<allbuttons.size();i++){
            allbuttons.get(i).setClickable(b);
        }
    }

    @Override
    public void onCompletion(MediaPlayer mediaPlayer) {
        setClickableAllButtons(true);
    }

    public void gotoHousesGame(View view) {
        startActivity(new Intent(this, ActivityHouseGame.class));
    }
}
