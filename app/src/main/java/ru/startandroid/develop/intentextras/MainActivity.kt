package ru.startandroid.develop.intentextras

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity(), OnClickListener {

    private var etFName:EditText? = null
    private var etLName:EditText? = null

    private var btnSubmit: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etFName = findViewById<View>(R.id.etFName) as EditText
        etLName = findViewById<View>(R.id.etLName) as EditText

        btnSubmit = findViewById<View>(R.id.btnSubmit) as Button
        btnSubmit!!.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        val intent:Intent = Intent(this, ViewActivity::class.java)
        intent.putExtra("fname", etFName?.text.toString())
        intent.putExtra("lname", etLName?.text.toString())
        startActivity(intent)
    }
}