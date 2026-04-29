package cm.horion.financeapp.activities.dashboardActivity.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import cm.horion.financeapp.activities.dashboardActivity.components.ActionButtonRow
import cm.horion.financeapp.activities.dashboardActivity.components.CardSection
import cm.horion.financeapp.activities.dashboardActivity.components.HeaderSection
import cm.horion.financeapp.domain.ExpenseDomain




@Composable
fun MainScreen(
    modifier: Modifier = Modifier,
    onCardClick: () -> Unit = {},
    expenses: List<ExpenseDomain>
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ){
        LazyColumn(
            modifier = Modifier
            .fillMaxWidth()
                .padding(bottom = 70.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ){
            item { HeaderSection() }
            item { CardSection(onclick = onCardClick) }
            item { ActionButtonRow() }

        }
    }

}


@Composable
@Preview()
fun MainScreenPreview() {

    val expenses = listOf(
        ExpenseDomain("Restaurant", 1000.0, "img1", "17 jun 2025 19:15"),
        ExpenseDomain("McDonald",73.12,"img2","11 jun 2025 19:30"),
        ExpenseDomain("Cinema",23.47,"img3","17 mars 2025 19:15"),
        ExpenseDomain("Restaurant",573.12,"img4","20 avril 2025 21:15")
    )
    MainScreen(expenses= expenses)
}