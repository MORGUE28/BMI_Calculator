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
            lateinit var output:String
            lateinit var output2: String
            val weight = wgt.text.toString().toFloat()
            val height = hgt.text.toString().toFloat()
            val BMI = ((weight)/(height*height))
            output = BMI.toString()

            if (BMI < 18.5) {
                output2 = "You are Under-weight"
            }
            else if (BMI > 18.5 && BMI < 25){
                output2 = "You are Normal"
            }else{
                output2 = "You are Over-weight"
            }

            val dialogClickListener =
                DialogInterface.OnClickListener { dialog, which ->
                    when (which) {
                        DialogInterface.BUTTON_NEGATIVE -> {
                            dialog.dismiss()
                        }
                    }
                }
            val builder: AlertDialog.Builder = AlertDialog.Builder(this)


            builder.setMessage("BMI INDEX:$output \n$output2")
                .setTitle("BMI")
                .setNegativeButton("OK", dialogClickListener)
                .show()
            }
        }
    }

