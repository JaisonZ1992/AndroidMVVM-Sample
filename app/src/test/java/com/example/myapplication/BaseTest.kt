package com.example.myapplication

import com.example.myapplication.di.component.DaggerTestAppComponent
import com.example.myapplication.di.module.TestModule
import org.junit.Before
import org.mockito.MockitoAnnotations

open class BaseTest{
    @Before
    open fun setUp() {
        val component = DaggerTestAppComponent.builder()
            .objectModule(TestModule())
            .build()
        component.inject(this)
        MockitoAnnotations.initMocks(this)
    }
}