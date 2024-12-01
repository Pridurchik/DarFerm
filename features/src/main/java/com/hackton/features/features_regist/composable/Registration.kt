package com.hackton.features.features_regist.composable

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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
import com.hackton.features.features_auth.util.OurDarkGreen
import com.hackton.features.features_auth.util.OurGreen

@Preview(showBackground = true)
@Composable
fun Registration(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
    ) {

        var textFieldColorStatePayer by remember {
            mutableStateOf(false)
        }

        var textFieldColorStateSender by remember {
            mutableStateOf(false)
        }

        val textFieldStateEmail = remember {
            mutableStateOf("")
        }

        val textFieldStatePassword = remember {
            mutableStateOf("")
        }

        Row(
            modifier = Modifier
                .padding(top = 80.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                modifier = Modifier,
                text = "Создать учетную запись",
                fontSize = 29.sp,
                fontWeight = FontWeight(600),
                color = OurGreen
            )
        }

        Row(
            modifier = Modifier.padding(top = 50.dp)
        ) {
            Button(
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 20.dp, end = 10.dp),
                onClick = {
                    if (!(textFieldColorStatePayer && textFieldColorStateSender) || (textFieldColorStatePayer || textFieldColorStateSender)) {
                        textFieldColorStateSender = true
                        textFieldColorStatePayer = false
                    }
                },
                shape = RoundedCornerShape(14.dp),
                colors = ButtonDefaults
                    .buttonColors(containerColor = if (!textFieldColorStateSender) OurGreen else OurDarkGreen)
            ) {
                Text(
                    text = "Поставщик"
                )
            }

            Button(
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 10.dp, end = 20.dp),
                onClick = {
                    if (
                        !(textFieldColorStatePayer && textFieldColorStateSender) || (textFieldColorStatePayer || textFieldColorStateSender)
                    ) {
                        textFieldColorStatePayer = true
                        textFieldColorStateSender = false
                    }
                },
                shape = RoundedCornerShape(14.dp),
                colors = ButtonDefaults
                    .buttonColors(containerColor = if (!textFieldColorStatePayer) OurGreen else OurDarkGreen)
            ) {
                Text(
                    text = "Покупатель"
                )
            }
        }

        TextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp, top = 40.dp, bottom = 30.dp),
            value = textFieldStateEmail.value,
            onValueChange = { newText -> textFieldStateEmail.value = newText },
            label = {
                Text(text = "ФИО")
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
                .padding(start = 20.dp, end = 20.dp, bottom = 30.dp),
            value = textFieldStatePassword.value,
            onValueChange = { newText -> textFieldStatePassword.value = newText },
            label = {
                Text(text = "Номер телефона")
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
                .padding(start = 20.dp, end = 20.dp, bottom = 30.dp),
            value = textFieldStatePassword.value,
            onValueChange = { newText -> textFieldStatePassword.value = newText },
            label = {
                Text(text = "Номер телефона")
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
                text = "Зарегистрироваться",
            )
        }




        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 40.dp, top = 40.dp, end = 40.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Spacer(
                modifier = Modifier
                    .weight(1f)
                    .height(1.dp)
                    .background(Color.Gray)

            )
            Text(
                modifier = Modifier.padding(start = 10.dp, end = 10.dp),
                text = "или",
                color = Color(0xFFb9bdbd)
            )
            Spacer(
                modifier = Modifier
                    .weight(1f)
                    .height(1.dp)
                    .background(Color.Gray)
            )
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
                        .size(ButtonDefaults.ButtonWithIconContentPadding.calculateTopPadding())
                )
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
                        .size(ButtonDefaults.ButtonWithIconContentPadding.calculateTopPadding())
                )
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
                text = "Уже есть аккаунт?",
                color = OurGreen,
                fontSize = 14.sp
            )

            Text(
                modifier = Modifier.clickable {
//                    navController.navigate(Screen.Regist.route)
                },
                text = " Войти",
                color = OurGreen,
                fontWeight = FontWeight.Bold,
                fontSize = 14.sp,
                fontStyle = FontStyle.Italic
            )
        }

    }
}