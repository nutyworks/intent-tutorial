package com.implude.tutorial.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class AnotherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.another_activity)

        var a = findViewById<Button>(R.id.a)
        a.setOnClickListener{
            findViewById<TextView>(R.id.b).text = "Hi"
        }
    }
}