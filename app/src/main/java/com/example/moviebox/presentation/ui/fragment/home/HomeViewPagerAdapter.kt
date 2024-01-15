package com.example.moviebox.presentation.ui.fragment.home

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.moviebox.common.util.Constants
import com.example.moviebox.presentation.ui.fragment.TvSeriesFragment
import com.example.moviebox.presentation.ui.fragment.home.movie.MovieFragment


class HomeViewPagerAdapter(fragment:Fragment):FragmentStateAdapter(fragment){

    override fun getItemCount(): Int=Constants.NUM_TABS

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0-> MovieFragment()
            1-> TvSeriesFragment()
            else-> MovieFragment()
        }
    }
}