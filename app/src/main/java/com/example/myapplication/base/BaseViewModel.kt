package com.example.myapplication.base

import androidx.lifecycle.ViewModel
import com.example.myapplication.di.component.DaggerViewModelInjector
import com.example.myapplication.di.component.ViewModelInjector
import com.example.myapplication.di.module.NetworkModule
import com.example.myapplication.di.module.ObjectModule
import com.example.myapplication.ui.post.PostListViewModel
import com.example.myapplication.ui.post.PostViewModel

abstract class BaseViewModel: ViewModel() {

    private val injector: ViewModelInjector = DaggerViewModelInjector
        .builder()
        .networkModule(NetworkModule)
        .objectModule(ObjectModule())
        .build()

    init {
        inject()
    }

    /**
     * Injects the required dependencies
     */
    private fun inject() {
        when (this) {
            is PostListViewModel -> injector.inject(this)
            is PostViewModel -> injector.inject(this)
        }
    }
}