package com.hackton.features.features_product_list.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Icon
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.hackton.features.features_auth.util.OurGreen
import com.hackton.features.features_product_list.domain.model.ProductModel

@Composable
fun ProductList(
    modifier: Modifier = Modifier,
    items: MutableList<ProductModel>
) {


    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = modifier
    ) {
        items(count = items.size) {
            ItemProduct(
                items[it]
            )
        }
    }
}

@Composable
fun ScrollingTextTabs(
    modifier: Modifier = Modifier,
    ContentOne: @Composable () -> Unit,
//    ContentTwo: @Composable () -> Unit,
//    ContentThree: @Composable () -> Unit,
//    ContentFour: @Composable () -> Unit,
//    ContentFive: @Composable () -> Unit,
//    ContentSix: @Composable () -> Unit
) {
    var state by remember { mutableIntStateOf(0) }
    val titles =
        listOf(
            "Фруткы",
            "Овощи",
            "Сухофрукты",
            "Мясо",
            "Молочка",
        )
    Column(
        modifier = modifier
    ) {
        ScrollableTabRow(selectedTabIndex = state) {
            titles.forEachIndexed { index, title ->
                Tab(
                    text = {
                        Text(
                            text = title,
                            color = Color(0xFF6D5945)
                        ) },
                    selectedContentColor = OurGreen,
                    selected = state == index,
                    onClick = {
                        state = index
                    }
                )
            }
        }
        ContentOne.invoke()
    }
}