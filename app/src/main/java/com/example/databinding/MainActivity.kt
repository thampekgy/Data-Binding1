package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    private val myName: MyName = MyName ("Tham", "012-3456789")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.myName = myName

        binding.buttonDone.setOnClickListener {
            showName()
            another()
        }

    }

    private fun showName() {

        // apply is to combine the statement
        binding.apply{
            myName?.name = editTextName.text.toString()
            this.invalidateAll()

        }
    }

    private fun another(){
        val x: Int
        x = 10
        Toast.makeText(this, "x = $x", Toast.LENGTH_SHORT)
    }

    private fun showContact() {

        // apply is to combine the statement
        binding.apply{
            myName?.contact = editTextContact.text.toString()
            this.invalidateAll()

        }
    }


}
