package kt.harshsingh.quizie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val mTotalQuestion = intent.getIntExtra(Constants.TOTAL_QUESTIONS,0)
        val mCorrectAnswer = intent.getIntExtra(Constants.CORRECT_ANSWER,0)

        val userName: TextView = findViewById(R.id.tv_user_name)
        val score: TextView = findViewById(R.id.tv_score)
        userName.text = intent.getStringExtra(Constants.USER_NAME)
        score.text = "Your Score is $mCorrectAnswer out of $mTotalQuestion"

        val btnFinish: Button= findViewById(R.id.btn_finish)
        btnFinish.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}