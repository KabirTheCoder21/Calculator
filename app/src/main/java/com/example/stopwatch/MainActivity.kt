package com.example.stopwatch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.stopwatch.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAc.setOnClickListener{
            binding.inputtext.text=""
            binding.outputtext.text=""
        }

        binding.btnZero.setOnClickListener {
            binding.inputtext.append("0")
        }
        binding.btnOne.setOnClickListener {
            binding.inputtext.append("1")
        }
        binding.btnTwo.setOnClickListener {
            binding.inputtext.append("2")
        }
        binding.btnThree.setOnClickListener {
            binding.inputtext.append("3")
        }
        binding.btnFour.setOnClickListener {
            binding.inputtext.append("4")
        }
        binding.btnFive.setOnClickListener {
            binding.inputtext.append("5")
        }
        binding.btnSix.setOnClickListener {
            binding.inputtext.append("6")
        }
        binding.btnSeven.setOnClickListener {
            binding.inputtext.append("7")
        }
        binding.btnEight.setOnClickListener {
            binding.inputtext.append("8")
        }
        binding.btnNine.setOnClickListener {
            binding.inputtext.append("9")
        }
        binding.btnMinus.setOnClickListener {
            binding.inputtext.append(" - ")
        }
        binding.btnMulti.setOnClickListener {
            binding.inputtext.append(" * ")
        }
        binding.btnDivide.setOnClickListener {
            binding.inputtext.append(" / ")
        }
        binding.btnDot.setOnClickListener {
            binding.inputtext.append(".")
        }
        binding.btnPlus.setOnClickListener {
            binding.inputtext.append(" + ")
        }
        binding.btnStartbrac.setOnClickListener {
            binding.inputtext.append(" ( ")
        }
        binding.btnEndbra.setOnClickListener {
            binding.inputtext.append(" ) ")
        }

        binding.btnEqual.setOnClickListener {

            val expression= ExpressionBuilder(binding.inputtext.text.toString()).build()
            val result=expression.evaluate()
            val longresult=result.toLong()

            if (result==longresult.toDouble()){
                binding.outputtext.text = longresult.toString()
            }
            else{
                binding.outputtext.text = result.toString()
            }
        }
    }
}