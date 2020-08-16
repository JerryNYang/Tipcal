package com.inyang.jerry.tipcalc

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        //window.decorView.setBackgroundColor(Color.RED)

        infoTextView.visibility = View.INVISIBLE
        calButton.setOnClickListener {
            // Bill
            val bill : Double = billEditText.text.toString().toDouble()
            // Tip Percentage
            val tipPercent : Double = percentEditText.text.toString().toDouble()
            // Tip
            val tip : Double = (bill * tipPercent)/100.0
            // Total
            val total : Double = bill + tip

            infoTextView.visibility = View.VISIBLE


            // Set Info Text
            infoTextView.text = "Tip: "+ doubleToDollar(tip) + "\n"+"Total: " + doubleToDollar(total)



        }


    }

    fun doubleToDollar(number:Double): String
    {
        return "$"+ String.format("%.2f",number)
    }
}
