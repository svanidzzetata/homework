package com.example.passdata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var nameedittext : EditText
    lateinit var surnameedittext : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        nameedittext = findViewById(R.id.nameedittext)
        surnameedittext = findViewById(R.id.surnameedittext)

        contbut.setOnClickListener {

            val name = nameedittext.text.toString()
            val surname = surnameedittext.text.toString()

            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("NAME", name)
            intent.putExtra("SURNAME", surname)
            startActivity(intent)
        }
    }
}