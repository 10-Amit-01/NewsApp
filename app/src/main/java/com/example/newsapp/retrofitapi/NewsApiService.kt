package com.example.newsapp.retrofitapi

import com.example.newsapp.Model.NewsResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApiService {
    @GET("everything")
    fun searchNews(
        @Query("q") query: String,
        @Query("apikey") apikey: String = "c0f6bacc8ac4487e8fa382b9ded74593"
    ) : Call<NewsResponse>
}