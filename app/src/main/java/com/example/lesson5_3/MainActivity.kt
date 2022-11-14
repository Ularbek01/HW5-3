package com.example.lesson5_3

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var tvCount:TextView? = null
    private var btnOperation:Button? = null
    private var count = 0




    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvCount = findViewById(R.id.tv_count)
        btnOperation = findViewById(R.id.btn_operation)

        btnOperation?.setOnClickListener {
            if (btnOperation?.text == getString(R.string.plus_one)){
            plus()
            }else{
                minus()
            }
        }
    }

    private fun minus() {
        if (count > 0){
            count--
            tvCount?.text = count.toString()
        }else{
    startActivity(Intent(this, FirstFragment::class.java))
            btnOperation?.text = getString(R.string.plus_one)
        }
    }


    private fun plus(){
        if (count < 10) {
            count++
            tvCount?.text = count.toString()
            if (count == 10) {
                btnOperation?.text = getString(R.string.minus_one)
            }
        }
    }
}




