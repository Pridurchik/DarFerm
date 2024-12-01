package com.hackton.features.feature_main.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hackton.features.R
@Preview(showBackground = true)
@Composable
fun AboutAs() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(id = R.drawable.img_3), contentDescription = null)


        Image(
            modifier = Modifier.fillMaxWidth(),
            painter = painterResource(id = R.drawable.icon_main_screen_bg),
            contentDescription = null
        )

        Text(
            text = "Мы объединяем фермеров\n" +
                    "и покупателей, создавая удобный канал для взаимовыгодного взаимодействия.\n" +
                    "Наша цель — поддержка местных производителей и продвижение устойчивого потребления."
        )
    }
}

@Composable
fun ItemAllSave(
    name: String,
    ves: String
) {
    Row {
        Image(
            painter = painterResource(id = R.drawable.img),
            contentDescription = null
        )

        Column(
            modifier = Modifier.padding(start = 10.dp)
        ) {
            Text(
                text = name
            )

            Text(
                modifier = Modifier.padding(top = 5.dp),
                text = name
            )

        }
    }

}