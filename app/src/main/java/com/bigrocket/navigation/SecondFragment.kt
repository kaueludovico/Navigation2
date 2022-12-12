package com.bigrocket.navigation

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

class SecondFragment : Fragment(R.layout.fragment_second) {

    private val args : SecondFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.result).text = "${args.dado}"

        view.findViewById<Button>(R.id.second).setOnClickListener {
            findNavController().navigate(R.id.actionSecondToFirstFragment)
        }
    }
}