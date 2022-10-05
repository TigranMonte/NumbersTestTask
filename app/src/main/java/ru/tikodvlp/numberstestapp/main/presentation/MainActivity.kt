package ru.tikodvlp.numberstestapp.main.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.tikodvlp.numberstestapp.R
import ru.tikodvlp.numberstestapp.numbers.presentation.NumbersFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(savedInstanceState == null)
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, NumbersFragment())
            .commit()
    }
}