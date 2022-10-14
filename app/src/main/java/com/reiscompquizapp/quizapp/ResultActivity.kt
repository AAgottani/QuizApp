package com.reiscompquizapp.quizapp

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.gms.ads.MobileAds
import com.google.android.gms.ads.interstitial.InterstitialAd

class ResultActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvName: TextView? = findViewById(R.id.tv_name)
        val tvScore: TextView= findViewById(R.id.tv_score)
        val btnFinish: Button= findViewById(R.id.btn_finish)
        val btnRate: Button= findViewById(R.id.btn_rate)
        val congrats: TextView= findViewById(R.id.congrats)

        tvName?.text = intent.getStringExtra(Constants.USER_NAME)

        val totalQuestions= intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correctAnswers= intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)
        tvScore.text= "$correctAnswers/$totalQuestions"
        if(correctAnswers in 0..10 ){
            congrats.text= getResources().getString(R.string.doBetter)
        }else if(correctAnswers in 11..20){
            congrats.text= getResources().getString(R.string.veryGood)
        }else if(correctAnswers in 20..29){
            congrats.text= getResources().getString(R.string.excel)
        }else{
            congrats.text= getResources().getString(R.string.perfect)
        }

        btnFinish.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))

        }

        btnRate.setOnClickListener {
            try{startActivity(Intent(Intent.ACTION_VIEW,
                Uri.parse(
                    "https://play.google.com/store/apps/developer?id=AstrusDev")))}
            catch (e: ActivityNotFoundException){
                startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/developer?id=AstrusDev")))
            }


        }



    }
}