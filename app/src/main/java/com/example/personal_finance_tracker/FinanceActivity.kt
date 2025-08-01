package com.example.personal_finance_tracker

import android.os.Bundle
import android.view.inputmethod.InputBinding
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.personal_finance_tracker.databinding.ActivityFinanceBinding

class FinanceActivity : AppCompatActivity() {
    private lateinit var _binding: ActivityFinanceBinding
    private val binding get() = _binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        _binding = ActivityFinanceBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val spinner = binding.spExpenseCategory
// Create an ArrayAdapter using the string array and a default spinner layout.
        ArrayAdapter.createFromResource(
            this,
            R.array.expense_category,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears.
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner.
            spinner.adapter = adapter
        }
    }
}