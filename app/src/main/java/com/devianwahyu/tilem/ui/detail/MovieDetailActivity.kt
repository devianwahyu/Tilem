package com.devianwahyu.tilem.ui.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.devianwahyu.tilem.R
import com.devianwahyu.tilem.data.ModelEntity
import com.devianwahyu.tilem.databinding.ActivityDetailBinding
import com.devianwahyu.tilem.databinding.ContentDetailBinding

class MovieDetailActivity : AppCompatActivity() {

    private lateinit var detailBinding: ActivityDetailBinding
    private lateinit var detailContentBinding: ContentDetailBinding

    companion object {
        const val EXTRA_MOVIE = "extra_movie"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        detailBinding = ActivityDetailBinding.inflate(layoutInflater)
        detailContentBinding = detailBinding.detailContent

        setContentView(detailBinding.root)
        setSupportActionBar(findViewById(R.id.toolbar))

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val extras = intent.extras
        if (extras != null) {
            val id = extras.getString(EXTRA_MOVIE)
            if (id != null) {
                val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[DetailViewModel::class.java]
                val movie = viewModel.getDetailMovie(id)
                movie?.let { populateMovie(it) }
            }
        }
    }

    private fun populateMovie(movie: ModelEntity) {
        detailContentBinding.title.text = movie.title
        detailContentBinding.rilisDate.text = movie.releaseDate
        detailContentBinding.description.text = movie.description
        detailContentBinding.rating.text = movie.rating.toString()
        Glide.with(this)
                .load(movie.posterImage)
                .into(detailContentBinding.imgPoster)
    }
}