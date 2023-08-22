package com.android.digitaltasbih;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class CalculatorActivity extends AppCompatActivity {

    EditText etBuy,etSell, etBMIw,etBMIhf,etBMIhi;
    Button calButton, buttonBresult;
    TextView tvDisplay,tvDisplayBMI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        etBuy = findViewById(R.id.etBuy);
        etSell = findViewById(R.id.etSell);
        calButton = findViewById(R.id.calButton);
        tvDisplay = findViewById(R.id.tvDisplay);
        etBMIw = findViewById(R.id.etBMIw);
        etBMIhf = findViewById(R.id.etBMIhf);
        etBMIhi = findViewById(R.id.etBMIhi);
        buttonBresult = findViewById(R.id.buttonBresult);
        tvDisplayBMI = findViewById(R.id.tvDisplayBMI);



        calButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float buyPrice,sellPrice,profit,profitPercentage;
                String sBuy = etBuy.getText().toString();
                buyPrice = Float.parseFloat(sBuy);

                String sSell =etSell.getText().toString();
                sellPrice = Float.parseFloat(sSell);

                profit = sellPrice-buyPrice;
                profitPercentage = profit/buyPrice*100;

                tvDisplay.setText("আপনার লাভ/লস হয়েছে:"+profit+"টাকা"+"\n আপনার শতকরা লাভ/লস হয়েছে:"+profitPercentage+"%");
                DecimalFormat df = new DecimalFormat("0.00");
                float number = (float) 0.00;
                System.out.println(df.format(number));
            }
        });

        buttonBresult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sWeight = etBMIw.getText().toString();
                String sHightf = etBMIhf.getText().toString();
                String sHighti = etBMIhi.getText().toString();

                // নিচের লাইনটি অনাকাঙ্খিত ইনপুটের জন্য

                if(sWeight.length()>0 && sHightf.length()>0 && sHighti.length()>0){

                    float weight = Float.parseFloat(sWeight);
                    float hightf = Float.parseFloat(sHightf);
                    float highti =Float.parseFloat(sHighti);


                    float hight = (float) (hightf*0.3048+highti*0.0254);
                    float bmiIndex = weight / (hight*hight);

                    if(bmiIndex<18){
                        tvDisplayBMI.setText("আপনার BMI Index হচ্ছে:"+bmiIndex+"\nআপনার ওজন কম, তাই আপনাকে বেশি বেশি খাওয়া দাওয়া করতে হবে");
                    } else if (bmiIndex>=18 && bmiIndex<=25) {
                        tvDisplayBMI.setText("আপনার BMI Index হচ্ছে:"+bmiIndex+"\nআপনার ওজন ঠিক আছে , তাই আপনাকে স্বাভাবিক ভাবে চলতে হবে");
                    } else if (bmiIndex>25 && bmiIndex<30) {
                        tvDisplayBMI.setText("আপনার BMI Index হচ্ছে:"+bmiIndex+"\nআপনার ওজন বেশি আছে , খাওয়া দাওয়া নিয়ন্ত্রন করে চলতে হবে");
                    }else{
                        tvDisplayBMI.setText("আপনার BMI Index হচ্ছে:"+bmiIndex+"\nআপনার ওজন অনেক বেশি আছে , আপনি ওবিসিটি রোগে আক্রান্ত তা্‌ই আপনাকে ডাক্তার দেখাতে হবে");
                    }
                }else {
                    tvDisplayBMI.setText("আপনি প্রতিটি খালি যায়গা পুরন করুন");
                }



            }
        });

    }
}