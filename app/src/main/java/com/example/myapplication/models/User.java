package com.example.myapplication.models;

public class User {

    private FirebaseAnalytics firebaseAnalytics;


    public User() {
        this.firebaseAnalytics = FirebaseAnalytics.getInstance();
    }

    public String getFirebaseTitle(){
        return this.firebaseAnalytics.title;
    }
}
