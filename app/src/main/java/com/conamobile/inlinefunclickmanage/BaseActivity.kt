package com.conamobile.inlinefunclickmanage

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import ru.ldralighieri.corbind.view.clicks

open class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    inline fun View.click(crossinline clickListener: (View) -> Unit) {
        clicks().onEach {
            clickListener(this)
        }.launchIn(MainScope())
    }

    inline fun View.clicks(crossinline clickListener: (View) -> Unit) {
        setOnClickListener {
            clickListener(this)
        }
    }
}