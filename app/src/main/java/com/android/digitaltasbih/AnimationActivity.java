package com.android.digitaltasbih;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class AnimationActivity extends AppCompatActivity {
    ImageView firstAnim;
    Button animButton, calculator, bmiCal,monazat;
    Animation first_anim;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);

        firstAnim = findViewById(R.id.firstAnim);
        animButton = findViewById(R.id.animButton);
        calculator = findViewById(R.id.calculator);
        bmiCal = findViewById(R.id.bmiCal);
        monazat = findViewById(R.id.monazat);

        first_anim = AnimationUtils.loadAnimation(AnimationActivity.this,R.anim.first_anim);


        animButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstAnim.startAnimation(first_anim);
            }
        });

        calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent = new Intent(AnimationActivity.this,CalculatorActivity.class);
                startActivity(myintent);
            }
        });
        bmiCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myintent = new Intent(AnimationActivity.this,CalculatorActivity.class);
                startActivity(myintent);
            }
        });
        monazat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(AnimationActivity.this, MonazatActivity.class);
                startActivity(myIntent);
            }
        });





    }
}