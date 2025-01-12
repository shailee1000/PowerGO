package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Gamemode extends AppCompatActivity implements View.OnClickListener {
    private Button firsttoLine, firsttoRow, firsttotwoDiagnols, firsttoCompleteboard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamemode);
        init();
    }

    private void init() {
        firsttoLine = findViewById(R.id.line);
        firsttoLine.setOnClickListener(this);
        firsttoCompleteboard = findViewById(R.id.fullboard);
        firsttoCompleteboard.setOnClickListener(this);
        firsttoRow = findViewById(R.id.row);
        firsttoRow.setOnClickListener(this);
        firsttotwoDiagnols = findViewById(R.id.diagnols);
        firsttotwoDiagnols.setOnClickListener(this);
    }
    public boolean isFirsttoLine(String arr[][])
    {
        int count=0;
        for(int i=0;i<5;i++)
        {
            for(int k=0;k<5;k++)
            {
             if(arr[i][k]=="0")
                 count++;

            }
            if(count==5)
                return true;
            count=0;
        }
        return false;
    }
    public boolean isFirsttoRow(String arr[][])
    {
        int count=0;
        for(int i=0;i<5;i++)
        {
            for(int k=0;k<5;k++)
            {
                if(arr[k][i]=="0")
                    count++;

            }
            if(count==5)
                return true;
            count=0;
        }
        return false;
    }
    public boolean isFirsttoCompleteBoard(String arr[][])
    {
        int count=0;
        for(int i=0;i<5;i++)
        {
            for(int k=0;k<5;k++)
            {
                if(arr[i][k]=="0")
                    count++;

            }
        }
        if (count==25)
            return true;
        return false;
    }
    public boolean isFirstto2Diagnols(String arr[][]) {
        int count=0;
        boolean first=false;
        int y=4;
        int count2=0;
        for (int i = 0; i < 5; i++)
        {
            for (int k = 0; k < 5; k++)
            {
                if(arr[k][k]=="0")
                    count++;

            }
            if (count==5)
            {
                first=true;
                count=0;
            }
            if(arr[i][y]=="0")
                count2++;
            y=y-1;

        }
        if(first==true&&count2==5)
            return true;
        return false;
    }




    @Override
    public void onClick(View v) {
        if (v == firsttoLine) {
            Intent intent = new Intent(this, Board.class);
            startActivity(intent);
        }
        if (v == firsttoRow) {
            Intent intent = new Intent(this, Board.class);
            startActivity(intent);

        }
        if (v == firsttotwoDiagnols) {
            Intent intent = new Intent(this, Board.class);
            startActivity(intent);

        }
        if (v == firsttoCompleteboard) {
            Intent intent = new Intent(this, Board.class);
            startActivity(intent);
        }
    }
}

