package com.hackton.features.features_product_list.domain.model

import androidx.annotation.DrawableRes
import androidx.annotation.IdRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter

data class ProductModel(
    val id: Int,
    val title: String,
    val painter: Int,
    val price: String,
    val unit: String
)
