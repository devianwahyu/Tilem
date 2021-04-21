package com.devianwahyu.tilem.ui.tvshows

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class TVShowsViewModelTest {

    private lateinit var viewModel: TVShowsViewModel

    @Before
    fun setUp() {
        viewModel = TVShowsViewModel()
    }

    @Test
    fun getTVShows() {
        val tvShows = viewModel.getTVShows()
        assertNotNull(tvShows)
        assertEquals(10, tvShows.size)
    }
}