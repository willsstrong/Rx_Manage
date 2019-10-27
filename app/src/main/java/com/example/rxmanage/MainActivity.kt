package com.example.rxmanage

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.util.Log.d
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        val rxDat = listOf(
            RxCardData("Lisdexamfetamine","Central Nervous System Stimulant"),
            RxCardData("Escitalopram","Selective Serotonin Re-uptake Inhibitor"),
            RxCardData("Lansoprazole","Proton Pump Inhibitor"),
            RxCardData(" Cholecalciferol","Fat-soluble Secosteroid")
        )
        //Recycler will list the Rx Cards
        cardList.apply {
            layoutManager=LinearLayoutManager(this@MainActivity)
            adapter = CardListAdaptor(rxDat) {
                startActivity(Intent(this@MainActivity, RxDetailedView::class.java))
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}

