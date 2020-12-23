package com.example.myapplication.ui.post

import androidx.lifecycle.MutableLiveData
import com.example.myapplication.base.BaseViewModel
import com.example.myapplication.models.Post
import com.example.myapplication.models.User
import javax.inject.Inject

class PostViewModel: BaseViewModel() {


    @Inject
    lateinit var user: User

    private val postTitle = MutableLiveData<String>()
    private val postBody = MutableLiveData<String>()

    fun getUserName():String{
        return user.firebaseTitle
    }

    fun bind(post: Post){
        postTitle.value = post.title
        postBody.value = post.body
    }

    fun getPostTitle():MutableLiveData<String>{
        return postTitle
    }

    fun getPostBody(): MutableLiveData<String> {
        return postBody
    }
}