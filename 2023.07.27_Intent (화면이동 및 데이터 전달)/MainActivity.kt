package com.example.intent_kotlin

import android.content.Intent
import com.example.intent_kotlin.databinding.ActivityMainBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater) // layout binding class 생성
        setContentView(binding.root) // binding.root에 해당하는 layout을 표시하도록 설정


        binding.buttonA.setOnClickListener {
            // 버튼A 클릭 시, 새로운 액티비티(Sub_Activity)로 이동하고 메시지 전달하는 것.


            //변수란? -> 말 그대로 변할 수 있는 수를 말한다.
            //var : 변수 (값이 언제든지 변경이 가능하다.)
            //val : 자바에서는 final를 의미한다. -> 값이 변경되지 못하는 변수. (한 번 선언하면 내부적으로 그 값이 변경될 수 없음.)

            val intent = Intent(this, Sub_Activity::class.java)
            intent.putExtra("Message",binding.textViewSandMessage.text.toString())
            startActivity(intent)

        }



    }
}