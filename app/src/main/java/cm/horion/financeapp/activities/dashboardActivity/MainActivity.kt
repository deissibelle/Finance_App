package cm.horion.financeapp.activities.dashboardActivity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import cm.horion.financeapp.activities.dashboardActivity.screens.MainScreen
import cm.horion.financeapp.ui.theme.Finance_AppTheme
import cm.horion.financeapp.viewmodel.mainViewModel

class MainActivity : ComponentActivity() {
    private val mainViewModel: mainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent{
            Finance_AppTheme {
                MainScreen(
                    expenses = mainViewModel.loadData(), onCardClick = {

                    }
                )
            }

        }
    }
}