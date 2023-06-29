package com.example.hiltdaggerdepinjection.data.repository

import android.app.Application
import com.example.hiltdaggerdepinjection.R
import com.example.hiltdaggerdepinjection.data.remote.MyApi
import com.example.hiltdaggerdepinjection.domain.repository.MyRepository
import javax.inject.Inject

class MyRepositoryImplementation @Inject constructor(
    private val myApi: MyApi,
    private val appContext:Application
): MyRepository {

    init {
        val appName = appContext.getString(R.string.app_name)
        println("hello from the repository implementation : $appName")
    }
    override suspend fun doNetworkCall() {
        TODO("Not yet implemented")
    }
}