package com.example.myapplication.ui.splash

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R
import com.example.myapplication.ui.login.LoginActivity
import io.reactivex.Observable
import io.reactivex.disposables.CompositeDisposable
import java.util.concurrent.TimeUnit


class SplashActivity : AppCompatActivity() {
    private val INTERVAL = 2L
    private val compositeDisposable = CompositeDisposable()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        startMainActivityUsingRxJava()
    }

    override fun onStop() {
        super.onStop()
        compositeDisposable.dispose()
    }

    private fun startMainActivityUsingRxJava() {
        compositeDisposable.add(
            Observable.timer(INTERVAL, TimeUnit.SECONDS)
                .subscribe {
                    startApplication()
                })
    }

    private fun startApplication() {
        val intent = Intent(this@SplashActivity, LoginActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(intent)
    }

}