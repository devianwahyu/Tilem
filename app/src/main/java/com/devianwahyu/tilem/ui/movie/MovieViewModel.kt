package com.devianwahyu.tilem.ui.movie

import androidx.lifecycle.ViewModel
import com.devianwahyu.tilem.data.ModelEntity
import com.devianwahyu.tilem.utils.DataDummy

class MovieViewModel : ViewModel() {
    fun getMovie(): List<ModelEntity> = DataDummy.generateDummyMovies()
}