package com.greydevelopers.newsapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.greydevelopers.newsapp.R
import com.greydevelopers.newsapp.db.ArticleDatabase
import com.greydevelopers.newsapp.repositories.NewsRepository
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var  viewModel: NewsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val newsRepository = NewsRepository(ArticleDatabase(this))
        val viewModelProviderFactory = NewsViewModelProviderFactory(application,newsRepository)
        viewModel = ViewModelProvider(this,viewModelProviderFactory).get(NewsViewModel::class.java)

        bottomNavigationView.setupWithNavController(nav_host_fragment.findNavController())
    }
}