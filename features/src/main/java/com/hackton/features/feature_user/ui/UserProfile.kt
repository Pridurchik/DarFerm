package com.hackton.features.feature_user.ui

import android.widget.Button
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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

@Preview(showBackground = true)
@Composable
fun UserProfile() {
    Column(
        modifier = Modifier
            .padding(top = 20.dp)
            .background(Color.White),
    ) {

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = R.drawable.icon_logo_profile),
                contentDescription = null
            )

            Text(
                text = "Фамилия Имя\n    Отчество",
                fontSize = 24.sp,
                fontWeight = FontWeight(300),
            )

        }


        Row(
            modifier = Modifier.padding(start = 20.dp, top = 20.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "email: ",
                fontSize = 25.sp,
                fontWeight = FontWeight(300),

            )
            Text(text = "magomedovgarun02@gmail.com")

        }

        ButtonInUserProfile(text = "Товары")
        ButtonInUserProfile(text = "Управление доставками")
        ButtonInUserProfile(text = "Чеки")
        ButtonInUserProfile(text = "Аналитика и отчеты")
    }

}


@Composable
fun ButtonInUserProfile(
    text: String
) {
    Button(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, end = 20.dp, top = 10.dp),
        onClick = {
        },
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent
        ),
        border = BorderStroke(2.dp, color = OurGreen),
        shape = RoundedCornerShape(12.dp)
    ) {
        Text(
            text = text,
            color = OurGreen,
            fontWeight = FontWeight(500)
        )
    }
}

