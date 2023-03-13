package com.ezatpanah.williamchart_youtube.charts

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ezatpanah.williamchart_youtube.databinding.ActivityDonutChartBinding

class DonutChartActivity : AppCompatActivity() {

    private var _binding: ActivityDonutChartBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityDonutChartBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            donutChart.donutColors = intArrayOf(
                Color.parseColor("#FFFFFF"),
                Color.parseColor("#9EFFFFFF"),
                Color.parseColor("#8DFFFFFF")
            )
            donutChart.animation.duration = animationDuration
            donutChart.animate(donutSet)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
    companion object {

        private val donutSet = listOf(
            20f,
            80f,
            100f
        )

        private const val animationDuration = 1000L
    }

}