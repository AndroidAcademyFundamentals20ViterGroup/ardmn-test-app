package com.viter.artem.aa_2020_viter_group_test_app

import android.graphics.Color
import android.graphics.LinearGradient
import android.graphics.Shader
import android.os.Bundle
import android.webkit.WebView
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

        findViewById<WebView>(R.id.webview).apply {
            //setBackgroundColor(Color.parseColor("#33ff0000"))
            loadData(
                """
                    <!DOCTYPE html>
                    <html>
                     <head>
                      <meta charset="utf-8">
                      <title>Градиентный текст</title>
                      <style>
                       body {
                        background: transparent; /* Цвет фона веб-страницы */
                       }
                       p{
                        background: linear-gradient(to right, orange, white); /* Градиент для текста */
                        -webkit-background-clip: text; /* Обрезаем фон по тексту */
                        -webkit-text-fill-color: transparent; /* Прозрачный текст */
                       }
                      </style>
                     </head>
                     <body>
                      <p>Градиентный текст</p>
                     </body> 
                    </html>
                """,
                "text/html; charset=utf-8",
                "UTF-8"
            )
        }
    }
}