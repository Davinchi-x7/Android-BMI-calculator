package com.example.dav_bmi_calc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(){
    private lateinit var Disp:TextView
    private lateinit var Height:EditText
    private lateinit var Weight:EditText
    private lateinit var Calc:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Disp = findViewById(R.id.display)
        Height = findViewById(R.id.height)
        Weight = findViewById(R.id.weight)
        Calc = findViewById(R.id.calc)

        Calc.setOnClickListener {

            var Edt_height = Height.text.toString().trim()
            var Edt_weight = Weight.text.toString().trim()

            if (Edt_height.isEmpty() || Edt_weight.isEmpty()){
                Toast.makeText(this, "Enter a number ", Toast.LENGTH_SHORT).show()
            }
            else{
                var result = Edt_weight.toDouble() / (Edt_height.toDouble() * Edt_height.toDouble())
                Disp.text = result.toString()
            }


        }

    }
}