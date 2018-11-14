package com.example.ruelas.tesis.StartAnimation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.example.ruelas.tesis.R;

public class ActivityStartAnimation1 extends AppCompatActivity {
    private ImageView textglobe, eddysaludando;
    private RelativeLayout container;
    private Intent nextAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startanimation1);
        overridePendingTransition(0,0);
        nextAnimation=new Intent(this,ActivityStartAnimation2.class);


    }
    public void next(View view){
        startActivity(nextAnimation);
    }
}
