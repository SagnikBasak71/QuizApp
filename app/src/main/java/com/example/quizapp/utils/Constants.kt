package com.example.quizapp.utils

import com.example.quizapp.R
import com.example.quizapp.model.Question

object Constants {
    const val USER_Name= "user_name"
    const val TOTAL_Questions="total_questions"
    const val SCORE="correct_ans"

    fun getQuestions():MutableList<Question>{
        val questions= mutableListOf<Question>()

        val quest1=Question(
            1, "What country does this flag belong?",
            R.drawable.brazil,"Italy","Brazil","India","Germany",
            2
        )
        questions.add(quest1)

        val quest2=Question(
            2, "What country does this flag belong?",
            R.drawable.france,"France","Brazil","Hungary","Snovakia",
            1
        )
        questions.add(quest2)

        val quest3=Question(
            3, "What country does this flag belong?",
            R.drawable.spain,"Italy","Argentina","India","Spain",
            4
        )
        questions.add(quest3)

        val quest4=Question(
            1, "What country does this flag belong?",
            R.drawable.finland,"Finland","Ivory Coast","India","Germany",
            1
        )
        questions.add(quest4)

        val quest5=Question(
            5, "What country does this flag belong?",
            R.drawable.argentina,"Italy","Brazil","Argentina","Germany",
            3
        )
        questions.add(quest5)

        val quest6=Question(
            6, "What country does this flag belong?",
            R.drawable.germany,"Italy","India","Pakistan","Germany",
            4
        )
        questions.add(quest6)
        return questions
    }
}