package com.example.intent_kotlin

import com.example.intent_kotlin.databinding.ActivitySub2Binding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Sub_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivitySub2Binding = ActivitySub2Binding.inflate(layoutInflater) // layout binding class 생성
        setContentView(binding.root) // binding.root에 해당하는 layout을 표시하도록 설정

        if (intent.hasExtra("Message"))
        {
            binding.TextViewGetMessage.text = intent.getStringExtra("Message") // 서브 액티비티의 존재하는 텍스트 뷰가 Hello World가 넘겨져 온다.
        }


    }
}