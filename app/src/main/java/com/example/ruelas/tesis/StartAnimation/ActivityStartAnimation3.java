package com.example.ruelas.tesis.StartAnimation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import com.example.ruelas.tesis.R;

public class ActivityStartAnimation3 extends AppCompatActivity {
    private ImageView cohete;
    private Button btnext;
    private Intent nextAnimation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startanimation3);
        overridePendingTransition(0,0);

        nextAnimation=new Intent(this,ActivityStartAnimation4.class);
        btnext= (Button) findViewById(R.id.btanimation3next);
        btnext.setVisibility(View.GONE);
        cohete =(ImageView) findViewById(R.id.ivanim3cohete);

        Animation scalemoverocket= AnimationUtils.loadAnimation(this, R.anim.animspaceship);

        scalemoverocket.setDuration(2000);
        scalemoverocket.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                    btnext.setVisibility(View.VISIBLE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        cohete.startAnimation(scalemoverocket);

    }
    public void toAnimation4(View view){
        startActivity(nextAnimation);
    }
}
