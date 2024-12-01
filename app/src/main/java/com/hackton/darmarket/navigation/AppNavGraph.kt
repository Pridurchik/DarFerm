package com.hackton.darmarket.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun AppNavGraph(
    navHostController: NavHostController,
    AuthContent: @Composable () -> Unit,
    HomeContent: @Composable () -> Unit,
    RegistContent: @Composable () -> Unit,
    ProfileContent: @Composable () -> Unit,
    ProductListContent: @Composable () -> Unit,
    AllSaveProductListContent: @Composable () -> Unit,
    startScreen: String
) {
    NavHost(
        startDestination = startScreen,
        navController = navHostController
    ) {
        composable(Screen.Home.route) {
            HomeContent()
        }
        composable(Screen.Auth.route) {
            AuthContent()
        }
        composable(Screen.Regist.route) {
            RegistContent()
        }
        composable(Screen.ProfileUser.route) {
            ProfileContent()
        }
        composable(Screen.ProductList.route) {
            ProductListContent()
        }
        composable(Screen.AllSaveProductList.route) {
            AllSaveProductListContent()
        }
    }
}