package com.dicoding.lampungdistricts

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var rvDistrict: RecyclerView
    private var title = "Kabupaten di Lampung"
    private val list = ArrayList<District>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setActionBarTitle(title)

        rvDistrict = findViewById(R.id.rv_district)
        rvDistrict.setHasFixedSize(true)

        showRecyclerList()
    }

    private fun showRecyclerList() {
        list.addAll(DistrictData.listData)
        rvDistrict.layoutManager = LinearLayoutManager(this)
        val listDistrictAdapter = ListDistrictAdapter(list)
        rvDistrict.adapter = listDistrictAdapter

        listDistrictAdapter.setOnItemClickCallback(object : ListDistrictAdapter.OnItemClickCallback {
            override fun onItemClicked(data: District) {
                selectedDistrict(data)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        gotoAbout(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun gotoAbout(aboutIntent: Int) {
        when (aboutIntent) {
            R.id.action_about_us -> {
                val moveIntent = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }

    private fun setActionBarTitle(title: String) {
        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = title
        }
    }

    private fun selectedDistrict(district: District) {
        Toast.makeText(this, "Kamu memilih " + district.name, Toast.LENGTH_SHORT).show()
    }
}
