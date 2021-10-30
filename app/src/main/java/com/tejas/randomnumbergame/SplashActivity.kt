package com.tejas.randomnumbergame

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Handler
import android.os.Looper
import com.tejas.randomnumbergame.databinding.ActivitySplashBinding


class SplashActivity : AppCompatActivity() {

    private lateinit var binding:ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        binding.apply {
            setContentView(binding.root)
        }

        //Handler for our SplashScreen

        Handler(Looper.getMainLooper()).postDelayed(Runnable {

            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
            finish()
        }, 3000)
    }
}