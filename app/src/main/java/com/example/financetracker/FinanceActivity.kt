package com.example.financetracker

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.financetracker.databinding.ActivityFiananceBinding
import android.widget.ArrayAdapter
import android.widget.SpinnerAdapter


class FinanceActivity : AppCompatActivity() {
    private lateinit var _binding: ActivityFiananceBinding
    private val binding get() = _binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        _binding = ActivityFiananceBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val adapter = ExpenseSpinnerAdapter(this, spinnerItems)
        binding.spExpenseCategory.adapter = adapter
        _binding.btnSave.setOnClickListener {
            if (binding.etExpenseName.text.isNullOrBlank()) {
                Toast.makeText(this, "Please enter an expense name", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (binding.etAmount.text.isNullOrBlank()) {
                Toast.makeText(this, "Expense amount can't be empty", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            Toast.makeText(this, "Expense saved!", Toast.LENGTH_SHORT).show()
            finish()
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
