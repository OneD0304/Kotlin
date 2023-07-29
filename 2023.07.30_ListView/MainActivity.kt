package com.example.my_application

import com.example.my_application.databinding.ActivityMainBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ArrayAdapter

class MainActivity : AppCompatActivity() {

    val UserList = arrayListOf<User>(
        User(R.drawable.android, "Carry", "21", "안녕하세요"),
        User(R.drawable.android, "Java", "23", "반갑습니다"),
        User(R.drawable.android, "Unity", "27", "수고하세요"),
        User(R.drawable.android, "Kotlin", "22", "감사해요"),
        User(R.drawable.android, "Android", "26", "반가워요"),
        User(R.drawable.android, "Cilve", "29", "잘지내요")
    )

    override fun onCreate(savedInstanceState: Bundle?) { // 액티비티의 실행 시작지점.
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater) // layout binding class 생성
        setContentView(binding.root) // binding.root에 해당하는 layout을 표시하도록 설정

//        val item = arrayOf("사과","배","딸기","키위","복숭아")
//        //context란 한 액티비티의 모든 정보를 담고 있는 것을 의미한다.
//        binding.listView.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, item)

        val adapter = UserAdapter(this,UserList)
        binding.listView.adapter = adapter
    }
}   