package com.furkan.sneaker

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.furkan.sneaker.databinding.ActivityMainBinding
import com.furkan.sneaker_view.Sneaker
import com.furkan.sneaker_view.SneakerListener
import com.furkan.sneaker_view.SneakerType


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.success.setOnClickListener {
            Log.v("sneaker","success")
            Sneaker.Builder()
                .setActivity(this) /* optionally, these -> .setFragment() .setViewGroup() */
                .setType(SneakerType.Success)
                .setTitle("Success")
                .setSneakerDuration(3000)
                .setContent("Your transaction was successful")
                .setIconVisible(true)
                .setAnimateDuration(1000)
                .setAnimationRepeatCount(3)
                .setArrowIcon(true)
                .setButtonName("Action")
                .setAutoHide(false)
                .setArrowIcon(true)
                .setAnimation(true)
                .setButtonIconListener(object : SneakerListener {
                    override fun onClickListener() {
                        Log.v("buttonClick","buttonClick")
                    }
                })
                .build()
        }
        binding.info.setOnClickListener {
            Log.v("sneaker","info")
            Sneaker.Builder()
                .setActivity(this)
                .setType(SneakerType.Info)
                .setTitle("Info")
                .setSneakerDuration(3000)
                .setContent("Lorem Ipsum is simply dummy")
                .setIconVisible(true)
                .setAnimateDuration(1000)
                .setAnimationRepeatCount(3)
                .setArrowIcon(true)
                .setButtonName("Action")
                .setAutoHide(false)
                .setArrowIcon(true)
                .setAnimation(true)
                .setButtonIconListener(object : SneakerListener {
                    override fun onClickListener() {
                        Log.v("buttonClick","buttonClick")
                    }
                })
                .build()

        }
        binding.infoError.setOnClickListener {
            Log.v("sneaker","infoError")
            Sneaker.Builder()
                .setActivity(this)
                .setType(SneakerType.InfoError)
                .setTitle("InfoError")
                .setSneakerDuration(3000)
                .setContent("It has survived not only five")
                .setIconVisible(true)
                .setAnimateDuration(1000)
                .setAnimationRepeatCount(3)
                .setArrowIcon(true)
                .setButtonName("Action")
                .setAutoHide(false)
                .setArrowIcon(true)
                .setAnimation(true)
                .setButtonIconListener(object : SneakerListener {
                    override fun onClickListener() {
                        Log.v("buttonClick","buttonClick")
                    }
                })
                .build()
        }
        binding.warning.setOnClickListener {
            Log.v("sneaker","warning")
            Sneaker.Builder()
                .setActivity(this)
                .setType(SneakerType.Warning)
                .setTitle("Warning")
                .setSneakerDuration(3000)
                .setContent("Lorem Ipsum passages")
                .setIconVisible(true)
                .setAnimateDuration(1000)
                .setAnimationRepeatCount(3)
                .setArrowIcon(true)
                .setButtonName("Action")
                .setAutoHide(false)
                .setArrowIcon(true)
                .setAnimation(true)
                .setButtonIconListener(object : SneakerListener {
                    override fun onClickListener() {
                        Log.v("buttonClick","buttonClick")
                    }
                })
                .build()
        }
        binding.error.setOnClickListener {
            Log.v("sneaker","error")
            Sneaker.Builder()
                .setActivity(this)
                .setType(SneakerType.Error)
                .setTitle("Error")
                .setSneakerDuration(3000)
                .setContent("Your transaction could not be")
                .setIconVisible(true)
                .setAnimateDuration(1000)
                .setAnimationRepeatCount(3)
                .setArrowIcon(true)
                .setButtonName("Action")
                .setAutoHide(false)
                .setArrowIcon(true)
                .setAnimation(true)
                .setButtonIconListener(object : SneakerListener {
                    override fun onClickListener() {
                        Log.v("buttonClick","buttonClick")
                    }
                })
                .build()
        }

    }
}