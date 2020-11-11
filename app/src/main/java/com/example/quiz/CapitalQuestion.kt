package com.example.quiz

data class CapitalQuestion (
    val id: Int,
    val question: String,
    val image: Int,
    val group: String,
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val optionFour: String,
    val correctAnswer: Int,
    val difficulty: Int
)