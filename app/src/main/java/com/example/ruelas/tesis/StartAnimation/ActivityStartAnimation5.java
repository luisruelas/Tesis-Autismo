package com.example.ruelas.tesis.StartAnimation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.ruelas.tesis.Menus.SubjectsMenuActivity;
import com.example.ruelas.tesis.R;

public class ActivityStartAnimation5 extends AppCompatActivity {
    private Button btnext;
    private Intent nextAnimation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startanimation5);
        overridePendingTransition(0,0);

        nextAnimation=new Intent(this,SubjectsMenuActivity.class);
        btnext= (Button) findViewById(R.id.btanimation5next);


    }
    public void toSubjectMenu(View view){
        startActivity(nextAnimation);
    }
}
