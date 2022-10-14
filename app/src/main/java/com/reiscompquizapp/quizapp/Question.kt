package com.reiscompquizapp.quizapp

data class Question(
    val id:Int,
    val questions: String,
    val image: Int,
    val optionOne:String,
    val optiontwo:String,
    val optionthree:String,
    val optionFour:String,
    val correctAnwser:Int
)
