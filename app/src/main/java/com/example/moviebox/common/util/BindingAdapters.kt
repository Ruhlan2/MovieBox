package com.example.moviebox.common.util

import android.widget.ImageView
import androidx.databinding.BindingAdapter

object BindingAdapters {


    @BindingAdapter("app:setImageUrl")
    @JvmStatic
    fun setImageUrl(
        view: ImageView,
        url:String?
    ){
        url?.let {
            view.setImageUrl(it,view.context)
        }
    }



}