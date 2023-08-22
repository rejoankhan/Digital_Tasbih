package com.android.digitaltasbih;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvCount;
    Button buttonAdd, buttonSub, buttonReset, suraMuluk,arRahman, gojol1, newPage;
    int count = 0;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvCount = findViewById(R.id.tvCount);
        buttonAdd = findViewById(R.id.buttonAdd);
        buttonSub = findViewById(R.id.buttonSub);
        buttonReset = findViewById(R.id.buttonReset);
        suraMuluk = findViewById(R.id.suraMuluk);
        arRahman = findViewById(R.id.arRahman);
        gojol1 = findViewById(R.id.gojol1);
        newPage = findViewById(R.id.newPage);



        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                tvCount.setText("" + count);
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count--;
                tvCount.setText("" + count);
            }
        });
        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = 0;
                tvCount.setText("" + count);
            }
        });
        suraMuluk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                VideoPlayer.video_url="https://www.youtube.com/embed/l9oasELM_sY";
                Intent intent = new Intent(MainActivity.this,VideoPlayer.class);
                startActivity(intent);
            }
        });
        arRahman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                VideoPlayer.video_url="https://www.youtube.com/embed/sLuR-4YxEns";
                Intent intent = new Intent(MainActivity.this,VideoPlayer.class);
                startActivity(intent);

            }
        });
        gojol1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                VideoPlayer.video_url="https://www.youtube.com/embed/OV1y1ddlh80";
                Intent intent = new Intent(MainActivity.this,VideoPlayer.class);
                startActivity(intent);

            }
        });
        newPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this,AnimationActivity.class);
                startActivity(myIntent);
            }
        });


    }
    public boolean onKeyDown(int keyCode, KeyEvent event){
        if (keyCode==KeyEvent.KEYCODE_BACK){
            exitByBackKey();
            return true;
        }
        return super.onKeyDown(keyCode,event);
    }
    protected void exitByBackKey(){
        AlertDialog alartbox = new AlertDialog.Builder(this)
                .setMessage("আাপনি কি এ্যাপ থেকে বের হতে চাচ্ছেন")
                .setPositiveButton("হ্যা", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0,int arg1) {
                        finish();

                    }
                })
                .setNegativeButton("না", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0,int arg1) {

                    }
                })
                .show();
    }
}