package com.example.newsapp.ui.api

import com.example.newsapp.ui.models.NewsResponse
import com.example.newsapp.ui.util.constants.Companion.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
import java.util.Locale.IsoCountryCode

interface NewsAPI {

    @GET("v2/top-headlines")
    suspend fun getheadlines(
        @Query("country")
        countryCode: String = "us",
        @Query("page")
        pageNumber: Int = 1,
        @Query("apikey")
        apiKey: String = API_KEY

    ): Response<NewsResponse>

    @GET("v2/everything")
    suspend fun searchForNews(
        @Query("q")
        searchQuery:String,
        @Query("page")
        pageNumber: Int = 1,
        @Query("apikey")
        apiKey: String = API_KEY
    ):Response<NewsResponse>

}