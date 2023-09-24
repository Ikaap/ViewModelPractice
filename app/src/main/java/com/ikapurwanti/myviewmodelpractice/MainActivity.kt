package com.ikapurwanti.myviewmodelpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.ikapurwanti.myviewmodelpractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding : ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    //TODO 1 : Buat sebuah variable untuk menampung angka
    //private var mCounter = 0

    private val viewModel : MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //TODO 2 : Buat dua buah function untuk membandingkan penggunaan dengan dan tanpa viewModel
        //withoutViewModel()
        withViewModel()

    }

    private fun withViewModel() {
        binding.btnPlus.setOnClickListener {
            wIncrementCount()
        }
        binding.btnMin.setOnClickListener {
            wDecrementCount()
        }

//        viewModel.vCounter.observe(this) {result ->
//            binding.tvCount.text = result.toString()
//        }

        viewModel.vCounter.observe(this) {
            binding.tvCount.text = it.toString()
        }
    }

    private fun wDecrementCount() {
        viewModel.decrermentCount()
    }

    private fun wIncrementCount() {
        viewModel.incrementCount()
    }
    /*

    private fun withoutViewModel() {
        binding.btnPlus.setOnClickListener {
            mIncrementCount()
        }
        binding.btnMin.setOnClickListener {
            mDecrementCount()
        }
    }

    private fun mDecrementCount() {
        mCounter.let {
            if (it > 0) mCounter -= 1
        }
        updateUI()
    }

    private fun mIncrementCount() {
        mCounter += 1
        updateUI()
    }

    private fun updateUI() {
        binding.tvCount.text = mCounter.toString()
    }
    */

}