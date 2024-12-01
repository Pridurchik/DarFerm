package com.hackton.darmarket.ui.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.KeyboardArrowLeft
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.hackton.darmarket.R
import com.hackton.darmarket.navigation.AppNavGraph
import com.hackton.darmarket.navigation.NavigationItem
import com.hackton.darmarket.navigation.Screen
import com.hackton.features.feature_main.ui.AboutAs
import com.hackton.features.feature_user.ui.UserProfile
import com.hackton.features.features_auth.composable.Auth
import com.hackton.features.features_auth.util.OurGreen
import com.hackton.features.features_product_list.composable.ProductList
import com.hackton.features.features_product_list.composable.ScrollingTextTabs
import com.hackton.features.features_product_list.domain.model.ProductModel
import com.hackton.features.features_regist.composable.Registration

@Composable
fun AddProductList(
) {
    Column(
        modifier = Modifier.background(Color(0xFFE7E5E5))
    ) {

        ScrollingTextTabs(
            modifier = Modifier,
        ) {
            val titleList = mutableListOf("Инжир", "Яблоки", "Гранат", "Абрикосы", "Хурма", "Черешня")
            val painterResList = mutableListOf(R.drawable.icon_inchir, R.drawable.icon_apple, R.drawable.icon_granat,
                R.drawable.icon_abricos, R.drawable.icon_churma, R.drawable.icon_cherechna
            )
            val price = mutableListOf("250", "150", "200", "259", "120", "280")

            val listProductModel = mutableListOf<ProductModel>().apply {
                repeat(3) {
                    for (i in 0..<6) {
                        this.add(
                            ProductModel(
                                id = i,
                                title = titleList[i],
                                painter = painterResList[i],
                                price = price[i],
                                unit = "/ kg"
                            )
                        )
                    }
                }
            }



            ProductList(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = 20.dp),
                items = mutableListOf<ProductModel>().apply {
                    for(i in 0..<18) {
                        this.add(
                            listProductModel[i]
                        )
                    }
                }
            )
        }

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(
) {
    val hostController = rememberNavController()

    Scaffold(
        topBar = {
            TopAppBar(
                navigationIcon = {
                    IconButton(
                        colors = IconButtonDefaults.iconButtonColors(
                            containerColor = OurGreen,
                            contentColor = OurGreen,
                            disabledContentColor = OurGreen,
                            disabledContainerColor = OurGreen
                        ),
                        modifier = Modifier,

                        onClick = {

                        }) {
                        Icon(
                            modifier = Modifier
                                .background(OurGreen)
                                .clip(RoundedCornerShape(1.dp)),
                            imageVector = Icons.Outlined.KeyboardArrowLeft,
                            tint = Color.White,
                            contentDescription = null
                        )
                    }
                },
                title = {
                    val textFieldStateSearcher = remember {
                        mutableStateOf("")
                    }

                    TextField(
                        modifier = Modifier
                            .fillMaxWidth(),
                        value = textFieldStateSearcher.value,
                        onValueChange = { newText -> textFieldStateSearcher.value = newText},
                        label = {
                            Text(text = "Найти..")
                        },
                        leadingIcon = {
                            Icon(
                                imageVector = Icons.Outlined.Search,
                                contentDescription = null
                            )
                        },
                        maxLines = 1,
                        colors = TextFieldDefaults.colors(
//                focusedIndicatorColor = Color(0xFFb9bdbd),
                            unfocusedIndicatorColor = Color.Transparent,
                            unfocusedLabelColor = Color.Gray,
                            focusedContainerColor = Color.Transparent,
                            unfocusedContainerColor = Color.Transparent,
                            disabledContainerColor = Color.Transparent,
                        )
                    )

                },
                actions = {
                    Icon(
                        modifier = Modifier.padding(end = 25.dp),
                        imageVector = Icons.Outlined.FavoriteBorder,
                        contentDescription = null
                    )
                }
            )
        },
        bottomBar = {
            NavigationBar {
                /**
                 * Тут мы просто получаем текущий открытый экран
                 **/

                val navBackStackEntry by hostController.currentBackStackEntryAsState()
                val currentRout = navBackStackEntry?.destination?.route

                val items = listOf(
                    NavigationItem.Home,
                    NavigationItem.ProductList,
                    NavigationItem.User,
                    NavigationItem.ProductSave
                )



                items.forEach { item ->
                    NavigationBarItem(
                        selected = currentRout == item.screen.route ,
                        onClick = {
                            hostController.navigate(item.screen.route) {
                                launchSingleTop = true
                            }
                        },
                        icon = { Icon(item.icon, contentDescription = null) },
                        label = {
                            Text(text = stringResource(id = item.titleResId))
                        },
                        colors = NavigationBarItemDefaults.colors(
                            selectedIconColor = Color.Black,
                            unselectedIconColor = Color.Red
                        )
                    )
                }
            }
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier.padding(paddingValues)
        ) {
            AppNavGraph(
                navHostController = hostController,
                AuthContent = {
                    Auth()
                },
                RegistContent = {
                    Registration()
                },
                ProfileContent = {
                    UserProfile()
                },
                ProductListContent = {
                    AddProductList()
                },
                AllSaveProductListContent = {
                    Text(text = "ProfileContent")
                },
                HomeContent = {
                    AboutAs()
                },
                startScreen = Screen.ProductList.route,

            )
        }
    }
}

