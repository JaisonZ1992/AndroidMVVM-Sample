package com.example.myapplication

import com.example.myapplication.models.FirebaseAnalytics
import com.example.myapplication.models.FirebaseDatabase
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.powermock.api.mockito.PowerMockito.`when`
import org.powermock.api.mockito.PowerMockito.mockStatic
import org.powermock.core.classloader.annotations.PrepareForTest
import org.powermock.modules.junit4.PowerMockRunner

@RunWith(PowerMockRunner::class)
@PrepareForTest(FirebaseAnalytics::class)
class StaticMock : BaseTest() {

    @Test
    fun staticTest(){
        mockStatic(FirebaseAnalytics::class.java)
        `when`(FirebaseAnalytics.getInstance()).thenReturn(FirebaseAnalytics())
        val firebaseAnalytics = FirebaseAnalytics.getInstance()
        Assert.assertEquals(firebaseAnalytics.title,"Jaison database")
    }
}