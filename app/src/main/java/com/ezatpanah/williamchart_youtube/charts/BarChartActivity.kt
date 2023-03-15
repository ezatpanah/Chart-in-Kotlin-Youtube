package com.ezatpanah.williamchart_youtube.charts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ezatpanah.williamchart_youtube.databinding.ActivityBarChartBinding

class BarChartActivity : AppCompatActivity() {

    private var _binding: ActivityBarChartBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityBarChartBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {

            barChart.animation.duration = animationDuration
            barChart.animate(barSet)

            barChartHorizontal.animation.duration = animationDuration
            barChartHorizontal.animate(horizontalBarSet)

        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    companion object {

        private val barSet = listOf(
            "JAN" to 4F,
            "FEB" to 7F,
            "MAR" to 2F,
            "MAY" to 2.3F,
            "APR" to 5F,
            "JUN" to 4F
        )

        private val horizontalBarSet = listOf(
            "PORRO" to 5F,
            "FUSCE" to 6.4F,
            "EGET" to 3F
        )

        private const val animationDuration = 1000L
    }
}