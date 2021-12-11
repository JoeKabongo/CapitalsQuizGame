package edu.sjsu.android.countriescapitalsquiz.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/* Represent continent name and it image */
data class Region(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)