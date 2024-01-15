package com.example.moviebox.common.util

import android.content.Context
import android.view.View
import android.widget.ImageView
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.moviebox.R


fun ImageView.setImageUrl(
    url:String,
    context:Context
){
    val options=RequestOptions.placeholderOf(placeHolder(context)).error(R.drawable.ic_launcher_foreground)
    Glide.with(context).setDefaultRequestOptions(options).load(Constants.BASE_IMAGE_URL+url).into(this)
}
fun View.visible(){
    this.visibility=View.VISIBLE
}
fun View.invisible(){
    this.visibility=View.INVISIBLE
}
fun View.gone(){
    this.visibility=View.GONE
}

private fun placeHolder(context:Context):CircularProgressDrawable{
    val circularProgressDrawable=CircularProgressDrawable(context)
    circularProgressDrawable.strokeWidth=8f
    circularProgressDrawable.centerRadius=40f
    circularProgressDrawable.setTint(context.getColor(R.color.nav_color))
    circularProgressDrawable.start()
    return circularProgressDrawable
}