package com.dakam.wallmartapp

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        var btnCreate = findViewById<Button>(R.id.create)
        btnCreate.setOnClickListener {
            var firstname = findViewById<EditText>(R.id.firstname)
            var lastname = findViewById<EditText>(R.id.lastname)
            var email = findViewById<EditText>(R.id.email)
            var password = findViewById<EditText>(R.id.password)
            var fname:String? = firstname.text?.toString()
            var lname:String? = lastname.text?.toString()
            var em:String? = email.text?.toString()
            var pwd:String? = password.text?.toString()

            var user = User(fname,lname,em,pwd);
            val intent = intent
            intent.putExtra("user",user)
            setResult(Activity.RESULT_OK, intent)
            Toast.makeText(this,"Account Created", Toast.LENGTH_LONG).show()

            finish()
        }






    }
}