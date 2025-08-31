package com.example.kotlinnotes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.kotlinnotes.ui.theme.KotlinNotesTheme
import dagger.hilt.android.AndroidEntryPoint


// Dagger-Hilt for Dependency Injection
// Dagger-Hilt is a dependency injection library from google for Android that reduces the boilerplate of doing manual dependency injection in your project.
@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // This is dependency injection because we are injecting the dependency of Test class into MainActivity class, Test class depends on this name parameter.
        // val test = Test("Prakash")
        setContent {
            KotlinNotesTheme {
                val viewModel = hiltViewModel<MyViewModel>()
            }
        }
    }
}


//class Test(val name: String){
//    fun printName(){
//        println("Name: $name")
//    }
//}
