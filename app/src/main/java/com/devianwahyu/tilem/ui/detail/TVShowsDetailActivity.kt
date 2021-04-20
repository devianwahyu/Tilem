package com.devianwahyu.tilem.ui.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.devianwahyu.tilem.R
import com.devianwahyu.tilem.data.ModelEntity
import com.devianwahyu.tilem.databinding.ActivityDetailBinding
import com.devianwahyu.tilem.databinding.ContentDetailBinding
import com.devianwahyu.tilem.utils.DataDummy

class TVShowsDetailActivity : AppCompatActivity() {

    private lateinit var detailBinding: ActivityDetailBinding
    private lateinit var detailContentBinding: ContentDetailBinding

    companion object {
        const val EXTRA_TV_SHOWS = "extra_tv_shows"
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
            val id = extras.getString(EXTRA_TV_SHOWS)
            if (id != null) {
                for (tvShow in DataDummy.generateDummyTvShows()) {
                    if (tvShow.id == id) {
                        populateTVShow(tvShow)
                    }
                }
            }
        }
    }

    private fun populateTVShow(tvShow: ModelEntity) {
        detailContentBinding.title.text = tvShow.title
        detailContentBinding.rilisDate.text = tvShow.releaseDate
        detailContentBinding.description.text = tvShow.description
        detailContentBinding.rating.text = tvShow.rating.toString()
        Glide.with(this)
                .load(tvShow.posterImage)
                .into(detailContentBinding.imgPoster)
    }
}