package com.hus.kpr.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil

import com.hus.kpr.aboutme.databinding.MainActivityBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: MainActivityBinding
    private val myName: MyName = MyName("Quantum Mechanic")



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.main_activity)
        binding.myName = myName
/*        findViewById<Button>(R.id.done_button).setOnClickListener {
            addNickname(it)
        }*/
        binding.doneButton.setOnClickListener {
            addNickname(it)
        }
    }

    fun addNickname(view: View) {
        //val editText = findViewById<EditText>(R.id.editTextTextPersonName)
        //val nicknameTextView = findViewById<TextView>(R.id.textView)
        binding.apply {
            textView.text =binding.editTextTextPersonName.text
            myName?.nickname = editTextTextPersonName.text.toString()
            invalidateAll()
            editTextTextPersonName.visibility = View.GONE
            doneButton.visibility = View.GONE
            textView.visibility = View.VISIBLE

        }
       /* nicknameTextView.text = editText.text
        editText.visibility = View.GONE
        view.visibility = View.GONE
        nicknameTextView.visibility = View.VISIBLE*/

        val immmm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        immmm.hideSoftInputFromWindow(view.windowToken, 0)

    }
}