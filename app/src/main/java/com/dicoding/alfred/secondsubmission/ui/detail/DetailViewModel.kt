package com.dicoding.alfred.secondsubmission.ui.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.dicoding.alfred.secondsubmission.data.DataModel
import com.dicoding.alfred.secondsubmission.data.source.CatalogRepository

class DetailViewModel(private val catalogRepository: CatalogRepository) : ViewModel() {

    fun getMovieDetail(movieId: Int): LiveData<DataModel> = catalogRepository.getMovieDetail(movieId)

    fun getTvShowDetail(tvShowId: Int): LiveData<DataModel> = catalogRepository.getTvShowDetail(tvShowId
    )
}