package com.example.myapplication.ui.splash

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivitySplashBindingImpl
import com.example.myapplication.ui.login.LoginActivity


class SplashActivity : AppCompatActivity() {

    private lateinit var viewModel: SplashViewModel
    private lateinit var binding: ActivitySplashBindingImpl

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViews()
        initViewModel()
        initObservers()
    }

    private fun initViews() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_splash)
    }

    private fun initViewModel() {
        viewModel = ViewModelProvider(this).get(SplashViewModel::class.java)
    }

    private fun initObservers() {
        viewModel.initSplashScreen()
        val observer = Observer<Int> {
            startApplication()
        }
        viewModel.loadingVisibility.observe(this, observer)
        binding.viewModel = viewModel
    }

    private fun startApplication() {
        val intent = Intent(this@SplashActivity, LoginActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(intent)
    }

}