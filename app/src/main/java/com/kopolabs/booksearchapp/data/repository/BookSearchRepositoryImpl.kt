package com.kopolabs.booksearchapp.data.repository

import com.kopolabs.booksearchapp.data.api.RetrofitInstance.api
import com.kopolabs.booksearchapp.data.model.SearchResponse
import retrofit2.Response

class BookSearchRepositoryImpl : BookSearchRepository {
    override suspend fun searchBooks(
        query: String,
        sort: String,
        page: Int,
        size: Int
    ): Response<SearchResponse> {
        return api.searchBook(query, sort, page, size)
    }

}