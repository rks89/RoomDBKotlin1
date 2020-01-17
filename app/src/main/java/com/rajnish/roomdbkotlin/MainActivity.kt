package com.rajnish.roomdbkotlin

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room
import org.jetbrains.anko.doAsync


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* val btnSave=findViewById<Button>(R.id.btn_login)
        val editName=findViewById<EditText>(R.id.editText_name)
        val editPassword=findViewById<EditText>(R.id.editText_password)*/

        //var db= Room.databaseBuilder(applicationContext,AppDatabase::class.java,"loginDB").allowMainThreadQueries().build()

        doAsync{

            val bill = User(uid = 600, firstName = "qwasxeqeq" , lastName="qweq12wsc weqwe")

            AppDatabase.getInstance(this@MainActivity).userDao().insertAll(bill)


            val customers = AppDatabase.getInstance(this@MainActivity).userDao().all
            //Toast.makeText(this@MainActivity,"Hello"+customers.get(0),Toast.LENGTH_LONG).show()
            for(item in customers){
                println("Hello Information ${item.firstName}")
                println("Hello Information ${item.uid}")

            }
        }

        }
    }

