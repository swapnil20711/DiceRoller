package com.swapnil.diceroller


import android.animation.Animator
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.swapnil.diceroller.databinding.ActivityMainBinding
import com.swapnil.diceroller.models.Dice

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private lateinit var dice:Dice

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        dice= Dice()
        binding.btnRoll.setOnClickListener {
            binding.btnRoll.isEnabled=false
            dice.showDice(binding)
            binding.lottie.playAnimation()
            binding.textView.text =dice.roll(6).toString()
        }
        binding.lottie.addAnimatorListener(object :Animator.AnimatorListener{
            override fun onAnimationStart(animation: Animator?) {
            }

            override fun onAnimationEnd(animation: Animator?) {
                dice.hideDice(binding)
                binding.btnRoll.isEnabled=true
            }

            override fun onAnimationCancel(animation: Animator?) {
            }

            override fun onAnimationRepeat(animation: Animator?) {

            }

        })
    }
}