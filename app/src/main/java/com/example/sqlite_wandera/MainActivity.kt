package com.example.sqlite_wandera

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var name: EditText
    private lateinit var email: EditText
    private lateinit var idnumber: EditText
    private lateinit var save: Button
    private lateinit var view: Button
    private lateinit var delete: Button

    private lateinit var db: SQLiteDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.edtname)
        email = findViewById(R.id.edtemail)
        idnumber = findViewById(R.id.edtidno)
        save = findViewById(R.id.btnsave)
        view = findViewById(R.id.btnview)
        delete = findViewById(R.id.btndelete)



        db = openOrCreateDatabase("wandera", Context.MODE_PRIVATE,null)

        //creating a table
        db.execSQL("CREATE TABLE IF NOT EXISTS users(jina VARCHAR, arafa VARCHAR, kitambulisho VARCHAR)")


        save.setOnClickListener {
            var jina_edt = name.text.toString().trim()
            var arafa_edt = email.text.toString().trim()
            var kitambulisho_edt = idnumber.text.toString().trim()


            //validate your text
            if (jina_edt.isEmpty() || arafa_edt.isEmpty() || kitambulisho_edt.isEmpty()){
                Toast.makeText(this, "Cannot submit ana empty field", Toast.LENGTH_SHORT).show()

            } else{
                db.execSQL("INSERT INTO users VALUES('\"+jina_edt+\"', '\"+arafa_edt+\"', '\"+kitambulisho_edt+\"')")
                 Toast.makeText(this, "Data saved successfully", Toast.LENGTH_SHORT).show()

            }

        }




        }
    }


