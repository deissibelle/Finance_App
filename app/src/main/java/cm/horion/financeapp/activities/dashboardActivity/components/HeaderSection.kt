package cm.horion.financeapp.activities.dashboardActivity.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import cm.horion.financeapp.R

@Composable
@Preview()
fun HeaderSection(modifier: Modifier = Modifier) {
     Row(
         modifier = Modifier
             .fillMaxWidth()
             .padding(start = 16.dp, end = 16.dp, top = 48.dp, bottom = 16.dp),
         horizontalArrangement = Arrangement.SpaceBetween,
         verticalAlignment = Alignment.CenterVertically
     ){
       Column{

           Text(
               text = "Hello Sibelle Djumeghe ",
               color = colorResource(R.color.darkBlue),
           )

           Text(
               text = "deissibelle@gmail.com",
               color = colorResource(R.color.darkBlue),
           )
       }
         Image(
             painter = painterResource(R.drawable.men),
             contentDescription = null,
             modifier = Modifier.size(50.dp)
         )


     }

}