package com.example.myapplication;

import com.google.firebase.database.DatabaseReference;

import java.util.List;

public class Wheel {
    private List<Integer> numbers;             // List of all the numbers (e.g., 1-75)
    private int currentNumber;                 // The current number being called
    private List<Integer> calledNumbers;       // List of numbers that have been called
    private DatabaseReference database;        // Firebase database reference

}
