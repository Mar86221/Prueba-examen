package com.example.booktracker

import android.app.Application
import com.example.booktracker.data.books
import com.example.booktracker.repositories.BooksRepository

class BooksTrackerApplication : Application() {
    val booksRepository: BooksRepository by lazy {
        BooksRepository(books)
    }
}