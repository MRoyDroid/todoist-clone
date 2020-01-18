package com.mithuroy.todoistclone.ui.next_7_days

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Next7DaysViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is next 7 days Fragment"
    }
    val text: LiveData<String> = _text
}