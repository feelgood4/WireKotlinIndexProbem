package com.qoollo.wireprotosample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.qoollo.sample.proto.BoundingBox

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val adapterFromWire = BoundingBox.ADAPTER
//        val ss = Som
        setContentView(R.layout.activity_main)
    }
}
