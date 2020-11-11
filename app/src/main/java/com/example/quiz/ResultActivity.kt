package com.example.quiz

import android.content.Intent
import android.os.AsyncTask
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_result.*
import org.json.JSONObject
import java.net.URL

class ResultActivity : AppCompatActivity() {

    private var mQuestionSize: Int = 0
    private var mCorrectAnswers: Int = 0
    private var mUserName: String? = null
    private var mQuizType: Int = 0
    private var mQuizGroup: Int = 0
    private var mQuizDifficulty: Int = 0

    private var mAuthTask2: SubmitActivity? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        mUserName = intent.getStringExtra(Constants.USER_NAME)
        mCorrectAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)
        mQuizType = intent.getIntExtra(Constants.QUIZZ_TYPE, 0)
        mQuizGroup = intent.getIntExtra(Constants.QUIZZ_GROUP, 0)
        mQuizDifficulty = intent.getIntExtra(Constants.QUIZZ_DIFFICULTY, 0)
        mQuestionSize = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)

        tv_name.text = mUserName

        if (mUserName!!.length > 9)
            mUserName = "${mUserName!!.substring(0, 7)}"

        tv_score.text = "Your score is $mCorrectAnswers out of $mQuestionSize"

        btn_finish.setOnClickListener{
            attemptSubmitActivity(
                mUserName,
                mCorrectAnswers,
                mQuestionSize,
                mQuizType,
                mQuizGroup,
                mQuizDifficulty
            )
            val intent = Intent(this, TableActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun attemptSubmitActivity(mUserName: String?, mCorrectAnswers: Int, mQuestionsSize: Int, mQuizType: Int, mQuizGroup: Int, mQuizDifficulty: Int) {
        if (mAuthTask2 != null) {
            return
        }

        // Store values at the time of the submit attempt.
        val userName: String? = mUserName
        val correctAnswers: Int = mCorrectAnswers
        val questionsSize: Int = mQuestionsSize
        val quizType: Int = mQuizType
        val quizGroup: Int = mQuizGroup
        val quizDifficulty: Int = mQuizDifficulty
        var cancel = false
        var focusView: View? = null
        var quizTypeString: String? = null
        var quizGroupString: String? = null
        var quizDifficultyString: String? = null

        if (quizType == 1){
            quizTypeString = "Flags"
        }
        else{
            quizTypeString = "Capitals"
        }

        if(quizGroup == 1){
            quizGroupString = "All"
        }
        else if(quizGroup == 2){
            quizGroupString = "Europe"
        }
        else if(quizGroup == 3){
            quizGroupString = "Africa"
        }
        else if(quizGroup == 4){
            quizGroupString = "Asia"
        }
        else if(quizGroup == 5){
            quizGroupString = "America"
        }
        else{
            quizGroupString = "Other"
        }

        if(quizDifficulty == 1){
            quizDifficultyString = "Easy"
        }
        else if (quizDifficulty == 2){
            quizDifficultyString = "Medium"
        }
        else{
            quizDifficultyString = "Hard"
        }

        if (cancel) {
            // There was an error; don't attempt login and focus the first
            // form field with an error.
            focusView!!.requestFocus()
        } else {
            // Show a progress spinner, and kick off a background task to
            // perform the user login attempt.
            //showProgress(true)
            mAuthTask2 = SubmitActivity(
                userName,
                correctAnswers.toString(),
                questionsSize.toString(),
                quizTypeString,
                quizGroupString,
                quizDifficultyString
            )
            mAuthTask2?.execute(null as Void?)
        }
    }

    class SubmitActivity internal constructor(
        private val userName: String?,
        private val correctAnswers: String,
        private val questionsSize: String,
        private val quizTypeString: String,
        private val quizGroupString: String,
        private val quizDifficultyString: String
    ) :
        AsyncTask<Void?, Void?, String?>() {

        protected override fun doInBackground(vararg params: Void?): String? {
            return try {
                val credentials = JSONObject()
                credentials.accumulate("user_name", userName)
                credentials.accumulate("quiz_type", quizTypeString)
                credentials.accumulate("quiz_group", quizGroupString)
                credentials.accumulate("quiz_difficulty", quizDifficultyString)
                credentials.accumulate("correct_answers", correctAnswers)
                credentials.accumulate("questions_size", questionsSize)
                RequestsREST.doPOST(
                    URL("https://quizapp-286901.appspot.com/rest/activity/submit"),
                    credentials
                )
            } catch (e: java.lang.Exception) {
                e.toString()
            }
        }
/**
        override fun onPostExecute(result: String?) {
            mAuthTask2 = null
            showProgress(false)
        }

        override fun onCancelled() {
            mAuthTask2 = null
            showProgress(false)
        }
**/
    }
}