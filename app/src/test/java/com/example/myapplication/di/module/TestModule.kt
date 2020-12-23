package com.example.myapplication.di.module

import com.example.myapplication.models.User
import org.mockito.Mockito

class TestModule : ObjectModule(){
    override fun providesUser(): User {
        return Mockito.mock(User::class.java)
    }
}