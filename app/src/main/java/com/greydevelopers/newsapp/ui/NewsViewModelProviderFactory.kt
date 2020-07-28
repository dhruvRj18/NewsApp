package com.greydevelopers.newsapp.ui

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.greydevelopers.newsapp.repositories.NewsRepository
import java.lang.Appendable

class NewsViewModelProviderFactory(
    val app:Application,
    val newsRepository: NewsRepository
) :ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return NewsViewModel(app,newsRepository ) as T
    }
}