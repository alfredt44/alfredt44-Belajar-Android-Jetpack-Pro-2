package com.dicoding.alfred.secondsubmission.ui.detail

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.dicoding.alfred.secondsubmission.LiveDataTestUtil
import com.dicoding.alfred.secondsubmission.data.DataModel
import com.dicoding.alfred.secondsubmission.data.source.CatalogRepository
import com.dicoding.alfred.secondsubmission.utils.Dummy
import com.nhaarman.mockitokotlin2.any
import com.nhaarman.mockitokotlin2.verify
import junit.framework.Assert.assertEquals
import junit.framework.Assert.assertNotNull
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.`when`
import org.mockito.MockitoAnnotations
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class DetailViewModelTest {

    private val dummyMovie  =  Dummy.generateDataMovieDummy()[0]
    private val movieId  =  dummyMovie.id
    private val dummyTvShow  =  Dummy.generateDataTvShowDummy()[0]
    private val tvShowId  =  dummyTvShow.id

    private lateinit var viewModel: DetailViewModel

    @get:Rule
    val instantTaskExecutorRule  =  InstantTaskExecutorRule()

    @Mock
    private lateinit var catalogRepository: CatalogRepository

    @Mock
    private lateinit var observer: Observer<DataModel>

    @Before
    fun setUp() {
        viewModel  =  DetailViewModel(catalogRepository)
    }

    @Test
    fun getMovieDetail() {
        val movieDummy  =  MutableLiveData<DataModel>()
        movieDummy.value  =  dummyMovie

        `when`(catalogRepository.getMovieDetail(movieId)).thenReturn(movieDummy)

        viewModel.getMovieDetail(movieId).observeForever(observer)
        val movieData  =  LiveDataTestUtil.getValue(movieDummy)

        assertNotNull(movieData)
        assertEquals(dummyMovie.id, movieData.id)
        assertEquals(dummyMovie.name, movieData.name)
        assertEquals(dummyMovie.desc, movieData.desc)
        assertEquals(dummyMovie.poster, movieData.poster)
        assertEquals(dummyMovie.img_preview, movieData.img_preview)

        verify(observer).onChanged(dummyMovie)
        verify(catalogRepository).getMovieDetail(movieId)

    }

    @Test
    fun getTvShowDetail() {
        val tvShowDummy  =  MutableLiveData<DataModel>()
        tvShowDummy.value  =  dummyTvShow

        `when`(catalogRepository.getTvShowDetail(tvShowId)).thenReturn(tvShowDummy)
        viewModel.getTvShowDetail(tvShowId).observeForever(observer)

        val tvShowData  =  LiveDataTestUtil.getValue(tvShowDummy)

        assertNotNull(tvShowData)
        assertEquals(dummyTvShow.id, tvShowData.id)
        assertEquals(dummyTvShow.name, tvShowData.name)
        assertEquals(dummyTvShow.desc, tvShowData.desc)
        assertEquals(dummyTvShow.poster, tvShowData.poster)
        assertEquals(dummyTvShow.img_preview, tvShowData.img_preview)

        verify(observer).onChanged(dummyTvShow)
        verify(catalogRepository).getTvShowDetail(tvShowId)
    }

}