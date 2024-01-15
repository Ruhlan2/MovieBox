package com.example.moviebox.presentation.ui.fragment.home.movie

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.moviebox.databinding.ItemPresaleMovieBinding
import com.example.moviebox.domain.model.movie_lists.now_playing_movies.NowPlayingResult

class PresaleMovieAdapter: RecyclerView.Adapter<PresaleMovieAdapter.PresaleMovieHolder>() {

    private val presaleList=ArrayList<NowPlayingResult>()
    inner class PresaleMovieHolder(val binding:ItemPresaleMovieBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PresaleMovieHolder {
        val layout=ItemPresaleMovieBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return PresaleMovieHolder(layout)
    }

    override fun getItemCount(): Int=presaleList.size

    override fun onBindViewHolder(holder: PresaleMovieHolder, position: Int) {
        val item=presaleList[position]
        holder.binding.presale=item
    }

    fun updateList(list: List<NowPlayingResult>){
        presaleList.clear()
        presaleList.addAll(list)
        notifyDataSetChanged()
    }

}