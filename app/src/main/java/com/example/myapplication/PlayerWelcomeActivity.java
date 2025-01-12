package com.example.myapplication;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class PlayerWelcomeActivity extends AppCompatActivity implements View.OnClickListener {
    private Game game;                    // אובייקט שמנהל את המשחק
    private Settings settings;             // אובייקט שמנהל את ההגדרות של המשחק
    private Button btnStartgame, btnSettings, btnInstructions;
    private LinearLayout linearLayout;
    private ActivityResultLauncher<Intent>activityResultLauncher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Board boardGame = new Board(this);
        setContentView(R.layout.activity_player_welcome);
        init();

    }
    private void init()
    {
     btnStartgame=findViewById(R.id.btnStartgame);
     btnStartgame.setOnClickListener(this);
     btnSettings=findViewById(R.id.btnSettings);
     btnSettings.setOnClickListener(this);
     btnInstructions=findViewById(R.id.btnInstructions);
     btnInstructions.setOnClickListener(this);
     linearLayout = findViewById(R.id.linearLayout);
        activityResultLauncher = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult result) {
                        if(result.getResultCode()==RESULT_OK){
                            Intent data = result.getData();
                        }
                    }
                }
                );

    }



    @Override
    public void onClick(View v) {
        if (v==btnStartgame){
            Intent intent=new Intent(this, Gamemode.class);
            startActivity(intent);
        }
        if(v==btnSettings){
            Intent intent=new Intent(this, Settings.class);
            startActivity(intent);
        }
        if(v==btnInstructions){
            Intent intent=new Intent(this, Instructions.class);
            startActivity(intent);
        }

    }
}