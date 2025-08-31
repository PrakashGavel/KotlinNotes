package com.example.kotlinnotes

import androidx.lifecycle.ViewModel
import com.example.kotlinnotes.domain.repository.MyRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import dagger.Lazy


@HiltViewModel
class MyViewModel @Inject constructor(
    private val repository: Lazy<MyRepository> // Using Lazy to avoid circular dependency
): ViewModel() {

    init{
        repository.get()
    }
}