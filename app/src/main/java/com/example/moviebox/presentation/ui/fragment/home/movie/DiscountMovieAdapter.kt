package com.example.moviebox.presentation.ui.fragment.home.movie

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.moviebox.databinding.ItemTopmovieBinding
import com.example.moviebox.domain.model.movie_lists.popular_movies.Result

class DiscountMovieAdapter: RecyclerView.Adapter<DiscountMovieAdapter.MovieHolder>() {


    private val movieList=ArrayList<Result>()

    inner class MovieHolder(val binding:ItemTopmovieBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieHolder {
        val layout=ItemTopmovieBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MovieHolder(layout)
    }

    override fun getItemCount(): Int=movieList.size

    override fun onBindViewHolder(holder: MovieHolder, position: Int) {
        val item=movieList[position]
        holder.binding.popular=item

    }
    fun updateList(list: List<Result>){
        movieList.clear()
        movieList.addAll(list)
        notifyDataSetChanged()
    }
}