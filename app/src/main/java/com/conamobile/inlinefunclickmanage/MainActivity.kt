package com.conamobile.inlinefunclickmanage

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text = findViewById<TextView>(R.id.text)
        text.clicks {
            Toast.makeText(this, "sa;p", Toast.LENGTH_SHORT).show()
        }
        toast("salom")
    }
}