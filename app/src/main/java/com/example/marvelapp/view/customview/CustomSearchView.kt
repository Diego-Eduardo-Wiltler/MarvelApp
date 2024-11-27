package com.example.marvelapp.view.customview

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.marvelapp.R


class CustomSearchView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,

) : ConstraintLayout(context, attrs, defStyleAttr) {
    private var parentView: View = inflate(getContext(), R.layout.search_bar, this)

}
