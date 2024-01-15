package com.example.moviebox.presentation.ui.fragment.splash

import androidx.navigation.fragment.findNavController
import com.example.moviebox.common.base.BaseFragment
import com.example.moviebox.databinding.FragmentSplashBinding
import com.example.moviebox.presentation.ui.fragment.auth.getstarted.GetStartedFragment
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashFragment : BaseFragment<FragmentSplashBinding>(FragmentSplashBinding::inflate) {

    private var job:Job?=null

    override fun setup() {
        job= CoroutineScope(Dispatchers.Main).launch {
            delay(5000L)
            findNavController().navigate(SplashFragmentDirections.actionSplashFragmentToGetStartedFragment())
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        job?.cancel()
    }

}