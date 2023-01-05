package com.example.bmi_calculator

import android.content.DialogInterface
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calcBMI.setOnClickListener {

            val weight = wgt.text.toString().toFloat()
            val height = hgt.text.toString().toFloat()
            val BMI = ((weight)/(height*height))
            output.text = BMI.toString()

            if (BMI < 18.5) {
                output2.text = "You are Under-weight"
            }
            else if (BMI > 18.5 && BMI < 25){
                output2.text = "You are Normal"
            }else{
                output2.text = "You are Over-weight"
            }
        }
    }
}
