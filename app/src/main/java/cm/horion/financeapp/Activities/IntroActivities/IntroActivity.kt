package cm.horion.financeapp.Activities.IntroActivities

import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier

import cm.horion.financeapp.Activities.IntroActivities.Screens.IntroScreen
import cm.horion.financeapp.MainActivity

class IntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Scaffold { innerPadding ->
                IntroScreen(
                    modifier = Modifier.padding(innerPadding),
                    onStartClick = {
                        startActivity(Intent(this, MainActivity::class.java))
                    }
                )
            }
        }
    }
}