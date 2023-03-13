package com.ezatpanah.williamchart_youtube

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ezatpanah.williamchart_youtube.charts.BarChartActivity
import com.ezatpanah.williamchart_youtube.charts.DonutChartActivity
import com.ezatpanah.williamchart_youtube.charts.LineChartActivity
import com.ezatpanah.williamchart_youtube.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            btnBarChart.setOnClickListener {
                startActivity(Intent(this@MainActivity, BarChartActivity::class.java))
            }
            btnDonutChart.setOnClickListener {
                startActivity(Intent(this@MainActivity, DonutChartActivity::class.java))

            }
            btnLineChart.setOnClickListener {
                startActivity(Intent(this@MainActivity, LineChartActivity::class.java))

            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}