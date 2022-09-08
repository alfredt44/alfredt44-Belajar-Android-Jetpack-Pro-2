package com.dicoding.alfred.secondsubmission.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.dicoding.alfred.secondsubmission.data.DataModel
import com.dicoding.alfred.secondsubmission.data.source.CatalogRepository

class HomeViewModel(private val catalogRepository: CatalogRepository) : ViewModel() {

    fun getListNowPlayingMovies(): LiveData<List<DataModel>>  =  catalogRepository.getNowPlayingMovies()

    fun getListOnTheAirTvShows(): LiveData<List<DataModel>>  =  catalogRepository.getTvShowOnTheAir()

}