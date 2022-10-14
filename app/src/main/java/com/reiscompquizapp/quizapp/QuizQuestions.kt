package com.reiscompquizapp.quizapp

import android.content.ContentValues.TAG
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.core.content.ContextCompat
import com.google.android.gms.ads.*
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback

class QuizQuestions : AppCompatActivity(), View.OnClickListener  {
//app id ca-app-pub-6878613861493968~4381729686

    private var mCurrentPosition: Int=1////colocar 1
    private var mQuestionList:ArrayList<Question>?=null
    private var mSelectedOptionPosition: Int=0
    private var mUserName: String?= null
    private var mCorrectAnswers: Int =0
    private var answered= false
    private var oneAnswser= false
    private var progressBar: ProgressBar?=null
    private var tvProgress: TextView?= null
    private var tvQuestion: TextView?=null
    private var ivImage: ImageView?=null
    private var optionOne: TextView?=null
    private var optionTwo: TextView?=null
    private var optionThree: TextView?=null
    private var optionFour: TextView?=null
    private var btnSubmit: Button?= null


    private var mInterstitialAd: InterstitialAd? = null
    private final var TAG = "QuizQuestions"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)


        mUserName= intent.getStringExtra(Constants.USER_NAME)
        mQuestionList = Constants.getQuestions()
        progressBar = findViewById(R.id.progressBar)
        tvProgress = findViewById(R.id.tv_progress)
        tvQuestion = findViewById(R.id.tv_question)
        ivImage = findViewById(R.id.iv_image)
        optionOne = findViewById(R.id.optionOne)
        optionTwo = findViewById(R.id.optionTwo)
        optionThree = findViewById(R.id.optionThree)
        optionFour = findViewById(R.id.optionFour)
        btnSubmit= findViewById(R.id.btn_submit)

        optionOne?.setOnClickListener(this)
        optionTwo?.setOnClickListener(this)
        optionThree?.setOnClickListener(this)
        optionFour?.setOnClickListener(this)
        btnSubmit?.setOnClickListener(this)

        setQuestion()

        MobileAds.initialize(this@QuizQuestions)
        //test ca-app-pub-3940256099942544/1033173712
        var adRequest = AdRequest.Builder().build()

        InterstitialAd.load(this,"ca-app-pub-3940256099942544/1033173712", adRequest, object : InterstitialAdLoadCallback() {
            override fun onAdFailedToLoad(adError: LoadAdError) {
                adError?.toString()?.let { Log.d(TAG, it) }
                mInterstitialAd = null
            }

            override fun onAdLoaded(interstitialAd: InterstitialAd) {

                mInterstitialAd = interstitialAd
            }
        })

        mInterstitialAd?.fullScreenContentCallback = object: FullScreenContentCallback() {
            override fun onAdClicked() {
                // Called when a click is recorded for an ad.
                Log.d(TAG, "Ad was clicked.")
            }

            override fun onAdDismissedFullScreenContent() {
                // Called when ad is dismissed.
                Log.d(TAG, "Ad dismissed fullscreen content.")
                mInterstitialAd = null
            }

            override fun onAdFailedToShowFullScreenContent(p0: AdError) {
                // Called when ad fails to show.
                Log.e(TAG, "Ad failed to show fullscreen content.")
                mInterstitialAd = null
            }

            override fun onAdImpression() {
                // Called when an impression is recorded for an ad.
                Log.d(TAG, "Ad recorded an impression.")
            }

            override fun onAdShowedFullScreenContent() {
                // Called when ad is shown.
                Log.d(TAG, "Ad showed fullscreen content.")
            }
        }

    }

    private fun setQuestion() {
        answered=false
        defaultOptionsView()
        val question: Question = mQuestionList!![mCurrentPosition - 1]
        progressBar?.progress = mCurrentPosition
        ivImage?.setImageResource(question.image)
        var progressCount= mCurrentPosition
        tvProgress?.text = "$progressCount /${progressBar?.max}"
        tvQuestion?.text = getResources().getString(R.string.whoPaint)
        optionOne?.text = question.optionOne
        optionTwo?.text = question.optiontwo
        optionThree?.text = question.optionthree
        optionFour?.text = question.optionFour

        if (mInterstitialAd != null) {
            mInterstitialAd?.show(this)
        } else {
            Log.d("TAG", "The interstitial ad wasn't ready yet.")
        }

        if(mCurrentPosition == mQuestionList!!.size){
            btnSubmit?.text= "Finish"
        }
    }

    private fun defaultOptionsView(){
        val options =ArrayList<TextView>()
        optionOne?.let{
            options.add(0,it)
        }
        optionTwo?.let{
            options.add(1,it)
        }
        optionThree?.let{
            options.add(2,it)
        }
        optionFour?.let{
            options.add(3,it)
        }

        for (option in options){
            option.setTextColor(Color.parseColor("#7A8389"))
            option.typeface= Typeface.DEFAULT
            option.background= ContextCompat.getDrawable(
                this,
                R.drawable.default_option_border_bg
            )
        }
        btnSubmit?.setText(getResources().getString(R.string.submit))
    }

    private fun selectedOptionView(tv: TextView, selectedOpitionNum:Int){
            defaultOptionsView()
            mSelectedOptionPosition= selectedOpitionNum
            tv.setTextColor(Color.parseColor("#363A43"))
            tv.setTypeface(tv.typeface, Typeface.BOLD)
            tv.background= ContextCompat.getDrawable(
                this,
                R.drawable.selected_option_border_bg
            )
    }

    override fun onClick(view: View?) {

        when(view?.id) {
            R.id.optionOne -> {
                if (answered == false){
                    optionOne?.let {
                        selectedOptionView(it, 1)

                    }
            }
            }

            R.id.optionTwo -> {
                if (answered == false){
                optionTwo?.let {
                    selectedOptionView(it, 2)

                }
                }
            }

            R.id.optionThree -> {
                if (answered == false) {
                    optionThree?.let {
                        selectedOptionView(it, 3)
                    }
                }
            }

            R.id.optionFour -> {
                if (answered == false) {
                    optionFour?.let {
                        selectedOptionView(it, 4)
                    }
                }
            }



            R.id.btn_submit -> {
                if(oneAnswser) {

                    mCurrentPosition++
                    mSelectedOptionPosition=0
                    oneAnswser=false
                    answered=false
                }

                if(mCurrentPosition <= mQuestionList!!.size){

                    setQuestion()
                    btnSubmit?.setText(getResources().getString(R.string.next))

                    //*************************************
                    //Checa se uma posição foi escolhida
                    if(mSelectedOptionPosition!=0) {

                        answered= true
                        oneAnswser=true
                    }
                    //Se foi muda a cor
                    if (answered) {
                        val question = mQuestionList?.get(mCurrentPosition - 1)
                        if (question!!.correctAnwser != mSelectedOptionPosition) {
                            answerView(mSelectedOptionPosition, R.drawable.wrong_option_border_bg)
                        } else {
                            answerView(question.correctAnwser, R.drawable.correct_option_border_bg)
                            mCorrectAnswers++
                        }
                    }
                    //**********************************
                }else{
                    val intent = Intent(this, ResultActivity::class.java)
                    intent.putExtra(Constants.USER_NAME, mUserName)
                    intent.putExtra(Constants.CORRECT_ANSWERS, mCorrectAnswers)
                    intent.putExtra(Constants.TOTAL_QUESTIONS, mQuestionList!!.size)
                    startActivity(intent)
                    finish()
                }
              // mCurrentPosition++
            }//btn
            }//when

    }//onClick

    private fun answerView(answer: Int, drawableView: Int){

        when (answer){
            1->{
                optionOne?.background=ContextCompat.getDrawable(
                    this,
                    drawableView
                )
            }
            2->{
                optionTwo?.background=ContextCompat.getDrawable(
                    this,
                    drawableView
                )
            }
            3->{
                optionThree?.background=ContextCompat.getDrawable(
                    this,
                    drawableView
                )
            }
            4->{
                optionFour?.background=ContextCompat.getDrawable(
                    this,
                    drawableView
                )
            }
        }
    }
}