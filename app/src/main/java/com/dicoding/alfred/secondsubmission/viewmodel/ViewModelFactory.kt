package com.dicoding.alfred.secondsubmission.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.dicoding.alfred.secondsubmission.data.source.CatalogRepository
import com.dicoding.alfred.secondsubmission.di.Injection
import com.dicoding.alfred.secondsubmission.ui.detail.DetailViewModel
import com.dicoding.alfred.secondsubmission.ui.home.HomeViewModel

class ViewModelFactory private constructor(private val mCatalogRepository: CatalogRepository): ViewModelProvider.NewInstanceFactory() {

    companion object {
        @Volatile
        private var instance: ViewModelFactory?  =  null

        fun getInstance(): ViewModelFactory  =
            instance ?: synchronized(this) {
                instance ?: ViewModelFactory(Injection.provideCatalogRepository())
            }
    }

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(HomeViewModel::class.java) -> {
                HomeViewModel(mCatalogRepository) as T
            }
            modelClass.isAssignableFrom(DetailViewModel::class.java) -> {
                DetailViewModel(mCatalogRepository) as T
            }
            else -> throw Throwable("Unknown ViewModel Class: " + modelClass.name)
        }

    }
}