package com.example.ruelas.tesis.Menus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ruelas.tesis.R;
import com.example.ruelas.tesis.StartAnimation.ActivityStartAnimation1;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btmainmenujugar, btmainmenuniveles, btmainmenutienda;
    private Intent toAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //instanciando
        btmainmenujugar= (Button) findViewById(R.id.btmainmenujugar);
        btmainmenujugar.setOnClickListener(this);
        btmainmenuniveles= (Button) findViewById(R.id.btmainmenuniveles);
        btmainmenutienda= (Button) findViewById(R.id.btmainmenutienda);
        //intent
        toAnimation=new Intent(this, ActivityStartAnimation1.class);
        overridePendingTransition(0,0);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btmainmenujugar:
                startActivity(toAnimation);
                break;
        }
    }
}
