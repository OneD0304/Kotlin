package com.example.my_application

import com.example.my_application.databinding.ActivityMainBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater) // layout binding class 생성
        setContentView(binding.root) // binding.root에 해당하는 layout을 표시하도록 설정

        binding.ButtonGetText.setOnClickListener { // 에딧 텍스트에 입력되어있는 값을 가지고와서 텍스트뷰에 뿌리는 것.
            var resultText = binding.EditText.text.toString() // 에딧 텍스트에 입력되어있는 값.
            binding.TextViewResult.text = resultText // 입력된 값을 텍스트 뷰에 설정하는 것.
        }
    }
}