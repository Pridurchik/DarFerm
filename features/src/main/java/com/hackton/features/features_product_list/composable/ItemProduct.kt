package com.hackton.features.features_product_list.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedIconToggleButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hackton.features.R
import com.hackton.features.features_auth.util.OurGreen
import com.hackton.features.features_product_list.domain.model.ProductModel

@Composable
fun ItemProduct(
    productModel: ProductModel
) {
    Card(
        modifier = Modifier.padding(start = 10.dp, end = 10.dp, top = 10.dp, bottom = 10.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column(
            modifier = Modifier.padding(20.dp)
        ) {
            Image(
                modifier = Modifier.size(width = 133.dp, height = 98.dp),
                painter = painterResource(id = productModel.painter),
                contentDescription = null
            )


            Text(
                modifier = Modifier.padding(top = 10.dp, bottom = 10.dp),
                text = productModel.title,
                fontSize = 15.sp,
                fontWeight = FontWeight(600),
            )

            Text(text = "")


            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = productModel.price,
                    fontSize = 15.sp,
                    fontWeight = FontWeight(600),
                    color = OurGreen
                )

                Text(
                    text = productModel.unit,
                    color = Color.Gray,
                    fontWeight = FontWeight(600),
                    fontSize = 12.sp
                )
            }


            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                OutlinedIconToggleButtonWithAnimatedShapeSample()
            }

        }
    }
}


@Composable
fun OutlinedIconToggleButtonWithAnimatedShapeSample() {
    var checked by rememberSaveable {
        mutableStateOf(false)
    }

    OutlinedIconToggleButton(
        shape = RoundedCornerShape(14.dp),
        checked = checked,
        onCheckedChange = { checked = it },
    ) {
        if (checked) {
            Icon(Icons.Filled.Check, contentDescription = "Localized description")
        } else {
            Icon(Icons.Outlined.Add, contentDescription = "Localized description")
        }
    }
}