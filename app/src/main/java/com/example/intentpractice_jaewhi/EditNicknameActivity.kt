package com.example.intentpractice_jaewhi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit_nickname.*

class EditNicknameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_nickname)

        okBtn.setOnClickListener {

//          입력한 새 닉네임이 뭔지? 변수로 저장.
            val inputNewNickname = newNicknameEdt.text.toString()
//          입력한 닉네임을 가지고 메인으로 복귀

//          입력님네임을 담아주기 위한 용도로만 사용하는 Intent
            val resultIntent = Intent()
//          수하물 추가하자. nickname이란 꼬리표에 inputNewNickname을!
            resultIntent.putExtra("nickname",inputNewNickname)
//          확인버튼을 누른게 맞아요! 라는 걸 표현해주자.
            setResult(RESULT_OK,resultIntent)
            finish()


        }

    }
}