package com.hackton.darmarket.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.compose.rememberNavController
import com.hackton.darmarket.ui.composable.MainScreen
import com.hackton.darmarket.vm.MainActivityViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainScreen()
        }
    }


}
