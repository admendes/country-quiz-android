package com.example.quiz

import android.content.Intent
import android.os.AsyncTask
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.android.synthetic.main.activity_table.*
import java.net.URL
import java.util.*

class TableActivity : AppCompatActivity() {

    private var mQuestionSize: Int = 0
    private var mCorrectAnswers: Int = 0
    private var mUserName: String? = null
    private var mQuizType: Int = 0
    private var mQuizGroup: Int = 0
    private var mQuizDifficulty: Int = 0
    private var mAuthTask3: GetActivity? = null

    private val SECOND_MILLIS = 1000
    private val MINUTE_MILLIS = 60 * SECOND_MILLIS
    private val HOUR_MILLIS = 60 * MINUTE_MILLIS
    private val DAY_MILLIS = 24 * HOUR_MILLIS

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_table)

        attemptGetActivity()

        mUserName = intent.getStringExtra(Constants.USER_NAME)
        mCorrectAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)
        mQuizType = intent.getIntExtra(Constants.QUIZZ_TYPE, 0)
        mQuizGroup = intent.getIntExtra(Constants.QUIZZ_GROUP, 0)
        mQuizDifficulty = intent.getIntExtra(Constants.QUIZZ_DIFFICULTY, 0)
        mQuestionSize = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)

        btn_main_menu.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }

    private fun attemptGetActivity() {
        if (mAuthTask3 != null) {
            return
        }

        var cancel = false
        var focusView: View? = null

        if (cancel) {
            // There was an error; don't attempt login and focus the first
            // form field with an error.
            focusView!!.requestFocus()
        } else {
            // Show a progress spinner, and kick off a background task to
            // perform the user login attempt.
            //showProgress(true)
            mAuthTask3 = GetActivity(this)
            mAuthTask3?.execute(null as Void?)
        }
    }

    private fun printActivity(pulledActivity: List<ActivityData>){
        var i = 0
        var rowNum: String? = null
        val tableRowsName: List<TextView> = listOf(
            tv_name_row1,
            tv_name_row2,
            tv_name_row3,
            tv_name_row4,
            tv_name_row5,
            tv_name_row6,
            tv_name_row7,
            tv_name_row8,
            tv_name_row9,
            tv_name_row10,
            tv_name_row11,
            tv_name_row12,
            tv_name_row13,
            tv_name_row14,
            tv_name_row15
            )

        val tableRowsScore: List<TextView> = listOf(
            tv_score_row1,
            tv_score_row2,
            tv_score_row3,
            tv_score_row4,
            tv_score_row5,
            tv_score_row6,
            tv_score_row7,
            tv_score_row8,
            tv_score_row9,
            tv_score_row10,
            tv_score_row11,
            tv_score_row12,
            tv_score_row13,
            tv_score_row14,
            tv_score_row15
        )

        val tableRowsGroup: List<TextView> = listOf(
            tv_group_row1,
            tv_group_row2,
            tv_group_row3,
            tv_group_row4,
            tv_group_row5,
            tv_group_row6,
            tv_group_row7,
            tv_group_row8,
            tv_group_row9,
            tv_group_row10,
            tv_group_row11,
            tv_group_row12,
            tv_group_row13,
            tv_group_row14,
            tv_group_row15
        )

        val tableRowsDifficulty: List<TextView> = listOf(
            tv_difficulty_row1,
            tv_difficulty_row2,
            tv_difficulty_row3,
            tv_difficulty_row4,
            tv_difficulty_row5,
            tv_difficulty_row6,
            tv_difficulty_row7,
            tv_difficulty_row8,
            tv_difficulty_row9,
            tv_difficulty_row10,
            tv_difficulty_row11,
            tv_difficulty_row12,
            tv_difficulty_row13,
            tv_difficulty_row14,
            tv_difficulty_row15
        )

        val tableRowsTime: List<TextView> = listOf(
            tv_time_row1,
            tv_time_row2,
            tv_time_row3,
            tv_time_row4,
            tv_time_row5,
            tv_time_row6,
            tv_time_row7,
            tv_time_row8,
            tv_time_row9,
            tv_time_row10,
            tv_time_row11,
            tv_time_row12,
            tv_time_row13,
            tv_time_row14,
            tv_time_row15
        )

        //println(toCalendar(pulledActivity[0].date)!!.get(Calendar.DAY_OF_MONTH))

        while(i < 15){
            tableRowsName[i].text = "${pulledActivity[i].user_name}"
            tableRowsScore[i].text = "${pulledActivity[i].correct_answers}/${pulledActivity[i].questions_size}"
            tableRowsGroup[i].text = "${pulledActivity[i].quiz_group}"
            tableRowsDifficulty[i].text = "${pulledActivity[i].quiz_difficulty}"
            //tableRowsTime[i].text = "${toCalendar(pulledActivity[i].date)!!.get(Calendar.DAY_OF_MONTH)}/${toCalendar(pulledActivity[i].date)!!.get(Calendar.MONTH)}/${toCalendar(pulledActivity[i].date)!!.get(Calendar.YEAR)}"
            tableRowsTime[i].text = "${getTimeAgo(pulledActivity[i].date.time)}"
            i++
        }

        tv_name_col.text = "Name"
        tv_score_col.text = "Score"
        tv_group_col.text = "Group"
        tv_difficulty_col.text = "Difficulty"
        tv_time_col.text = "Time"
    }

    /**
    private fun toCalendar(date: Date?): Calendar? {
        val cal = Calendar.getInstance()
        cal.time = date
        return cal
    }
    **/

    private fun currentDate(): Date {
        val calendar = Calendar.getInstance()
        return calendar.time
    }

    private fun getTimeAgo(time: Long): String? {
        var time = time
        if (time < 1000000000000L) {
            // if timestamp given in seconds, convert to millis
            time *= 1000
        }
        val now = currentDate().time
        if (time > now || time <= 0) {
            return "Just now"
        }
        val diff = now - time
        return when {
            diff < MINUTE_MILLIS -> {
                "Just now"
            }
            diff < 2 * MINUTE_MILLIS -> {
                "A minute ago"
            }
            diff < 50 * MINUTE_MILLIS -> {
                "${diff / MINUTE_MILLIS} minutes ago"
            }
            diff < 90 * MINUTE_MILLIS -> {
                "An hour ago"
            }
            diff < 24 * HOUR_MILLIS -> {
                "${diff / HOUR_MILLIS} hours ago"
            }
            diff < 48 * HOUR_MILLIS -> {
                "Yesterday"
            }
            else -> {
                "${diff / DAY_MILLIS} days ago"
            }
        }
    }

    class GetActivity internal constructor(private val a: TableActivity) :
        AsyncTask<Void?, Void?, String?>() {
        protected override fun doInBackground(vararg params: Void?): String? {
            return try {
                RequestsREST.doGET(
                    URL("https://quizapp-286901.appspot.com/rest/activity/get")
                )
            } catch (e: java.lang.Exception) {
                e.toString()
            }

        }

        override fun onPostExecute(result: String?) {
            try {
                val gson = Gson()
                val pulledActivity: List<ActivityData>
                val activityType =
                    object : TypeToken<ArrayList<ActivityData?>?>() {}.type
                pulledActivity = gson.fromJson(result, activityType)
                a.printActivity(pulledActivity)
            } catch (e: java.lang.Exception){
                e.toString()

            }
        }
    }
}