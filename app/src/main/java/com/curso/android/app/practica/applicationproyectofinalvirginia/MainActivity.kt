package com.curso.android.app.practica.applicationproyectofinalvirginia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.curso.android.app.practica.applicationproyectofinalvirginia.databinding.ActivityMainBinding
import com.curso.android.app.practica.applicationproyectofinalvirginia.viewmodel.ComparisonViewModel


class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: ComparisonViewModel
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this)[ComparisonViewModel::class.java]

        binding.compareButton.setOnClickListener {
            val string1 = binding.editText1.text.toString()
            val string2 = binding.editText2.text.toString()

            viewModel.compareStrings(string1, string2)
        }

        viewModel.comparisonResult.observe(this) { result ->
            binding.resultTextView.text = result
        }
    }
}
