package com.hackton.darmarket.navigation

sealed class Screen(
    val route: String
) {


    object Auth : Screen(AUTH_SCREEN)
    object Regist : Screen(REGIST_SCREEN)
    object ProfileUser : Screen(PROFILE_SCREEN)
    object ProductList : Screen(PRODUCT_LIST_SCREEN)
    object AllSaveProductList : Screen(ALL_SAVE_PRODUCT_SCREEN)
    object Home : Screen(HOME_SCREEN)

    private companion object SCREENS {
        const val HOME_SCREEN = "home"
        const val AUTH_SCREEN = "auth"
        const val REGIST_SCREEN = "regist"
        const val PROFILE_SCREEN = "profile"
        const val PRODUCT_LIST_SCREEN = "product_list"
        const val ALL_SAVE_PRODUCT_SCREEN = "save_product"
    }
}