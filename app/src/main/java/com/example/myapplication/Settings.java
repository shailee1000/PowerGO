package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Settings extends AppCompatActivity {

        private boolean soundEnabled;         // אם הצלילים פעילים
        private boolean animationsEnabled;    // אם האנימציות פעילים
        private int difficultyLevel;          // רמת קושי של המשחק
        private String theme;                 // נושא המשחק (צבעים, תמונות, וכו')


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
    }
}