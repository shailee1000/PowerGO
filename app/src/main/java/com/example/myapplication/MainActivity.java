package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private LinearLayout linearLayout;
    private Button btnHost,btnPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private void init()
    {
        btnHost=findViewById(R.id.BtnHost);
        btnHost.setOnClickListener(this);
        btnPlayer=findViewById(R.id.Btnplayer);
        btnPlayer.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v==btnHost){
            Intent intent=new Intent(this, HostWelcomeActivity.class);
            startActivity(intent);
        }
        if(v==btnPlayer){
            Intent intent=new Intent(this, PlayerWelcomeActivity.class);
            startActivity(intent);
        }


    }
}