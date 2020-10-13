package com.example.myapplication.ui.splash

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.R
import com.example.myapplication.di.ViewModelFactory
import com.example.myapplication.ui.login.LoginActivity
import com.example.myapplication.ui.post.PostListViewModel
import io.reactivex.Observable
import io.reactivex.disposables.CompositeDisposable
import java.util.concurrent.TimeUnit


class SplashActivity : AppCompatActivity() {

    private lateinit var splashViewModel: SplashViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        initViewModel()
        initObservers()
    }

    private fun initViewModel() {
        splashViewModel = ViewModelProvider(this).get(SplashViewModel::class.java)
    }

    private fun initObservers() {
        splashViewModel.initSplashScreen()
        val observer = Observer<Boolean> {
            startApplication()
        }
        splashViewModel.liveData.observe(this, observer)
    }

    private fun startApplication() {
        val intent = Intent(this@SplashActivity, LoginActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(intent)
    }

}