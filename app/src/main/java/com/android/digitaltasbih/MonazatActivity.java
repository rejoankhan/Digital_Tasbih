package com.android.digitaltasbih;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MonazatActivity extends AppCompatActivity {
    TextView monazat1,monazat2, monazat3, monazat4,monazat5,monazat6,monazat7,looptest,tvDisplay2;
    Button buttonChkInternet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monazat);

        monazat1 = findViewById(R.id.monazat1);
        monazat2 = findViewById(R.id.monazat2);
        monazat3 = findViewById(R.id.monazat3);
        monazat4 = findViewById(R.id.monazat4);
        monazat5 = findViewById(R.id.monazat5);
        monazat6 = findViewById(R.id.monazat6);
        monazat7 = findViewById(R.id.monazat7);
        looptest = findViewById(R.id.monazat8);
        tvDisplay2 = findViewById(R.id.tvDisplay2);
        buttonChkInternet = findViewById(R.id.buttonChkInternet);


        monazat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvDisplay2.setText("ইন্নাল্লাহা ইউসমিউ মাই-ইয়াসা");
            }

        });
        monazat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvDisplay2.setText("হাসবিয়াল্লাহু লা ইলাহা ইল্লা হুয়া ‘আলাইহি তাওয়াক্কালতু ওয়া হুয়া রাববুল ‘আরশিল আযীম");
            }
        });
        buttonChkInternet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkInternet()){
                    Toast.makeText(MonazatActivity.this, "Network is Connected", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MonazatActivity.this, "Network Fail", Toast.LENGTH_SHORT).show();
                }


            }
            private boolean checkInternet(){
                ConnectivityManager connectivityManager = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();

                if(networkInfo.isConnected()){
                    return  true;
                }else{
                    return false;
                }


            }


        });
        monazat3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showToast("আস্তাগফিরুল্লাহ \n" +
                            "হাল্লাযি লা ইলা-হা ইল্লা হুয়াল\n" +
                            "হাইউল কাইউম অ আতুবু ইলাইহি");


                }


                private void showToast(String mystring){
                    Toast.makeText(MonazatActivity.this, ""+mystring, Toast.LENGTH_LONG).show();

                }

            });
        looptest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MonazatActivity.this,LoopActivity.class);
                startActivity(intent);
            }
        });





        }
}