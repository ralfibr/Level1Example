package com.example.picturequiz

/**
 * @author Raeef Ibrahim
 */

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        checkBtn.setOnClickListener {
            checkAnswer()
        }

    }
//  check the correct answer
    private fun checkAnswer (){
    val answer = editAns.text.toString()
    // Check if correct
    if (answer == getString(R.string.giraffe)){
        Toast.makeText(this, getString(R.string.correct),
            Toast.LENGTH_LONG).show()
    }
    // else show that incorrect
    else {
        Toast.makeText(this, getString(R.string.incorrect),
            Toast.LENGTH_LONG).show()
    }


    }
}
