package com.example.ruelas.tesis.StartAnimation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.ruelas.tesis.R;

public class ActivityStartAnimation4 extends AppCompatActivity {
    private Button btnext;
    private Intent nextAnimation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startanimation4);
        overridePendingTransition(0,0);

        nextAnimation=new Intent(this,ActivityStartAnimation5.class);
        btnext= (Button) findViewById(R.id.btanimation4next);


    }
    public void toAnimation5(View view){
        startActivity(nextAnimation);
    }
}
