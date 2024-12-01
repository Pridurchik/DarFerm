package com.hackton.darmarket.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector
import com.hackton.darmarket.R

sealed class NavigationItem(
    val screen: Screen,
    val titleResId : Int,
    val icon : ImageVector
) {

    data object Home:  NavigationItem(
        screen = Screen.Home,
        titleResId = R.string.navigationItem_home,
        icon = Icons.Outlined.Home,
    )

    data object ProductSave: NavigationItem(
        screen = Screen.AllSaveProductList,
        titleResId = R.string.navigationItem_productSave,
        icon = Icons.Outlined.FavoriteBorder,
    )

    data object ProductList: NavigationItem(
        screen = Screen.ProductList,
        titleResId = R.string.navigationItem_productList,
        icon = Icons.Outlined.ShoppingCart,
    )

    data object User: NavigationItem(
        screen = Screen.ProfileUser,
        titleResId = R.string.navigationItem_productSave,
        icon = Icons.Outlined.FavoriteBorder,
    )

}
