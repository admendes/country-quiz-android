package com.example.quiz

import java.util.Date

data class ActivityData(
        val user_name: String,
        val quiz_type: String,
        val quiz_group: String,
        val quiz_difficulty: String,
        val date: Date,
        val correct_answers: String,
        val questions_size: String
    )