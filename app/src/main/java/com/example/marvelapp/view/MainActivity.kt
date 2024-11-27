package com.example.marvelapp.view

import android.os.Bundle
import android.view.WindowManager
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.marvelapp.R
import com.example.marvelapp.databinding.ActivityMainBinding
import com.example.marvelapp.databinding.LoginBottomSheetBinding
import com.example.marvelapp.databinding.RegisterBottomSheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialog

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonGoLogin.setOnClickListener { showBottomSheetLogin() }
        binding.buttonGoRegister.setOnClickListener { showButtonSheetRegister() }

    }

    private fun showBottomSheetLogin() {
        val dialog = BottomSheetDialog(this)

        val sheetBindingShowLogin: LoginBottomSheetBinding =
            LoginBottomSheetBinding.inflate(layoutInflater, null, false)
                .apply { window?.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE) }

        dialog.setContentView(sheetBindingShowLogin.root)
        dialog.show()
    }

    private fun showButtonSheetRegister() {
        val dialog = BottomSheetDialog(this)

        val sheetBindingShowRegister: RegisterBottomSheetBinding =
            RegisterBottomSheetBinding.inflate(layoutInflater, null, false)
                .apply { window?.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE) }
        dialog.setContentView(sheetBindingShowRegister.root)
        dialog.show()
    }
}