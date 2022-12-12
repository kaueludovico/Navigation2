package com.bigrocket.navigation

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class FirstFragment : Fragment(R.layout.fragment_first) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val data = view.findViewById<EditText>(R.id.data)


        view.findViewById<Button>(R.id.first).setOnClickListener{
            val action = FirstFragmentDirections.actionFirstToSecondFragment(
                "${data.text}"
            )
            findNavController().navigate(action)
        }
    }
}