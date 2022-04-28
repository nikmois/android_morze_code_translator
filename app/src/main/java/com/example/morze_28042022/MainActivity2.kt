package com.example.morze_28042022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        // Assign variables
        val etinput = findViewById<EditText>(R.id.etinput)
        val etoutput = findViewById<EditText>(R.id.etoutput)
        val btnDecode = findViewById<Button>(R.id.btndecode)
        val btnEncode = findViewById<Button>(R.id.btnencode)
        val btnclear = findViewById<Button>(R.id.btnclear)


        // initializing string arrays
        val AlphaNumeric = arrayOfNulls<String>(37)

        // string array for storing alphabets and numbers
        val AlphaNumeric1 = arrayOfNulls<String>(37)

        // string array for storing corresponding morse code
        // assigning alphabets to the string array Alphanumeric[]
        AlphaNumeric[0] = "A"
        AlphaNumeric[1] = "B"
        AlphaNumeric[2] = "C"
        AlphaNumeric[3] = "D"
        AlphaNumeric[4] = "E"
        AlphaNumeric[5] = "F"
        AlphaNumeric[6] = "G"
        AlphaNumeric[7] = "H"
        AlphaNumeric[8] = "I"
        AlphaNumeric[9] = "J"
        AlphaNumeric[10] = "K"
        AlphaNumeric[11] = "L"
        AlphaNumeric[12] = "M"
        AlphaNumeric[13] = "N"
        AlphaNumeric[14] = "O"
        AlphaNumeric[15] = "P"
        AlphaNumeric[16] = "Q"
        AlphaNumeric[17] = "R"
        AlphaNumeric[18] = "S"
        AlphaNumeric[19] = "T"
        AlphaNumeric[20] = "U"
        AlphaNumeric[21] = "V"
        AlphaNumeric[22] = "W"
        AlphaNumeric[23] = "X"
        AlphaNumeric[24] = "Y"
        AlphaNumeric[25] = "Z"
        AlphaNumeric[26] = "0"
        AlphaNumeric[27] = "1"
        AlphaNumeric[28] = "2"
        AlphaNumeric[29] = "3"
        AlphaNumeric[30] = "4"
        AlphaNumeric[31] = "5"
        AlphaNumeric[32] = "6"
        AlphaNumeric[33] = "7"
        AlphaNumeric[34] = "8"
        AlphaNumeric[35] = "9"
        AlphaNumeric[36] = " "

        // assigning the corresponding morse code
        // for each letter and number to
        // Alphanumeric1[] array
        AlphaNumeric1[0] = ".-"
        AlphaNumeric1[1] = "-..."
        AlphaNumeric1[2] = "-.-."
        AlphaNumeric1[3] = "-.."
        AlphaNumeric1[4] = "."
        AlphaNumeric1[5] = "..-."
        AlphaNumeric1[6] = "--."
        AlphaNumeric1[7] = "...."
        AlphaNumeric1[8] = ".."
        AlphaNumeric1[9] = ".---"
        AlphaNumeric1[10] = "-.-"
        AlphaNumeric1[11] = ".-.."
        AlphaNumeric1[12] = "--"
        AlphaNumeric1[13] = "-."
        AlphaNumeric1[14] = "---"
        AlphaNumeric1[15] = ".--."
        AlphaNumeric1[16] = "--.-"
        AlphaNumeric1[17] = ".-."
        AlphaNumeric1[18] = "..."
        AlphaNumeric1[19] = "-"
        AlphaNumeric1[20] = "..-"
        AlphaNumeric1[21] = "...-"
        AlphaNumeric1[22] = ".--"
        AlphaNumeric1[23] = "-..-"
        AlphaNumeric1[24] = "-.--"
        AlphaNumeric1[25] = "--.."
        AlphaNumeric1[26] = "-----"
        AlphaNumeric1[27] = ".----"
        AlphaNumeric1[28] = "..---"
        AlphaNumeric1[29] = "...--"
        AlphaNumeric1[30] = "....-"
        AlphaNumeric1[31] = "....."
        AlphaNumeric1[32] = "-...."
        AlphaNumeric1[33] = "--..."
        AlphaNumeric1[34] = "---.."
        AlphaNumeric1[35] = "----."
        AlphaNumeric1[36] = "/"
        btnEncode.setOnClickListener(View.OnClickListener {

            val input = etinput.getText().toString()
            var output = ""


            val l = input.length


            var i: Int
            var j: Int
            i = 0
            while (i < l) {


                val ch = input.substring(i, i + 1)


                j = 0
                while (j < 37) {
                    if (ch.equals(AlphaNumeric[j], ignoreCase = true)) {


                        output = output + AlphaNumeric1[j] + " "
                    }
                    j++
                }
                i++
            }


            etoutput.setText(output)
        })

        /*    btnvibrate.setOnClickListener {

            }*/


        btnclear.setOnClickListener(View.OnClickListener {


            etinput.setText("")


            etoutput.setText("")
        })
        btnDecode.setOnClickListener(View.OnClickListener {

            val input1 = etinput.getText().toString()


            val input = "$input1 "


            val l = input.length


            var i: Int
            var j: Int
            var p = 0


            var pos = 0


            var letter = ""


            var output = ""
            i = 0
            while (i < l) {


                var flag = 0


                val ch = input.substring(i, i + 1)


                if (ch.equals(" ", ignoreCase = true)) {


                    p = i


                    letter = input.substring(pos, p)


                    pos = p + 1
                    flag = 1
                }
                val letter1 = letter.trim { it <= ' ' }

                if (flag == 1) {
                    j = 0
                    while (j <= 36) {
                        if (letter1.equals(AlphaNumeric1[j], ignoreCase = true)) {
                            output = output + AlphaNumeric[j]
                            break
                        }
                        j++
                    }
                }
                i++
            }

            etoutput.setText(output)


        })
    }
}

//        val vibrator = this.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
//        val canVibrate: Boolean = vibrator.hasVibrator()

//        val dot = 500L
//        val dash = 1500L


//        btnvibrate.setOnClickListener {
//            if (canVibrate && etoutput.text == ".") {
//                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
//                    // API 26
//                    vibrator.vibrate(
//                        VibrationEffect.createOneShot(
//                            dot,
//                            VibrationEffect.DEFAULT_AMPLITUDE
//                        )
//                    )
//                } else {
//                    // This method was deprecated in API level 26
//                    vibrator.vibrate(dot)
//                }
//        }
//    }
