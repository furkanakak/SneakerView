package com.furkan.sneaker

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.furkan.sneaker_view.Sneaker
import com.furkan.sneaker_view.SneakerListener
import com.furkan.sneaker_view.SneakerType


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     Sneaker.Builder()
            .setActivity(this)
            .setType(SneakerType.Success)
            .setTitle("deneme")
            .setSneakerDuration(3000)
            .setContent("denemecontent")
            .setIconVisible(true)
            .setAnimateDuration(1000)
            .setAnimationRepeatCount(3)
            .setArrowIcon(true)
            .setButtonName("")
            .setAutoHide(false)
            .setArrowIcon(true)
            .setAnimation(true)
            .setButtonIconListener(object : SneakerListener{
                override fun onClickListener() {
                   Log.v("buttonClick","buttonClick")
                }
            })
          .build()


    }
}