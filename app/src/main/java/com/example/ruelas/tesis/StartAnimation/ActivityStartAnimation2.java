package com.example.ruelas.tesis.StartAnimation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.example.ruelas.tesis.R;

public class ActivityStartAnimation2 extends AppCompatActivity {
    private ImageView textglobe, eddysaludando;
    private RelativeLayout container;
    private Intent nextAnimation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startanimation2);
        overridePendingTransition(0,0);


//        textglobe= (ImageView) findViewById(R.id.ivglobodetexto);

  //      textglobe.setX(getResources().getDimension(R.dimen.eddysaludandowidth));

//        Toast.makeText(this,Float.toString(eddysaludando.getX()),Toast.LENGTH_LONG).show();
        nextAnimation=new Intent(this,ActivityStartAnimation3.class);

    }
    public void toAnimation3(View view){
        startActivity(nextAnimation);
    }
}
