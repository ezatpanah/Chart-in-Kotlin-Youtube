package com.ezatpanah.williamchart_youtube.charts

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.db.williamchart.ExperimentalFeature

import com.ezatpanah.williamchart_youtube.databinding.ActivityLineChartBinding

class LineChartActivity : AppCompatActivity() {

    private var _binding: ActivityLineChartBinding? = null
    private val binding get() = _binding!!

    @OptIn(ExperimentalFeature::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityLineChartBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            lineChart.gradientFillColors =
                intArrayOf(
                    Color.parseColor("#81FFFFFF"),
                    Color.TRANSPARENT
                )
            lineChart.animation.duration = animationDuration
            lineChart.onDataPointTouchListener = { index, _, _ ->
                tvChartData.text =
                    lineSet.toList()[index]
                        .second
                        .toString()
            }
            lineChart.animate(lineSet)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
    companion object {
        private val lineSet = listOf(
            "label1" to 5f,
            "label2" to 4.5f,
            "label3" to 4.7f,
            "label4" to 3.5f,
            "label5" to 3.6f,
            "label6" to 7.5f,
            "label7" to 7.5f,
            "label8" to 10f,
            "label9" to 5f,
            "label10" to 6.5f,
            "label11" to 3f,
            "label12" to 4f
        )

        private const val animationDuration = 1000L
    }
}