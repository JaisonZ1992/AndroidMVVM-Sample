package com.example.myapplication.di.component

import com.example.myapplication.di.module.NetworkModule
import com.example.myapplication.di.module.ObjectModule
import com.example.myapplication.ui.post.PostListViewModel
import com.example.myapplication.ui.post.PostViewModel
import dagger.Component
import javax.inject.Singleton

/**
 * Component providing inject() methods for presenters.
 */
@Singleton
@Component(modules = [(NetworkModule::class),(ObjectModule::class)])
interface ViewModelInjector {
    /**
     * Injects required dependencies into the specified PostListViewModel.
     * @param postListViewModel PostListViewModel in which to inject the dependencies
     */
    fun inject(postListViewModel: PostListViewModel)

    fun inject(postViewModel: PostViewModel)

    @Component.Builder
    interface Builder {
        fun build(): ViewModelInjector

        fun networkModule(networkModule: NetworkModule): Builder

        fun objectModule(objectModule:ObjectModule):Builder
    }
}