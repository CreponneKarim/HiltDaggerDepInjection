package com.example.hiltdaggerdepinjection

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.hiltdaggerdepinjection.ui.theme.HiltDaggerDepInjectionTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HiltDaggerDepInjectionTheme {
                val viewmodel = hiltViewModel<MyViewModel>()
            }
        }
    }
}