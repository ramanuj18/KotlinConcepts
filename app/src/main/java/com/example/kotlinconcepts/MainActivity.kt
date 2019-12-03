package com.example.kotlinconcepts

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.kotlinconcepts.model.User
import com.example.kotlinconcepts.model.UserViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val model= ViewModelProviders.of(this)[UserViewModel::class.java]
        model.loadUsers()

        model.getUsers().observe(this,
            Observer<List<User>> {
                it!!.forEach {user->
                    Log.d("users",user.userName)
                }
            })

        button.setOnClickListener {
            model.addUsers()
        }
    }
}
