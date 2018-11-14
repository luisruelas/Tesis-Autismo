package com.example.ruelas.tesis.Games.InstrumentsGame;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ruelas.tesis.R;
import com.example.ruelas.tesis.Utilities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class ActivityInstrumentsGame extends AppCompatActivity implements View.OnClickListener {
    private Utilities.Instrumento instrumento;
    private Button btplaysound;
    private MediaPlayer mp;
    private Button btgameguitarra, btgametambor,btgamemaracas, btgamemarimba;
    private TextView tvgameguitarra, tvgametambor,tvgamemaracas, tvgamemarimba;
    private Intent gotoWinInstrument;
    private Intent gotoLooseIntstrument;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_instruments_game);

        overridePendingTransition(0,0);

        gotoWinInstrument=new Intent(this,ActivityInstrumentsGameWin.class);
        gotoLooseIntstrument=new Intent(this, ActivityInstrumentsGameLoose.class);

        btgameguitarra= (Button) findViewById(R.id.btgameguitarra);
        btgameguitarra.setOnClickListener(this);
        tvgameguitarra= (TextView) findViewById(R.id.tvgameguitarra);
        tvgameguitarra.setOnClickListener(this);

        btgamemarimba= (Button) findViewById(R.id.btgamemarimba);
        btgamemarimba.setOnClickListener(this);
        tvgamemarimba= (TextView) findViewById(R.id.tvgamemarimba);
        tvgamemarimba.setOnClickListener(this);

        btgamemaracas= (Button) findViewById(R.id.btgamemaracas);
        btgamemaracas.setOnClickListener(this);
        tvgamemaracas= (TextView) findViewById(R.id.tvgamemaracas);
        tvgamemaracas.setOnClickListener(this);

        btgametambor= (Button) findViewById(R.id.btgametambor);
        btgametambor.setOnClickListener(this);
        tvgametambor= (TextView) findViewById(R.id.tvgametambor);
        tvgametambor.setOnClickListener(this);

        btplaysound= (Button) findViewById(R.id.btplaysound);
        Utilities utility=new Utilities(this);
        ArrayList<Utilities.Instrumento> instruments=utility.getInstrumentos();
        Random r=new Random();
        this.instrumento=instruments.get(r.nextInt(4));

    }
    public void playSound (View view){
        mp=instrumento.getSoung();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                btplaysound.setClickable(true);
            }
        });
        mp.start();

        btplaysound.setClickable(false);
    }

    @Override
    public void onClick(View view) {
        mp.stop();
        for(int i=0;i<instrumento.getAnswers().size();i++){
                if(instrumento.getAnswers().get(i)==view.getId()){
                    gotoWinInstrument.putExtra("instrumento",instrumento.getName());
                startActivity(gotoWinInstrument);
                return;
            }
        }
        startActivity(gotoLooseIntstrument);
    }
}
