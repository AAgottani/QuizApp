package com.reiscompquizapp.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val start_btn= findViewById<Button>(R.id.start_btn)
        val name_txt= findViewById<EditText>(R.id.name_txt)

        start_btn.setOnClickListener{
            if(name_txt.text.isNotEmpty()){
                val intent= Intent(this, QuizQuestions::class.java)
                intent.putExtra(Constants.USER_NAME, name_txt.text.toString())

                startActivity(intent)
                finish()
            }else{
                Toast.makeText(this, "@string/informName", Toast.LENGTH_SHORT).show()
            }
        }
    }
}