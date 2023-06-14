package com.example.sigin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class daftarActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btn01 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar)

        btn01 = findViewById(R.id.button)
        btn01.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.button ->{
                val intentgo = Intent(this@daftarActivity,  masuk::class.java)
                startActivity(intentgo)
            }
        }

    }
}