package com.example.recipe

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.room.Room
import com.example.recipe.database.RecipeDatabase
import com.example.recipe.database.RecipeViewModel
import com.example.recipe.ui.theme.RecipeTheme
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class MainActivity : ComponentActivity() {

    private val db by lazy {
        Room.databaseBuilder(
            applicationContext,
            RecipeDatabase::class.java,
            "recipess.db"
        ).createFromAsset("database/recipes.db").build()
    }
    private val viewModel by viewModels<RecipeViewModel>(
        factoryProducer = {
            object : ViewModelProvider.Factory {
                override fun <T : ViewModel> create(modelClass: Class<T>): T {
                    return RecipeViewModel(db.dao) as T
                }
            }
        }
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread.sleep(3000)
        installSplashScreen()
        setContent {
            RecipeTheme {
                MyApp{
                    startActivity(ProfileActivity.newIntent(this, it))
                }
                //val state by viewModel.state.collectAsState()
                //RecipeScreen(state = state, onEvent = viewModel::onEvent)
            }
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyApp(navigateToProfile: (Recipe) -> Unit){
    Scaffold(
        content = {
            RecipeHomeContent(navigateToProfile = navigateToProfile)
        }
    )
}
