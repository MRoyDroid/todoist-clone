package com.mithuroy.todoistclone.ui.next_7_days

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.mithuroy.todoistclone.R

class Next7DaysFragment : Fragment() {

    private lateinit var next7DaysViewModel: Next7DaysViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        next7DaysViewModel =
            ViewModelProviders.of(this).get(Next7DaysViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_next_7_days, container, false)
        val textView: TextView = root.findViewById(R.id.text_next_7_days)
        next7DaysViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}