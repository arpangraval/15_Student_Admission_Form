package com.example.a15_igniteform_cmpica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        submitBTN.setOnClickListener {
            var gender = genderGroup.checkedRadioButtonId
            var gen:String = ""
            when(gender)
            {
                R.id.maleRb -> gen = "Male"
                R.id.femaleRb -> gen = "Female"
                else -> gen = "not"
            }

            var events:String = ""
            if(codeCb.isChecked){ events = events + " Code "}
            if(webCb.isChecked){ events = events + " Web "}
            if(gameCb.isChecked){events = events + " Game "}

            //Toast.makeText(this,gen,Toast.LENGTH_LONG).show()
            if(nameET.text.toString() =="" || idET.text.toString() =="" || gen =="not" || events =="")
            {
                Toast.makeText(this,"Please enter all details and also choose gender or atleast 1 event",Toast.LENGTH_LONG).show()
            }
            else
            {
                Toast.makeText(this,"Name:"+nameET.text.toString()+"\n"+"ID:"+idET.text.toString()+"\n"+"Gender:"+gen+"\n"+"Events:"+events,Toast.LENGTH_LONG).show()
            }

        }

    }
}