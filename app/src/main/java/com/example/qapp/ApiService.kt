package com.example.qapp

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("quotes")
    // function that return a List of QuotesModel Object
    fun getRandomQuotes(): Call<List<QuotesModel>>
}