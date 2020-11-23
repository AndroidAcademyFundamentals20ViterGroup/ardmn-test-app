package com.viter.artem.aa_2020_viter_group_test_app

import android.graphics.Color
import android.graphics.LinearGradient
import android.graphics.Shader
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        // fonts: https://fonts.google.com/specimen/Roboto#standard-styles
        // fonts: https://developer.android.com/guide/topics/ui/look-and-feel/fonts-in-xml
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // simple gradient sample
        findViewById<TextView>(R.id.gradient_text_view).paint.apply {
            shader = LinearGradient(
                0f, 0f, 0f, 35f,
                Color.RED, Color.BLUE,
                Shader.TileMode.CLAMP
            )
        }
    }
}