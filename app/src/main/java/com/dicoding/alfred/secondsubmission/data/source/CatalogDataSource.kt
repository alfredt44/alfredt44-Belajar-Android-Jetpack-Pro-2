package com.dicoding.alfred.secondsubmission.data.source

import androidx.lifecycle.LiveData
import com.dicoding.alfred.secondsubmission.data.DataModel

interface CatalogDataSource {

    fun getNowPlayingMovies(): LiveData<List<DataModel>>

    fun getMovieDetail(movieId: Int): LiveData<DataModel>

    fun getTvShowOnTheAir(): LiveData<List<DataModel>>

    fun getTvShowDetail(tvShowId: Int): LiveData<DataModel>

}