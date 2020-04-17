package com.example.rick_rolled

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.MediaController
import android.widget.VideoView

class MainActivity : AppCompatActivity() {

    companion object{
        private val TIME_KEY = "TIME_KEY"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fileName = "rickroll"
        val packageName = "com.example.rick_rolled"
        val filePlace = "android.resource://" + packageName + "/raw/" + R.raw.rickroll
        val videoView = findViewById<View>(R.id.video) as VideoView

        videoView.setVideoURI(Uri.parse(filePlace))

        videoView.setMediaController(MediaController(this))
        videoView.start()
    }

}
