package com.example.ruelas.tesis.Games.InstrumentsGame;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.ruelas.tesis.R;

import java.util.ArrayList;

public class ActivityInstrumentsGameInstructions extends AppCompatActivity implements View.OnClickListener, MediaPlayer.OnCompletionListener {
    private Button bttambor,btmarimba,btguitarra,btmaracas;
    private TextView tvtambor,tvmarimba,tvguitarra,tvmaracas;
    private MediaPlayer mptambor, mpguitarra, mpmaracas, mpmarimba;
    final ArrayList<View> allbuttons= new ArrayList<>();;
    final ArrayList<MediaPlayer> allplayers= new ArrayList<>();;
    private Intent toInstrumentsGame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_instruments_game_instructions);
        overridePendingTransition(0,0);

        toInstrumentsGame=new Intent(this,ActivityInstrumentsGame.class);

        bttambor= (Button) findViewById(R.id.bttambor);
        btmarimba= (Button) findViewById(R.id.btmarimba);
        btguitarra= (Button) findViewById(R.id.btguitarra);
        btmaracas= (Button) findViewById(R.id.btmaracas);

        tvtambor= (TextView) findViewById(R.id.tvtambor);
        tvmarimba= (TextView) findViewById(R.id.tvmarimba);
        tvguitarra= (TextView) findViewById(R.id.tvguitarra);
        tvmaracas= (TextView) findViewById(R.id.tvmaracas);

        allbuttons.add(bttambor);
        allbuttons.add(btmarimba);
        allbuttons.add(btmaracas);
        allbuttons.add(btguitarra);

        allbuttons.add(tvtambor);
        allbuttons.add(tvmarimba);
        allbuttons.add(tvmaracas);
        allbuttons.add(tvguitarra);

        mptambor=MediaPlayer.create(this,R.raw.tambor);
        mptambor.setOnCompletionListener(this);
        bttambor.setOnClickListener(this);
        tvtambor.setOnClickListener(this);

        mpmarimba=MediaPlayer.create(this,R.raw.marimba);
        mpmarimba.setOnCompletionListener(this);
        btmarimba.setOnClickListener(this);
        tvmarimba.setOnClickListener(this);

        mpmaracas=MediaPlayer.create(this,R.raw.maracas);
        mpmaracas.setOnCompletionListener(this);
        btmaracas.setOnClickListener(this);
        tvmaracas.setOnClickListener(this);

        mpguitarra=MediaPlayer.create(this,R.raw.guitarra);
        mpguitarra.setOnCompletionListener(this);
        btguitarra.setOnClickListener(this);
        tvguitarra.setOnClickListener(this);

        allplayers.add(mpguitarra);
        allplayers.add(mpmaracas);
        allplayers.add(mpmarimba);
        allplayers.add(mptambor);
    }

    @Override
    public void onClick(View view) {
        setAllClickable(false);
        switch (view.getId()){
            case R.id.bttambor:
                mptambor.start();
                break;
            case R.id.btmarimba:
                mpmarimba.start();
                break;
            case R.id.btmaracas:
                mpmaracas.start();
                break;
            case R.id.btguitarra:
                mpguitarra.start();
                break;

            case R.id.tvtambor:
                mptambor.start();
                break;
            case R.id.tvmarimba:
                mpmarimba.start();
                break;
            case R.id.tvmaracas:
                mpmaracas.start();
                break;
            case R.id.tvguitarra:
                mpguitarra.start();
                break;
        }
    }


    public void setAllClickable(Boolean clickable){
        for(int i=0; i<allbuttons.size();i++){
            if (allbuttons.get(i)!=null){
                allbuttons.get(i).setClickable(clickable);
            }

        }
    }

    @Override
    public void onCompletion(MediaPlayer mediaPlayer) {
        setAllClickable(true);
    }

    public void toInstrumentsGame(View view){
        for(int i=0;i<allplayers.size();i++){
            allplayers.get(i).stop();
        }
        startActivity(toInstrumentsGame);
    }
}
