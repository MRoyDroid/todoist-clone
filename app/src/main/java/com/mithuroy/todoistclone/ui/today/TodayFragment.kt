package com.mithuroy.todoistclone.ui.today

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.mithuroy.todoistclone.R

class TodayFragment : Fragment() {

    private lateinit var todayViewModel: TodayViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        todayViewModel =
            ViewModelProviders.of(this).get(TodayViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_today, container, false)
        val textView: TextView = root.findViewById(R.id.text_today)
        todayViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}