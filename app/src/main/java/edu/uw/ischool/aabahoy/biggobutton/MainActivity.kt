package edu.uw.ischool.aabahoy.biggobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pushButton: Button = findViewById<Button>(R.id.button)
        pushButton.setOnClickListener {
            count += 1
            if (count == 1) {
                pushButton.text = getString(R.string.pushed_once)
            } else {
                pushButton.text = "You have pushed me $count times!"
            }
        }
    }
}