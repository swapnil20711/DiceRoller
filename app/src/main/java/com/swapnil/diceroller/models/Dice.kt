package com.swapnil.diceroller.models

import android.view.View
import com.swapnil.diceroller.databinding.ActivityMainBinding

class Dice {
    fun roll(range:Int): Int {
        val diceRange=1..range
        return diceRange.random()
    }

    fun hideDice(binding:ActivityMainBinding) {
        binding.lottie.visibility= View.GONE
        binding.textView.visibility=View.VISIBLE
    }

    fun showDice(binding: ActivityMainBinding) {
        binding.lottie.visibility= View.VISIBLE
        binding.textView.visibility=View.GONE
    }
}