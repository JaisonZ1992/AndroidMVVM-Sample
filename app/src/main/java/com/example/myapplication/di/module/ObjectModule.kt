package com.example.myapplication.di.module

import com.example.myapplication.models.User
import dagger.Module
import dagger.Provides

@Module
open class ObjectModule {

    @Provides
    open fun providesUser(): User {
        return User();
    }
}