package com.example.myapplication;

import com.google.firebase.database.DatabaseReference;

public class Game {
    private Player player1;               // השחקן הראשון
    private Player player2;               // השחקן השני
    private Board board1;                 // לוח הבינגו של השחקן הראשון
    private Board board2;                 // לוח הבינגו של השחקן השני
    private Wheel wheel;                  // הגלגל שמסובב את המספרים
    private DatabaseReference database;   // חיבור ל-Firebase לשמירת נתונים
    private boolean gameInProgress;       // משתנה בוליאני שמציין אם המשחק פעיל

}
