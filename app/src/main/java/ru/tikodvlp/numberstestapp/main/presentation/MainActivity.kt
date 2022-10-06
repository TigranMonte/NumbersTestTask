package ru.tikodvlp.numberstestapp.main.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import ru.tikodvlp.numberstestapp.R
import ru.tikodvlp.numberstestapp.numbers.presentation.NumbersFragment

class MainActivity : AppCompatActivity(), ShowFragment {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null)
            show(NumbersFragment(), false)
    }

    private fun show(fragment: Fragment, add: Boolean) {
        val transaction = supportFragmentManager.beginTransaction()
        if (add) transaction
            .add(R.id.container, fragment)
            .addToBackStack(fragment.javaClass.simpleName)
        else
            transaction.replace(R.id.container, fragment)
        transaction.commit()
    }

    override fun show(fragment: Fragment) {
        show(fragment, true)
    }
}

interface ShowFragment {
    fun show(fragment: Fragment)

    class Empty : ShowFragment {
        override fun show(fragment: Fragment) = Unit
    }
}