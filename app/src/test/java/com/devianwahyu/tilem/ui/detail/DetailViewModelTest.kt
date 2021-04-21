package com.devianwahyu.tilem.ui.detail

import com.devianwahyu.tilem.utils.DataDummy
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class DetailViewModelTest {

    private lateinit var viewModel: DetailViewModel
    private val dummyMovies = DataDummy.generateDummyMovies()[0]
    private val dummyTVShows = DataDummy.generateDummyTvShows()[0]
    private val moviesId = dummyMovies.id
    private val tvShowsId = dummyTVShows.id

    @Before
    fun setUp() {
        viewModel = DetailViewModel()
        viewModel.getDetailMovie(moviesId)
        viewModel.getDetailTVShows(tvShowsId)
    }

    @Test
    fun getDetailMovie() {
        val movieEntity = viewModel.getDetailMovie(moviesId)
        assertNotNull(movieEntity)
        assertEquals(dummyMovies.id, movieEntity?.id)
        assertEquals(dummyMovies.rating, movieEntity?.rating)
        assertEquals(dummyMovies.releaseDate, movieEntity?.releaseDate)
        assertEquals(dummyMovies.title, movieEntity?.title)
        assertEquals(dummyMovies.description, movieEntity?.description)
        assertEquals(dummyMovies.posterImage, movieEntity?.posterImage)
    }

    @Test
    fun getDetailTVShows() {
        val tvShowEntity = viewModel.getDetailTVShows(tvShowsId)
        assertNotNull(tvShowEntity)
        assertEquals(dummyTVShows.id, tvShowEntity?.id)
        assertEquals(dummyTVShows.rating, tvShowEntity?.rating)
        assertEquals(dummyTVShows.releaseDate, tvShowEntity?.releaseDate)
        assertEquals(dummyTVShows.title, tvShowEntity?.title)
        assertEquals(dummyTVShows.description, tvShowEntity?.description)
        assertEquals(dummyTVShows.posterImage, tvShowEntity?.posterImage)
    }
}