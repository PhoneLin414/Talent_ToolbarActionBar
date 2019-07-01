package com.example.toolbaractionbar

import android.app.ActionBar
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class ActionBarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_action_bar)

        var actionBar = supportActionBar
       // val actionBar: ActionBar? = actionBar
       // val actionBar : ActionBar? = actionBar

        actionBar?.setDisplayShowTitleEnabled(true)
        actionBar?.setHomeButtonEnabled(true)
        actionBar?.title = "Hello"
        actionBar?.subtitle = "World"
        actionBar?.setBackgroundDrawable(getDrawable(R.drawable.ic_launcher_background))

    }
}
