package com.example.toolbaractionbar


import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

//class MainActivity : Activity() {
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_Actionbar.setOnClickListener {
            intent = Intent(this@MainActivity,ActionBarActivity::class.java)
            startActivity(intent)
        }

        btn_Toolbar.setOnClickListener {
            intent = Intent(this@MainActivity,ToolBarActivity::class.java)
            startActivity(intent)
        }

    }
}
