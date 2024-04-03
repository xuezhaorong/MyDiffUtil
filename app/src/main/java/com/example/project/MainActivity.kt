package com.example.project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.project.databinding.ActivityMainBinding
import com.example.project.diffutil.UserAdapter
import com.example.project.room.User

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (!::binding.isInitialized){
            binding = ActivityMainBinding.inflate(layoutInflater)
        }
        setContentView(binding.root)

        binding.recyclerview.layoutManager = LinearLayoutManager(this)

        val userAdapter = UserAdapter(this)
        binding.recyclerview.adapter = userAdapter

        val UserList:List<User> = listOf(User(1,"1","1"),User(2,"2","2"))

        userAdapter.submitList(UserList)

        val UserList2:List<User> = listOf(User(1,"1","1"),User(2,"2","2"),User(3,"3","3"))

        userAdapter.submitList(UserList2)


    }
}