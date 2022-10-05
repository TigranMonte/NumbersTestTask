package ru.tikodvlp.numberstestapp.numbers.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.tikodvlp.numberstestapp.R
import ru.tikodvlp.numberstestapp.details.presentation.DetailsFragment

class NumbersFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_numbers, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<View>(R.id.progressBar).visibility = View.GONE

        view.findViewById<View>(R.id.getBtn).setOnClickListener {
            val detailsFragment = DetailsFragment()

            requireActivity().supportFragmentManager.beginTransaction()
                .add(R.id.container, detailsFragment)
                .addToBackStack(detailsFragment.javaClass.simpleName)
                .commit()
        }
    }

    override fun onDetach() {
        super.onDetach()
    }
}