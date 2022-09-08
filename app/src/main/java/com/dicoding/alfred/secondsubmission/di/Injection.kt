package com.dicoding.alfred.secondsubmission.di

import com.dicoding.alfred.secondsubmission.data.source.CatalogRepository
import com.dicoding.alfred.secondsubmission.data.source.remote.RemoteDataSource

object Injection {

    fun provideCatalogRepository(): CatalogRepository {
        val remoteDataSource  =  RemoteDataSource.getInstance()
        return CatalogRepository.getInstance(remoteDataSource)
    }
}