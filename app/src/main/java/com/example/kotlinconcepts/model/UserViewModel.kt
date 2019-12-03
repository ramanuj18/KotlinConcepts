package com.example.kotlinconcepts.model

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

/**
 * created by Ramanuj Kesharawani on 26/7/19
 */
class UserViewModel :ViewModel() {
    var user= arrayListOf<User>()
    private lateinit var users:MutableLiveData<List<User>>
    fun getUsers():LiveData<List<User>>{
      //  users.value=user
        return users
    }
     fun loadUsers(){
        users= MutableLiveData()
        user.add(User("rama",7755453423,"lig colony indore"))
        user.add(User("rahul",9867543456,"vijay nagar"))
        user.add(User("ravi",7677564534,"palasia"))
        users.value=user
    }

     fun addUsers(){
        user.add(User("aman",8988765645,"chakghat rewa"))
         users.postValue(user)
    }
}