package com.example.marvelapp.view.adapter

import android.view.View
import android.widget.ImageView
import androidx.constraintlayout.helper.widget.Carousel

class ImageCarouselAdapter(private val images: List<Int>) : Carousel.Adapter {

    override fun count(): Int {
        return images.size
    }

    override fun populate(view: View?, index: Int) {
        if (view is ImageView) {
            view.setImageResource(images[index])
        }
    }

    override fun onNewItem(index: Int) {
        // Opcional: Log para depuração
    }
}
