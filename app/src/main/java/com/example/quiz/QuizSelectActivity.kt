package com.example.quiz

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_quiz_select.*

class QuizSelectActivity : AppCompatActivity(), View.OnClickListener {

    private var mSelectedOptionPositionQuiz: Int = 0
    private var mSelectedOptionPositionGroup: Int = 0
    private var mSelectedOptionPositionDifficulty: Int = 0
    private var mUserName: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_select)

        //window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        mUserName = intent.getStringExtra(Constants.USER_NAME)

        tv_option_flags.setOnClickListener(this)
        tv_option_capitals.setOnClickListener(this)
        tv_option_all.setOnClickListener(this)
        tv_option_europe.setOnClickListener(this)
        tv_option_africa.setOnClickListener(this)
        tv_option_asia.setOnClickListener(this)
        tv_option_america.setOnClickListener(this)
        tv_option_other.setOnClickListener(this)
        tv_option_easy.setOnClickListener(this)
        tv_option_medium.setOnClickListener(this)
        tv_option_hard.setOnClickListener(this)
        btn_start2.setOnClickListener(this)

        selectedOptionViewQuiz(tv_option_flags, 1)
        selectedOptionViewGroup(tv_option_all, 1)
        selectedOptionViewDifficulty(tv_option_easy, 1)
    }

    private fun defaultOptionsViewGroup(){
        val options = ArrayList<TextView>()
        options.add(0, tv_option_all)
        options.add(1, tv_option_europe)
        options.add(2, tv_option_africa)
        options.add(3, tv_option_asia)
        options.add(4, tv_option_america)
        options.add(5, tv_option_other)

        for(option in options){
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this, R.drawable.default_option_border_bg
            )
        }
    }

    private fun selectedOptionViewGroup(tv: TextView, selectedOptionNum: Int){
        defaultOptionsViewGroup()
        mSelectedOptionPositionGroup = selectedOptionNum

        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(
            this, R.drawable.selected_option_border_bg
        )
    }

    private fun defaultOptionsViewQuiz(){
        val options = ArrayList<TextView>()
        options.add(0, tv_option_flags)
        options.add(1, tv_option_capitals)

        for(option in options){
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this, R.drawable.default_option_border_bg
            )
        }
    }

    private fun selectedOptionViewQuiz(tv: TextView, selectedOptionNum: Int){
        defaultOptionsViewQuiz()
        mSelectedOptionPositionQuiz = selectedOptionNum

        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(
            this, R.drawable.selected_option_border_bg
        )
    }

    private fun defaultOptionsViewDifficulty(){
        val options = ArrayList<TextView>()
        options.add(0, tv_option_easy)
        options.add(1, tv_option_medium)
        options.add(2, tv_option_hard)

        for(option in options){
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this, R.drawable.default_option_border_bg
            )
        }
    }

    private fun selectedOptionViewDifficulty(tv: TextView, selectedOptionNum: Int){
        defaultOptionsViewDifficulty()
        mSelectedOptionPositionDifficulty = selectedOptionNum

        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(
            this, R.drawable.selected_option_border_bg
        )
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.tv_option_flags -> {
                selectedOptionViewQuiz(tv_option_flags, 1)
            }
            R.id.tv_option_capitals -> {
                selectedOptionViewQuiz(tv_option_capitals, 2)
            }
            R.id.tv_option_all -> {
                selectedOptionViewGroup(tv_option_all, 1)
            }
            R.id.tv_option_europe -> {
                selectedOptionViewGroup(tv_option_europe, 2)
            }
            R.id.tv_option_africa -> {
                selectedOptionViewGroup(tv_option_africa, 3)
            }
            R.id.tv_option_asia -> {
                selectedOptionViewGroup(tv_option_asia, 4)
            }
            R.id.tv_option_america -> {
                selectedOptionViewGroup(tv_option_america, 5)
            }
            R.id.tv_option_other -> {
                selectedOptionViewGroup(tv_option_other, 6)
            }
            R.id.tv_option_easy -> {
                selectedOptionViewDifficulty(tv_option_easy, 1)
            }
            R.id.tv_option_medium -> {
                selectedOptionViewDifficulty(tv_option_medium, 2)
            }
            R.id.tv_option_hard -> {
                selectedOptionViewDifficulty(tv_option_hard, 3)
            }
            R.id.btn_start2 -> {
                val intent = Intent(this, QuizQuestionActivity::class.java)
                intent.putExtra(Constants.USER_NAME, mUserName)
                intent.putExtra(Constants.QUIZZ_TYPE, mSelectedOptionPositionQuiz)
                intent.putExtra(Constants.QUIZZ_GROUP, mSelectedOptionPositionGroup)
                intent.putExtra(Constants.QUIZZ_DIFFICULTY, mSelectedOptionPositionDifficulty)
                startActivity(intent)
                //finish()
            }
        }
    }
}