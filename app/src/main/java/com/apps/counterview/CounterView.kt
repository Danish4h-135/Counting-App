package com.apps.counterview

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CounterView(viewModel: CounterViewModel){



    Column (modifier = Modifier
        .fillMaxSize()
        .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center){
        Text(text = "Count: ${viewModel.count.value}",
            fontSize = 30.sp,
             fontWeight = FontWeight.Bold

        )
        Spacer(modifier = Modifier.height(16.dp))
        Row(modifier = Modifier
            .padding(8.dp)
            .width(250.dp),
            horizontalArrangement = Arrangement.SpaceBetween) {
            Button(onClick = {
                viewModel.increment()
            }) {
                Text(text = "Increment")
            }

            Button(onClick = {
                viewModel.decrement()
            }) {
                Text(text = "Decrement")
            }
        }
    }
}



