package com.dicoding.alfred.secondsubmission.ui.home

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.dicoding.alfred.secondsubmission.LiveDataTestUtil
import com.dicoding.alfred.secondsubmission.data.DataModel
import com.dicoding.alfred.secondsubmission.data.source.CatalogRepository
import com.dicoding.alfred.secondsubmission.utils.Dummy
import com.nhaarman.mockitokotlin2.verify
import junit.framework.Assert.assertEquals
import junit.framework.Assert.assertNotNull
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class HomeViewModelTest {

    private val dummyMovie  =  Dummy.generateDataMovieDummy()
    private val dummyTvShow  =  Dummy.generateDataTvShowDummy()

    private lateinit var viewModel: HomeViewModel

    @get:Rule
    var instantTaskExecutorRule  =  InstantTaskExecutorRule()

    @Mock
    private lateinit var catalogRepository: CatalogRepository

    @Mock
    private lateinit var observer: Observer<List<DataModel>>

    @Before
    fun setUp() {
        viewModel  =  HomeViewModel(catalogRepository)
    }

    @Test
    fun getListNowPlayingMovies() {
        val movie  =  MutableLiveData<List<DataModel>>()
        movie.value  =  dummyMovie

        `when`(catalogRepository.getNowPlayingMovies()).thenReturn(movie)

        viewModel.getListNowPlayingMovies().observeForever(observer)
        val dataListMovie  =  LiveDataTestUtil.getValue(movie)

        assertNotNull(dataListMovie)
        assertEquals(10, dataListMovie?.size)

        verify(observer).onChanged(dummyMovie)
        verify(catalogRepository).getNowPlayingMovies()
    }

    @Test
    fun getListOnTheAirTvShows() {
        val tvShow  =  MutableLiveData<List<DataModel>>()
        tvShow.value  =  dummyTvShow

        `when`(catalogRepository.getTvShowOnTheAir()).thenReturn(tvShow)

        viewModel.getListOnTheAirTvShows().observeForever(observer)
        val dataListTvShow  =  LiveDataTestUtil.getValue(tvShow)

        assertNotNull(dataListTvShow)
        assertEquals(10, dataListTvShow?.size)

        verify(observer).onChanged(dummyTvShow)
        verify(catalogRepository).getTvShowOnTheAir()
    }
}