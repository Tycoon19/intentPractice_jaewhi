package com.example.intentpractice_jaewhi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_other.*

class OtherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)

//        이전 화면으로 돌아가기 (MainActivity)

        returnToMainBtn.setOnClickListener {

//            val myIntent = Intent(this, MainActivity::class.java)
//            startActivity(myIntent)

            finish()

        }

    }
}