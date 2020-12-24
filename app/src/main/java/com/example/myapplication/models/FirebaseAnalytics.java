package com.example.myapplication.models;

public final class FirebaseAnalytics {
    String title = "Jaison";
    private FirebaseDatabase firebaseDatabase;

    public static FirebaseAnalytics getInstance() {
        return new FirebaseAnalytics();
    }

    public FirebaseAnalytics(){
        firebaseDatabase = FirebaseDatabase.getInstance();
    }

    public String getTitle(){
        return firebaseDatabase.title;
    }
}
