package com.example.moviebox.presentation.activity

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.moviebox.R
import com.example.moviebox.common.util.gone
import com.example.moviebox.common.util.visible
import com.example.moviebox.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val binding by lazy{
       ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setBottomNavigation()
    }

    private fun setBottomNavigation(){
        val navHost=supportFragmentManager.findFragmentById(R.id.fragmentContainerView2) as NavHostFragment
        val navController=navHost.navController

        NavigationUI.setupWithNavController(binding.bottomNavigationView,navController)

        navController.addOnDestinationChangedListener{_,destination,_->
            when(destination.id){
                R.id.splashFragment,
                R.id.getStartedFragment->binding.bottomNavigationView.gone()
                else->{
                    if (binding.bottomNavigationView.visibility==View.GONE) binding.bottomNavigationView.visible()
                }

            }
        }
    }
}