package com.example.myapplication.di.component

import com.example.myapplication.BaseTest
import com.example.myapplication.di.module.NetworkModule
import com.example.myapplication.di.module.ObjectModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [(NetworkModule::class),(ObjectModule::class)])
interface TestAppComponent: ViewModelInjector{
    fun inject(testClass: BaseTest)
}