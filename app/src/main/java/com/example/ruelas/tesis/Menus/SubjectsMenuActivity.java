package com.example.ruelas.tesis.Menus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.ruelas.tesis.Games.InstrumentsGame.ActivityInstrumentsGameAnimation1;
import com.example.ruelas.tesis.R;

public class SubjectsMenuActivity extends AppCompatActivity {
    private Intent gotoArt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjects_menu);
        overridePendingTransition(0,0);
        gotoArt=new Intent(this, ActivityInstrumentsGameAnimation1.class);
    }

    public void goToArt(View view){
        startActivity(gotoArt);
    }
}
