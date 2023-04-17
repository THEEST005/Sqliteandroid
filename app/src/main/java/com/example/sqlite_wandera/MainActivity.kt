package com.example.sqlite_wandera

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var name:EditText
    private lateinit var email:EditText
    private lateinit var idnumber:EditText
    private lateinit var save:Button
    private lateinit var view:Button
    private lateinit var delete:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.edtname)
        email = findViewById(R.id.edtemail)
        idnumber = findViewById(R.id.edtidno)
        save = findViewById(R.id.btnsave)
        view = findViewById(R.id.btnview)
        delete = findViewById(R.id.btndelete)



        db = openOrCreateDatabase("Wandera", Context.MODE_PRIVATE)
    }
}