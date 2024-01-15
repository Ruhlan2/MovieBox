package com.example.moviebox.presentation.ui.fragment.home.movie

import android.util.Log
import androidx.fragment.app.viewModels
import com.example.moviebox.common.base.BaseFragment
import com.example.moviebox.common.util.Status
import com.example.moviebox.databinding.FragmentMovieBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MovieFragment : BaseFragment<FragmentMovieBinding>(FragmentMovieBinding::inflate) {
    private val viewModel by viewModels<MovieMVVM>()
    private val popularAdapter=DiscountMovieAdapter()
    private val presaleAdapter=PresaleMovieAdapter()
    override fun setup() {
        setRv()
        observeData()
    }

    private fun observeData(){
        observeDiscountData()
        observePresaleData()
       // observeTopRatedData()
    }

    private fun observeTopRatedData() {
        viewModel.apply {
            topRatedMoviesList.observe(viewLifecycleOwner){
                when(it.status){
                    Status.SUCCESS->{
                        it.data?.let { topRated->
                        //    presaleAdapter.updateList(topRated)
                        }
                    }
                    Status.LOADING->{

                    }
                    Status.ERROR->{
                        Log.d("TopRatedMovieError:", it.message.toString())
                    }
                }
            }
        }
    }

    private fun setRv(){
        binding.apply {
            topMovieRv.adapter=popularAdapter
            presaleMovieRv.adapter=presaleAdapter
        }
    }

    private fun observeDiscountData(){
      viewModel.apply {
          popularMovieList.observe(viewLifecycleOwner){
              when(it.status){
                    Status.SUCCESS->{
                        it.data?.let { popular->
                            popularAdapter.updateList(popular)
                            Log.d("ObservePopularData: ", "observeDiscountData: ${popular.size}")
                        }
                    }
                  Status.LOADING->{

                  }
                  Status.ERROR->{
                      Log.d("PopularMovieError:", it.message.toString())
                  }
              }
          }
      }
    }

    private fun observePresaleData(){
        viewModel.apply {
            nowPlayingMovieList.observe(viewLifecycleOwner){
                when(it.status){
                    Status.SUCCESS->{
                        it.data?.let { presale->
                           presaleAdapter.updateList(presale)
                            Log.d("ObservePopularData: ", "observePresaleData: ${presale.size}")
                        }
                    }
                    Status.LOADING->{
                    }
                    Status.ERROR->{
                        Log.d("PresaleMovieError:", it.message.toString())
                    }
                }
            }
        }
    }


}