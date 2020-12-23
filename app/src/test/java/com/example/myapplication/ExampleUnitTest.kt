package com.example.myapplication

import com.example.myapplication.ui.post.PostViewModel
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.powermock.core.classloader.annotations.PrepareForTest
import org.powermock.modules.junit4.PowerMockRunner


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(PowerMockRunner::class)
@PrepareForTest(PostViewModel::class)
class ExampleUnitTest: BaseTest() {

    lateinit var mockViewModel: PostViewModel

    @Test
    fun withInjection() {
        mockViewModel = PostViewModel()
        val name = mockViewModel.getUserName();
        assertEquals(name, "Jaison")
    }
}