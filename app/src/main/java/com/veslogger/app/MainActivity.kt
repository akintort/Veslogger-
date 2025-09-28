package com.veslogger.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // Simple layout for testing
        val textView = TextView(this)
        textView.text = "VESLogger App - APK Build Test Successful!\n\nThis is a working Android app."
        textView.textSize = 18f
        textView.setPadding(50, 100, 50, 50)
        
        setContentView(textView)
    }
}
