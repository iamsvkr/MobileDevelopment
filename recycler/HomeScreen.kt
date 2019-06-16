package com.example.tapp2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_home_screen.*

class HomeScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)

        var username = findViewById<EditText>(R.id.username)
        var password = findViewById<EditText>(R.id.password)

        login.setOnClickListener {
            validate(username.text.toString(), password.text.toString())
        }
    }

    private fun validate(username: String, password: String) {

        if(username.equals("shivam") && password.equals("123")){
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }else{
            Toast.makeText(this, "wrong data",Toast.LENGTH_SHORT).show()
        }
    }
}
