package ru.startandroid.develop.intentextras

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class ViewActivity : AppCompatActivity() {

    private var tvView:TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view)

        tvView = findViewById<View>(R.id.tvView) as TextView

        val intent: Intent = getIntent()

        val fName:String? = intent.getStringExtra("fname")
        val lName:String? = intent.getStringExtra("lname")

        tvView?.setText("Your name is: ${fName} JohnJ${lName}")
    }
}