package com.example.zoomcam

import android.app.Activity
import android.os.Bundle
import android.view.Gravity
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tv = TextView(this)
        tv.text = "Zoomcam siap"
        tv.textSize = 28f
        tv.gravity = Gravity.CENTER
        setContentView(tv)
    }
}
