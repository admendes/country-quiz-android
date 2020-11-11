package com.example.quiz

import android.content.DialogInterface
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_quiz_question.*


class QuizQuestionActivity : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition: Int = 1;
    private var mQuestionList: ArrayList<FlagQuestion>? = null
    private var mCapitalQuestion: ArrayList<CapitalQuestion>? = null
    private var mSelectedOptionPosition: Int = 0
    private var mCorrectAnswers: Int = 0
    private var mUserName: String? = null
    private var mAnswered: Boolean = false
    private var mSelected: Boolean = false
    private var mQuizType: Int = 0
    private var mQuizGroup: Int = 0
    private var mQuizGroupString: String? = null
    private var mQuizDifficulty: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_question)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        mUserName = intent.getStringExtra(Constants.USER_NAME)
        mQuizType = intent.getIntExtra(Constants.QUIZZ_TYPE, 0)
        mQuizGroup = intent.getIntExtra(Constants.QUIZZ_GROUP, 0)
        mQuizDifficulty = intent.getIntExtra(Constants.QUIZZ_DIFFICULTY, 0)

        if(mQuizGroup==1){
            mQuizGroupString = "All"
        }
        else if(mQuizGroup==2){
            mQuizGroupString = "Europe"
        }
        else if(mQuizGroup==3){
            mQuizGroupString = "Africa"
        }
        else if(mQuizGroup==4){
            mQuizGroupString = "Asia"
        }
        else if(mQuizGroup==5){
            mQuizGroupString = "America"
        }
        else{
            mQuizGroupString = "Other"
        }

        if(mQuizType == 1){
            mQuestionList = Constants.getFlagQuestions()
            mQuestionList!!.shuffle()

            if(mQuizDifficulty!=3 && mQuizGroup!=6) {
                val iterator = mQuestionList!!.iterator()
                while(iterator.hasNext()){
                    val question = iterator.next()
                    if(question.difficulty > mQuizDifficulty){
                        iterator.remove()
                    }
                }
            }

            if(mQuizGroup!=1) {
                val iterator = mQuestionList!!.iterator()
                while(iterator.hasNext()){
                    val question = iterator.next()
                    if(question.group != mQuizGroupString){
                        iterator.remove()
                    }
                }
                while(mQuizDifficulty !=3 && mQuestionList!!.size > Constants.getDifficulty(mQuizDifficulty)){
                    mQuestionList!!.removeAt(0)
                }
            }
            else {
                while (mQuizDifficulty !=3 && mQuestionList!!.size > Constants.getDifficultyAll(mQuizDifficulty)) {
                    mQuestionList!!.removeAt(0)
                }
            }

            progressBar.max = mQuestionList!!.size
        }
        else{
            mCapitalQuestion = Constants.getCapitalQuestions()
            mCapitalQuestion!!.shuffle()

            if(mQuizDifficulty!=3 && mQuizGroup!=6) {
                val iterator = mCapitalQuestion!!.iterator()
                while(iterator.hasNext()){
                    val question = iterator.next()
                    if(question.difficulty > mQuizDifficulty){
                        iterator.remove()
                    }
                }
            }

            if(mQuizGroup!=1) {
                val iterator = mCapitalQuestion!!.iterator()
                while(iterator.hasNext()){
                    val question = iterator.next()
                    if(question.group != mQuizGroupString){
                        iterator.remove()
                    }
                }
                while(mQuizDifficulty !=3 && mCapitalQuestion!!.size > Constants.getDifficulty(mQuizDifficulty)){
                    mCapitalQuestion!!.removeAt(0)
                }
            }
            else{
                while(mQuizDifficulty !=3 && mCapitalQuestion!!.size > Constants.getDifficultyAll(mQuizDifficulty)){
                    mCapitalQuestion!!.removeAt(0)
                }
            }

            progressBar.max = mCapitalQuestion!!.size
        }

        setQuestion()

        //Log.i("Questions Size", "${mQuestionList!!.size}")

        tv_option_one.setOnClickListener(this)
        tv_option_two.setOnClickListener(this)
        tv_option_three.setOnClickListener(this)
        tv_option_four.setOnClickListener(this)
        btn_submit.setOnClickListener(this)
    }

    private fun setQuestion(){
        mAnswered = false
        mSelected = false
        defaultOptionsView()
        progressBar.progress = mCurrentPosition
        tv_progress.text = "$mCurrentPosition" + "/" + progressBar.max

        if(mQuizType == 1) {
            val question: FlagQuestion? = mQuestionList!![mCurrentPosition - 1]

            if (mCurrentPosition == mQuestionList!!.size) {
                btn_submit.text = "FINISH"
            } else {
                btn_submit.text = "SUBMIT"
            }

            tv_question.text = question!!.question
            iv_image.setImageResource(question!!.image)
            tv_option_one.text = question.optionOne
            tv_option_two.text = question.optionTwo
            tv_option_three.text = question.optionThree
            tv_option_four.text = question.optionFour
        }
        else{
            val question: CapitalQuestion? = mCapitalQuestion!![mCurrentPosition - 1]

            if (mCurrentPosition == mCapitalQuestion!!.size) {
                btn_submit.text = "FINISH"
            } else {
                btn_submit.text = "SUBMIT"
            }

            tv_question.text = question!!.question
            //iv_image.setImageResource(question!!.image)
            tv_option_one.text = question.optionOne
            tv_option_two.text = question.optionTwo
            tv_option_three.text = question.optionThree
            tv_option_four.text = question.optionFour
        }
    }

    private fun defaultOptionsView(){
        val options = ArrayList<TextView>()
        options.add(0, tv_option_one)
        options.add(1, tv_option_two)
        options.add(2, tv_option_three)
        options.add(3, tv_option_four)

        for(option in options){
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this, R.drawable.default_option_border_bg
            )
        }
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.tv_option_one -> {
                selectedOptionView(tv_option_one, 1)
            }
            R.id.tv_option_two -> {
                selectedOptionView(tv_option_two, 2)
            }
            R.id.tv_option_three -> {
                selectedOptionView(tv_option_three, 3)
            }
            R.id.tv_option_four -> {
                selectedOptionView(tv_option_four, 4)
            }
            R.id.btn_submit -> {
                if (mSelected) {
                    if (mQuizType == 1) {
                        if (mSelectedOptionPosition == 0) {
                            mCurrentPosition++
                            when {
                                mCurrentPosition <= mQuestionList!!.size -> {
                                    setQuestion()
                                }
                                else -> {
                                    val intent = Intent(this, ResultActivity::class.java)
                                    intent.putExtra(Constants.USER_NAME, mUserName)
                                    intent.putExtra(Constants.CORRECT_ANSWERS, mCorrectAnswers)
                                    intent.putExtra(Constants.TOTAL_QUESTIONS, mQuestionList!!.size)
                                    intent.putExtra(Constants.QUIZZ_TYPE, mQuizType)
                                    intent.putExtra(Constants.QUIZZ_GROUP, mQuizGroup)
                                    intent.putExtra(Constants.QUIZZ_DIFFICULTY, mQuizDifficulty)
                                    startActivity(intent)
                                    finish()
                                }
                            }
                        } else {
                            val question = mQuestionList?.get(mCurrentPosition - 1)
                            if (question!!.correctAnswer != mSelectedOptionPosition) {
                                answerView(
                                    mSelectedOptionPosition,
                                    R.drawable.wrong_option_border_bg
                                )
                            } else {
                                if (!mAnswered) {
                                    mCorrectAnswers++
                                }
                            }
                            answerView(question.correctAnswer, R.drawable.correct_option_border_bg)
                            mAnswered = true

                            if (mCurrentPosition == mQuestionList!!.size) {
                                btn_submit.text = "FINISH"
                            } else {
                                btn_submit.text = "GO TO NEXT QUESTION"
                            }
                            mSelectedOptionPosition = 0
                        }
                    } else {
                        if (mSelectedOptionPosition == 0) {
                            mCurrentPosition++
                            when {
                                mCurrentPosition <= mCapitalQuestion!!.size -> {
                                    setQuestion()
                                }
                                else -> {
                                    val intent = Intent(this, ResultActivity::class.java)
                                    intent.putExtra(Constants.USER_NAME, mUserName)
                                    intent.putExtra(Constants.CORRECT_ANSWERS, mCorrectAnswers)
                                    intent.putExtra(
                                        Constants.TOTAL_QUESTIONS,
                                        mCapitalQuestion!!.size
                                    )
                                    intent.putExtra(Constants.QUIZZ_TYPE, mQuizType)
                                    intent.putExtra(Constants.QUIZZ_GROUP, mQuizGroup)
                                    intent.putExtra(Constants.QUIZZ_DIFFICULTY, mQuizDifficulty)
                                    startActivity(intent)
                                    finish()
                                }
                            }
                        } else {
                            val question = mCapitalQuestion?.get(mCurrentPosition - 1)
                            if (question!!.correctAnswer != mSelectedOptionPosition) {
                                answerView(
                                    mSelectedOptionPosition,
                                    R.drawable.wrong_option_border_bg
                                )
                            } else {
                                if (!mAnswered) {
                                    mCorrectAnswers++
                                }
                            }
                            answerView(question.correctAnswer, R.drawable.correct_option_border_bg)
                            mAnswered = true

                            if (mCurrentPosition == mCapitalQuestion!!.size) {
                                btn_submit.text = "FINISH"
                            } else {
                                btn_submit.text = "GO TO NEXT QUESTION"
                            }
                            mSelectedOptionPosition = 0
                        }
                    }
                }
                else{
                    Toast.makeText(this, "Please select an answer", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    override fun onBackPressed() {
        val alertdialog: android.app.AlertDialog.Builder = android.app.AlertDialog.Builder(this)
        alertdialog.setTitle("Exit quiz?")
        //alertdialog.setMessage("Exit quiz?")
        alertdialog.setPositiveButton("Yes",
            DialogInterface.OnClickListener { dialog, which ->
                val intent = Intent(this, QuizSelectActivity::class.java)
                startActivity(intent)
                this.finish()
            })
        alertdialog.setNegativeButton("No",
            DialogInterface.OnClickListener { dialog, which -> dialog.cancel() })
        val alert: android.app.AlertDialog? = alertdialog.create()
        alertdialog.show()
    }

    private fun answerView(answer: Int, drawableView: Int){
        when(answer){
            1 -> {
                tv_option_one.background = ContextCompat.getDrawable(this, drawableView)
            }
            2 -> {
                tv_option_two.background = ContextCompat.getDrawable(this, drawableView)
            }
            3 -> {
                tv_option_three.background = ContextCompat.getDrawable(this, drawableView)
            }
            4 -> {
                tv_option_four.background = ContextCompat.getDrawable(this, drawableView)
            }
        }
    }

    private fun selectedOptionView(tv: TextView, selectedOptionNum: Int){
        if(!mAnswered) {
            defaultOptionsView()
            mSelectedOptionPosition = selectedOptionNum

            tv.setTextColor(Color.parseColor("#363A43"))
            tv.setTypeface(tv.typeface, Typeface.BOLD)
            tv.background = ContextCompat.getDrawable(
                this, R.drawable.selected_option_border_bg
            )
            mSelected = true
        }
    }
}