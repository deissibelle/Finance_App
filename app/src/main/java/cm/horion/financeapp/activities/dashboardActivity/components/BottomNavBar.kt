package cm.horion.financeapp.activities.dashboardActivity.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import cm.horion.financeapp.R

@Composable
fun BottomNavBar(onItemSelected: (Int) -> Unit, modifier: Modifier ) {
    NavigationBar(modifier = modifier
        .fillMaxWidth()
        .height(height = 80.dp)) {
        NavigationBarItem(
            selected = true,
            onClick = { onItemSelected(R.id.wallet) },
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.wallet),
                    contentDescription = null
                )

            },
            label = {Text ("Home")}
        )
        NavigationBarItem(
            selected = true,
            onClick = { onItemSelected(R.id.market) },
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.market),
                    contentDescription = null
                )

            },
            label = {Text ("Market")}
        )
        NavigationBarItem(
            selected = true,
            onClick = { onItemSelected(R.id.trade) },
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.trade),
                    contentDescription = null
                )

            },
            label = {Text ("Trade")}
        )
        NavigationBarItem(
            selected = true,
            onClick = { onItemSelected(R.id.futures) },
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.futures),
                    contentDescription = null
                )

            },
            label = {Text ("Futures")}
        )
        NavigationBarItem(
            selected = true,
            onClick = { onItemSelected(R.id.profile) },
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.profile),
                    contentDescription = null
                )

            },
            label = {Text ("Profile")}
        )
    }
    }

