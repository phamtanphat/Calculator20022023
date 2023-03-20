package com.examp.calculator20022023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var edtNumber1: EditText
    private lateinit var edtNumber2: EditText
    private lateinit var textViewResult: TextView
    private lateinit var btnPlus: Button
    private lateinit var btnMinus: Button
    private lateinit var btnMultiplication: Button
    private lateinit var btnDivision: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtNumber1 = findViewById(R.id.edit_text_number1)
        edtNumber2 = findViewById(R.id.edit_text_number2)
        textViewResult = findViewById(R.id.text_view_result)
        btnPlus = findViewById(R.id.button_plus)
        btnMinus = findViewById(R.id.button_minus)
        btnMultiplication = findViewById(R.id.button_multiplication)
        btnDivision = findViewById(R.id.button_division)

        btnPlus.setOnClickListener(object : OnClickListener{
            override fun onClick(p0: View?) {
                val textNumber1 = edtNumber1.text.toString()
                val textNumber2 = edtNumber2.text.toString()

                // Kiểm tra coi có giá trị hay không
                if (textNumber1.isEmpty() || textNumber2.isEmpty()) {
                    Toast.makeText(this@MainActivity, "Bạn chưa nhập đầy đủ!!!", Toast.LENGTH_SHORT).show()
                    return
                }

                val number1 = textNumber1.toInt()
                val number2 = textNumber2.toInt()

                val result = number1 + number2

                textViewResult.text = "Result: $number1 + $number2 = $result"
            }
        })

        btnDivision.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                val textNumber1 = edtNumber1.text.toString()
                val textNumber2 = edtNumber2.text.toString()

                // Kiểm tra coi có giá trị hay không
                if (textNumber1.isEmpty() || textNumber2.isEmpty()) {
                    Toast.makeText(this@MainActivity, "Bạn chưa nhập đầy đủ!!!", Toast.LENGTH_SHORT).show()
                    return
                }

                val number1 = textNumber1.toFloat()
                val number2 = textNumber2.toFloat()

                if (number2 == 0.0f) {
                    Toast.makeText(this@MainActivity, "Không chia với 0!!!", Toast.LENGTH_SHORT).show()
                    return
                }

                val result = number1 / number2

                textViewResult.text = "Result: $number1 / $number2 = $result"
            }
        })
    }
}
