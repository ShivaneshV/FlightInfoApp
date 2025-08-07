package com.example.flightinfoapp.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.shape.RoundedCornerShape
import com.example.flightinfoapp.ui.theme.FlightInfoAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            FlightInfoAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        modifier = Modifier
                            .padding(16.dp)
                            .verticalScroll(rememberScrollState()),
                        verticalArrangement = Arrangement.spacedBy(16.dp)
                    ) {
                        FlightCard("AI 302")
                        DepartureCard("DEL", "08:00 AM")
                        ArrivalCard("LHR", "12:30 PM")
                    }
                }
            }
        }
    }
}

@Composable
fun FlightCard(flightNumber: String) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = "Flight Info", style = MaterialTheme.typography.headlineSmall)
            Text(text = "Flight Number: $flightNumber", style = MaterialTheme.typography.bodyLarge)
        }
    }
}

@Composable
fun DepartureCard(airportCode: String, time: String) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = "Departure", style = MaterialTheme.typography.headlineSmall)
            Text(text = "Airport: $airportCode", style = MaterialTheme.typography.bodyLarge)
            Text(text = "Time: $time", style = MaterialTheme.typography.bodyLarge)
        }
    }
}

@Composable
fun ArrivalCard(airportCode: String, time: String) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = "Arrival", style = MaterialTheme.typography.headlineSmall)
            Text(text = "Airport: $airportCode", style = MaterialTheme.typography.bodyLarge)
            Text(text = "Time: $time", style = MaterialTheme.typography.bodyLarge)
        }
    }
}
