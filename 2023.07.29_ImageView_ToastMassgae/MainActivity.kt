package com.example.my_application

import com.example.my_application.databinding.ActivityMainBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater) // layout binding class 생성
        setContentView(binding.root) // binding.root에 해당하는 layout을 표시하도록 설정


    binding.buttonToast.setOnClickListener {

        binding.IvProfile.setImageResource(R.drawable.android2) // 이미지 뷰에 새로운 이미지 등록
        Toast.makeText(this@MainActivity, "버튼이 클릭되었습니다.", Toast.LENGTH_SHORT).show()


    }


    }
}