package com.dicoding.lampungdistricts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DistrictDetail : AppCompatActivity() {
    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_LOGO = "extra_logo"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_district_detail)

        val tvName: TextView = findViewById (R.id.district_name)
        val tvDetail: TextView = findViewById(R.id.district_details)
        val imageView: ImageView = findViewById(R.id.logo)

        val name = intent.getStringExtra(EXTRA_NAME)
        val age = intent.getStringExtra(EXTRA_DETAIL)
        val logo = intent.getIntExtra(EXTRA_LOGO,0)

        imageView.setImageResource(logo)
        tvName.text = name
        tvDetail.text = age
    }
}