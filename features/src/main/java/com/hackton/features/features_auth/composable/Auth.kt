package com.hackton.features.features_auth.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hackton.features.R
import com.hackton.features.features_auth.util.OurGreen

@Preview(showBackground = true)
@Composable
fun Auth(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
    ) {

        val textFieldStateEmail = remember {
            mutableStateOf("")
        }

        val textFieldStatePassword = remember {
            mutableStateOf("")
        }

        Row(
            modifier = Modifier
                .padding(top = 120.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                modifier = Modifier
                    ,
                text = "Авторизация",
                fontSize = 29.sp,
                fontWeight = FontWeight(600),
                color = OurGreen
            )
        }



        TextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp, top = 80.dp, bottom = 60.dp),
            value = textFieldStateEmail.value,
            onValueChange = {newText -> textFieldStateEmail.value = newText},
            label = {
                Text(text = "Введите свой email")
            },
            maxLines = 1,
            colors = TextFieldDefaults.colors(
//                focusedIndicatorColor = Color(0xFFb9bdbd),
//                unfocusedIndicatorColor = Color(0xFFb9bdbd),
//                unfocusedLabelColor = Color(0xFFb9bdbd),
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = Color.Transparent,
                disabledContainerColor = Color.Transparent,
            )
        )


        TextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp, bottom = 60.dp),
            value = textFieldStatePassword.value,
            onValueChange = { newText -> textFieldStatePassword.value = newText},
            label = {
                Text(text = "Пароль")
            },
            maxLines = 1,
            colors = TextFieldDefaults.colors(
//                focusedIndicatorColor = Color(0xFFb9bdbd),
//                unfocusedIndicatorColor = Color(0xFFb9bdbd),
//                unfocusedLabelColor = Color(0xFFb9bdbd),
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = Color.Transparent,
                disabledContainerColor = Color.Transparent,
            )
        )


        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 35.dp, end = 35.dp),
                onClick = {

                },
                colors = ButtonDefaults.buttonColors(containerColor = OurGreen),
                shape = RoundedCornerShape(
                    topStart = 14.dp,
                    topEnd = 14.dp,
                    bottomStart = 14.dp,
                    bottomEnd = 14.dp
                )

            ) {
                Text(
                    text = "Войти",
                )
            }
        }


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 40.dp, top = 40.dp, end = 40.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Spacer(modifier = Modifier
                .weight(1f)
                .height(1.dp)
                .background(Color.Gray)

            )
            Text(
                modifier = Modifier.padding(start = 10.dp, end = 10.dp),
                text = "или",
                color = Color(0xFFb9bdbd)
            )
            Spacer(modifier = Modifier
                .weight(1f)
                .height(1.dp)
                .background(Color.Gray))
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 40.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Button(
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 20.dp, end = 20.dp),
                onClick = {

                },
                colors = ButtonDefaults.buttonColors(containerColor = OurGreen),
                shape = RoundedCornerShape(10.dp)
            ) {
                Icon(
                    modifier = Modifier.size(20.dp),
                    painter = painterResource(id = R.drawable.icon_vk),
                    contentDescription = null
                )

                Spacer(
                    modifier = Modifier
                        .size(ButtonDefaults.ButtonWithIconContentPadding.calculateTopPadding()))
                Text(text = "ВКонтакте")
            }

            Button(
                modifier = Modifier
                    .padding(start = 20.dp, end = 20.dp)
                    .weight(1f),
                colors = ButtonDefaults.buttonColors(containerColor = OurGreen),
                onClick = {

                },
                shape = RoundedCornerShape(10.dp)
            ) {
                Icon(
                    modifier = Modifier.size(20.dp),
                    painter = painterResource(id = R.drawable.icon_google),
                    contentDescription = null
                )

                Spacer(
                    modifier = Modifier
                        .size(ButtonDefaults.ButtonWithIconContentPadding.calculateTopPadding()))
                Text(text = "Google")
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 35.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Нет аккаунта?",
                color = OurGreen,
                fontSize = 14.sp
            )

            Text(
                modifier = Modifier.clickable {
//                    navController.navigate(Screen.Regist.route)
                },
                text = " Зарегестрируйтесь",
                color = OurGreen,
                fontWeight = FontWeight.Bold,
                fontSize = 14.sp,
                fontStyle = FontStyle.Italic
            )
        }
    }

}
