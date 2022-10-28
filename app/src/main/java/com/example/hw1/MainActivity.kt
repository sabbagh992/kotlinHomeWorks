package com.example.hw1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextUtils
import android.text.TextWatcher
import android.view.View
import android.widget.*
import androidx.core.widget.doOnTextChanged
import com.google.android.material.navigation.NavigationBarView



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.buttonId)
        val result: TextView = findViewById(R.id.textView2)
        var flag: String = "Amman"

        val spinnerVal: Spinner = findViewById(R.id.spinnerV)
        var options = arrayOf("Amman", "New York", "London", "Paris")
        spinnerVal.adapter =
            ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, options)
        button.setOnClickListener { view ->
            //code here
            var amman: String =
                "In Amman, the summers are long, hot, arid, and clear and the winters are cold and mostly clear."
            var newyork: String =
                "In Amman, the summers are long, hot, arid, and clear and the winters are cold and mostly clear."
            var london: String =
                "In Amman, the summers are long, hot, arid, and clear and the winters are cold and mostly clear."
            var paris: String =
                "In Amman, the summers are long, hot, arid, and clear and the winters are cold and mostly clear."
            if (flag == "Amman")
                    result.text = cities("Amman").toString();
            else if(flag == "New York")
                result.text = cities("New York").toString()
            else if (flag == "London")
                result.text = cities("London").toString()
            else
                result.text = cities("Paris").toString();

        }
        spinnerVal.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                flag = options.get(p2) //p2 is the index of selected item
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }

    }
}


    public fun cities(a: String): String {
        if(a=="Amman")
         return "In Amman, the summers are long, hot, arid, and clear and the winters are cold and mostly clear." ;
        else if (a=="New York")
            return "\n" +
                    "In New York City, the summers are warm, humid, and wet; the winters are very cold, snowy, and windy; and it is partly cloudy year round. Over the course of the year, the temperature typically varies from 28°F to 85°F and is rarely below 14°F or above 92°F.";
        else if (a=="London")
            return "In London, has the equable climate of South East England, with mild winters and temperate summers. The average daytime air temperature is 52 °F (11 °C), with 42 °F (5.5 °C) in January and 65 °F (18 °C) in July. Statistics show that the sun shines, however briefly, on five days out of six.";
        else
            return "In Paris, experiences mostly mild weather across four distinct seasons. Average daily highs range from 46°F (8°C) in the winter to 77°F (25°C) at the height of summer. Extreme cold or heat are pretty rare, but rain is not.";
    }

