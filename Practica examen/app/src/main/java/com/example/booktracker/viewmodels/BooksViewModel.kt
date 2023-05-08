package com.example.booktracker.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.booktracker.BooksTrackerApplication
import com.example.booktracker.repositories.BooksRepository

class BooksViewModel(val booksRepository: BooksRepository): ViewModel() {
    fun getBooks() = booksRepository.getBooks()

    companion object{
        val Factory = viewModelFactory{
            initializer {
                val booksRepository =
                    (this[APPLICATION_KEY] as BooksTrackerApplication).booksRepository
                BooksViewModel(booksRepository)
            }
        }
    }
}