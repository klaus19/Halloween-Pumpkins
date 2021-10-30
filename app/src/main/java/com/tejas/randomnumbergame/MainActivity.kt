package com.tejas.randomnumbergame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import com.tejas.randomnumbergame.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        binding.apply {
            setContentView(view)
        }

        with(binding){
            btnShoot.startAnimation(AnimationUtils.loadAnimation(this@MainActivity,R.anim.shake))

        }
        with(binding){
            btnShoot?.setOnClickListener {
              val rnds=(0..10).random()
                textMarnusNumber.text=rnds.toString()
            }
        }

    }
}