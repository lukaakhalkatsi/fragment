package com.example.fragment.fragments

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.fragment.R

class NotificationFragment: Fragment(R.layout.notifiation_fragment) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextView>(R.id.text).text = NotificationFragmentArgs.fromBundle(requireArguments()).name
    }
}