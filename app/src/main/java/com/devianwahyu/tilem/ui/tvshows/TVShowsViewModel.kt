package com.devianwahyu.tilem.ui.tvshows

import androidx.lifecycle.ViewModel
import com.devianwahyu.tilem.data.ModelEntity
import com.devianwahyu.tilem.utils.DataDummy

class TVShowsViewModel: ViewModel() {
    fun getTVShows(): List<ModelEntity> = DataDummy.generateDummyTvShows()
}