package com.devianwahyu.tilem.ui.movie

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.devianwahyu.tilem.data.ModelEntity
import com.devianwahyu.tilem.databinding.ItemsBinding
import com.devianwahyu.tilem.ui.detail.MovieDetailActivity

class MovieAdapter: RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {
    inner class MovieViewHolder(private val binding: ItemsBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(model: ModelEntity) {
            with(binding) {
                title.text = model.title
                rilisDate.text = model.releaseDate
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, MovieDetailActivity::class.java)
                    intent.putExtra(MovieDetailActivity.EXTRA_MOVIE, model.id)
                    itemView.context.startActivity(intent)
                }
                Glide.with(itemView.context)
                    .load(model.posterImage)
                    .into(imgPoster)
            }
        }
    }

    private var listMovies = ArrayList<ModelEntity>()

    fun setMovies(models: List<ModelEntity>) {
        if (models.isNullOrEmpty()) return
        this.listMovies.clear()
        this.listMovies.addAll(models)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MovieViewHolder {
        val itemsMovieBinding = ItemsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieViewHolder(itemsMovieBinding)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = listMovies[position]
        holder.bind(movie)
    }

    override fun getItemCount(): Int = listMovies.size
}