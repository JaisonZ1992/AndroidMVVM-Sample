package com.example.myapplication.di.module

import com.example.myapplication.models.FirebaseManager
import org.mockito.Mockito

class TestModule : ObjectModule(){
    override fun providesUser(): FirebaseManager {
        return Mockito.mock(FirebaseManager::class.java)
    }
}