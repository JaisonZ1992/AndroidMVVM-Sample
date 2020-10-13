package com.example.myapplication.ui.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R
import com.example.myapplication.ui.post.PostListActivity


class SplashActivity : AppCompatActivity() {
    private val INTERVAL = 1500L;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        startApplication()
    }

    private fun startApplication() {
        Handler(Looper.myLooper()!!).postDelayed(Runnable {
            val intent = Intent(this@SplashActivity, PostListActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intent)
        }, INTERVAL);
    }

}