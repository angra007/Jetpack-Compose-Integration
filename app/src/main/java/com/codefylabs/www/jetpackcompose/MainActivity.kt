package com.codefylabs.www.jetpackcompose

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        Option 1:
//        setContent {
//            HelloWorld()
//        }

//        Option 2:
        setContentView(R.layout.activity_main)
        val newFragment = NewFragment.newInstance()
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainerView, newFragment)
            .commit()
    }
}


@Composable
fun HelloWorld() {
    Text("Hello World!!")
}



