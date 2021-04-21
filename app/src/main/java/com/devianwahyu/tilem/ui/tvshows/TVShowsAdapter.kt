package com.devianwahyu.tilem.ui.tvshows

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.devianwahyu.tilem.data.ModelEntity
import com.devianwahyu.tilem.databinding.ItemsBinding
import com.devianwahyu.tilem.ui.detail.TVShowsDetailActivity

class TVShowsAdapter: RecyclerView.Adapter<TVShowsAdapter.TVShowsViewHolder>() {
    class TVShowsViewHolder(private val binding: ItemsBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(model: ModelEntity) {
            with(binding) {
                title.text = model.title
                rilisDate.text = model.releaseDate
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, TVShowsDetailActivity::class.java)
                    intent.putExtra(TVShowsDetailActivity.EXTRA_TV_SHOWS, model.id)
                    itemView.context.startActivity(intent)
                }
                Glide.with(itemView.context)
                    .load(model.posterImage)
                    .into(imgPoster)
            }
        }
    }

    private var listTVShows = ArrayList<ModelEntity>()

    fun setMovies(models: List<ModelEntity>) {
        if (models.isNullOrEmpty()) return
        this.listTVShows.clear()
        this.listTVShows.addAll(models)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): TVShowsViewHolder {
        val itemsBinding = ItemsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TVShowsViewHolder(itemsBinding)
    }

    override fun onBindViewHolder(holder: TVShowsViewHolder, position: Int) {
        val movie = listTVShows[position]
        holder.bind(movie)
    }

    override fun getItemCount(): Int = listTVShows.size
}