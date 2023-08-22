package com.android.digitaltasbih;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoopActivity extends AppCompatActivity {
    TextView tvDisplayloop, tvDisplayTotal;
    EditText etLoop1, etLoop2;
    Button buttonZor,buttonBzor;
    private int clickCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loop);

        tvDisplayloop = findViewById(R.id.tvDisplayloop);
        tvDisplayTotal = findViewById(R.id.tvDisplayTotal);
        buttonZor = findViewById(R.id.buttonZor);
        buttonBzor = findViewById(R.id.buttonBzor);
        etLoop1 = findViewById(R.id.etLoop1);
        etLoop2 = findViewById(R.id.etLoop2);

        buttonZor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Integer snm,enm;
                String strs = etLoop1.getText().toString();
                snm = Integer.parseInt(strs);
                String stre = etLoop2.getText().toString();
                enm = Integer.parseInt(stre);

                for (int x=snm; x<=enm; x++){
                    if(x%2==0) tvDisplayloop.append(" "+x); //+"সর্বমোট সংখ্যা: " + resultCount);
                    //clickCount++;
                    updateClickCount();
                    calculateResult();

                }

            }
            //private void updateResultCount() {
              //  tvDisplayloop.setText("সর্বমোট সংখ্যা: " + resultCount);
            private void updateClickCount() {
                tvDisplayTotal.setText("Click Count: " + clickCount);
            }

            private void calculateResult() {
                int currentValue = 1;
                try {
                    currentValue = Integer.parseInt(tvDisplayTotal.getText().toString().split(": ")[1]);
                } catch (NumberFormatException e) {
                    // Handle the case where the text doesn't match expected format
                }

                int calculatedResult = currentValue * 2; // You can perform any calculation here
                tvDisplayTotal.setText("সর্বমোট সংখ্যা: " + calculatedResult);
            }



            });
        buttonBzor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonBzor.setText("");
                Integer snm,enm;
                String strs = etLoop1.getText().toString();
                snm = Integer.parseInt(strs);
                String stre = etLoop2.getText().toString();
                enm = Integer.parseInt(stre);

                for (int x=snm; x<=enm; x++){
                    if(x%2!=0) tvDisplayloop.append(" "+x);
                    //resultCount++;
                    //updateClickCount();

                }

            }
        });





    }

    private void calculateResult() {
    }
    //private void updateClickCount() {
        //tvDisplayloop.setText("সর্বমোট সংখ্যা: " + resultCount);

}

