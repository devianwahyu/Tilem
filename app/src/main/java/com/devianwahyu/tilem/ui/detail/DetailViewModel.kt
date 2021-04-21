package com.devianwahyu.tilem.ui.detail

import androidx.lifecycle.ViewModel
import com.devianwahyu.tilem.data.ModelEntity
import com.devianwahyu.tilem.utils.DataDummy

class DetailViewModel : ViewModel() {
    fun getDetailMovie(id: String): ModelEntity? {
        val movies = DataDummy.generateDummyMovies()
        for (movie in movies) {
            if (movie.id == id) {
                return movie
            }
        }
        return null
    }
    fun getDetailTVShows(id: String): ModelEntity? {
        val tvShows = DataDummy.generateDummyTvShows()
        for (tvShow in tvShows) {
            if (tvShow.id == id) {
                return tvShow
            }
        }
        return null
    }
}