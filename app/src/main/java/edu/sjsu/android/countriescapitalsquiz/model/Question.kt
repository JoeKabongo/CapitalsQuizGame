package edu.sjsu.android.countriescapitalsquiz.model

data class Question(
    val id: Int,
    val country: String,
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val optionFour: String,
    val correctAnswer: Int
)