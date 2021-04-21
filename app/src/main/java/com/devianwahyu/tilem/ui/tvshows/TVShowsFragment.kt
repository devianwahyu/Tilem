package com.devianwahyu.tilem.ui.tvshows

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.devianwahyu.tilem.databinding.FragmentTvShowBinding

class TVShowsFragment : Fragment() {

    private lateinit var fragmentBinding: FragmentTvShowBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentBinding = FragmentTvShowBinding.inflate(layoutInflater, container, false)
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null) {
            val viewModel = TVShowsViewModel()
            val tvShows = viewModel.getTVShows()

            val movieAdapter = TVShowsAdapter()
            movieAdapter.setMovies(tvShows)

            with(fragmentBinding.rvTvShow) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = movieAdapter
            }
        }
    }
}