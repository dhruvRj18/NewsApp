package com.greydevelopers.newsapp.models

import com.greydevelopers.newsapp.models.Article

data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)