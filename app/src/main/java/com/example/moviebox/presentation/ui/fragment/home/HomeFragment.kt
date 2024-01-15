package com.example.moviebox.presentation.ui.fragment.home

import com.example.moviebox.common.base.BaseFragment
import com.example.moviebox.databinding.FragmentHomeBinding
import com.google.android.material.tabs.TabLayoutMediator

class HomeFragment : BaseFragment<FragmentHomeBinding>(FragmentHomeBinding::inflate) {

    override fun setup() {
        tabSetup()
    }

    private fun tabSetup(){
        val tabAdapter=HomeViewPagerAdapter(this)
        binding.apply {
            viewPager.adapter=tabAdapter

            TabLayoutMediator(tabLayout,viewPager){tab,position->
                when(position){
                    0->tab.text="Cinema"
                    1->tab.text="Online"
                    else->tab.text="Cinema"
                }
            }.attach()
        }


    }


}