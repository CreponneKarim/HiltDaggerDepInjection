package com.example.hiltdaggerdepinjection.domain.repository

interface MyRepository {
    suspend fun doNetworkCall()
}