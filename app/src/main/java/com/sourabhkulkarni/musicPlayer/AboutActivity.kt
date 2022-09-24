package com.sourabhkulkarni.musicPlayer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sourabhkulkarni.musicPlayer.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {

    lateinit var binding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(MainActivity.currentThemeNav[MainActivity.themeIndex])
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.title = "About"
        binding.aboutText.text = aboutText()
    }
    private fun aboutText(): String{
        return "Developed By: Sourabh G Kulkarni" +
                "\n\nIf You Want To Provide Feedback, I Would Love To Hear That.\n"
    }
}