package com.example.myapplication.models;

public class FirebaseManager {

    private FirebaseAnalytics firebaseAnalytics;


    public FirebaseManager() {
        this.firebaseAnalytics = FirebaseAnalytics.getInstance();
    }

    public String getFirebaseTitle(){
        return this.firebaseAnalytics.title;
    }
}
