package com.example.moviebox.presentation.ui.fragment.auth.getstarted

import androidx.navigation.fragment.findNavController
import com.example.moviebox.common.base.BaseFragment
import com.example.moviebox.databinding.FragmentGetStartedBinding

class GetStartedFragment : BaseFragment<FragmentGetStartedBinding>(FragmentGetStartedBinding::inflate) {

    override fun setup() {
        findNavController().navigate(GetStartedFragmentDirections.actionGetStartedFragmentToHomeFragment3())
    }
}