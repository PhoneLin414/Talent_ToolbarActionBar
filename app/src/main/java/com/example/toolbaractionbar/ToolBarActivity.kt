package com.example.toolbaractionbar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_tool_bar.*

class ToolBarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tool_bar)

        setSupportActionBar(toolbar)

        //toolbar.setNavigationIcon(getDrawable(R.drawable.ic_launcher_background))
        supportActionBar!!.setHomeAsUpIndicator(getDrawable(R.drawable.home))
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main,menu)
        return true
    }



    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        when(item!!.itemId){
            R.id.test1 -> {
                Toast.makeText(this,"Test1",Toast.LENGTH_SHORT).show()
            }
        }

        return super.onOptionsItemSelected(item)
    }


    fun test4onClick(item: MenuItem?) {
        if (item!!.itemId == R.id.test4){
            Toast.makeText(this,"Test4",Toast.LENGTH_SHORT).show()
        }
    }

}
