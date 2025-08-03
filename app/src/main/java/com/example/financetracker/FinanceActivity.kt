package com.example.financetracker

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.financetracker.databinding.ActivityFiananceBinding

class FinanceActivity : AppCompatActivity() {
    private lateinit var _binding: ActivityFiananceBinding
    private val binding get() = _binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        _binding = ActivityFiananceBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        _binding.btnSave.setOnClickListener {
            Toast.makeText(this, "Expense saved!", Toast.LENGTH_SHORT).show()
        }
    }
    override fun onStart() {
        super.onStart()
        Log.d("Finance Life Cycle", "onStart() called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Finance Life Cycle", "onResume() called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Finance Life Cycle", "onPause() called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Finance Life Cycle", "onStop() called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Finance Life Cycle", "onDestroy() called")
    }
}
