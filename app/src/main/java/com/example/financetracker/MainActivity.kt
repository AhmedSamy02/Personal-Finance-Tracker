package com.example.financetracker

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "MainActivity"
    }

    private lateinit var btnTrackExpense: Button
    private lateinit var btnShare: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate() called")
        setContentView(R.layout.activity_main)

        initializeViews()
        setupClickListeners()
    }

    private fun initializeViews() {
        btnTrackExpense = findViewById(R.id.btn_track_expense)
        btnShare = findViewById(R.id.btn_share)
    }

    private fun setupClickListeners() {

        // Explicit Intent to FinanceActivity
        //btnTrackExpense.setOnClickListener {
        //    val intent = Intent(this, FinanceActivity::class.java)
        // startActivity(intent)
       // }

        // Implicit Intent for sharing
        btnShare.setOnClickListener {
            shareExpense()
        }
    }

    private fun shareExpense() {
        val shareIntent = Intent().apply {
            action = Intent.ACTION_SEND
            type = "text/plain"
            putExtra(Intent.EXTRA_TEXT, getString(R.string.share_expense_text))
            putExtra(Intent.EXTRA_SUBJECT, getString(R.string.share_subject))
        }

        if (shareIntent.resolveActivity(packageManager) != null) {
            startActivity(Intent.createChooser(shareIntent, "Share via"))
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart() called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume() called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause() called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop() called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy() called")
    }
}