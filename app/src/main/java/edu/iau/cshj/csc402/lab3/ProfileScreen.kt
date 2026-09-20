package edu.iau.cshj.csc402.lab3

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import edu.iau.cshj.csc402.lab3.ui.theme.CSC402Lab3Theme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen(
    modifier: Modifier = Modifier
) {
    val students = listOf(
        Student(
            name = "Aryam Hadi",
            program = "Computer Science",
            gpa = "3.0",
            email = "aryam@example.com",
            city = "Dammam"
        ),
        Student(
            name = "Sara Ahmed",
            program = "Computer Science",
            gpa = "4.2",
            email = "sara@example.com",
            city = "Khobar"
        ),
        Student(
            name = "Noura Ali",
            program = "Information Systems",
            gpa = "4.5",
            email = "noura@example.com",
            city = "Dammam"
        ),
        Student(
            name = "Lama Khalid",
            program = "Computer Science",
            gpa = "3.8",
            email = "lama@example.com",
            city = "Dhahran"
        ),
        Student(
            name = "Reem Saad",
            program = "Software Engineering",
            gpa = "4.0",
            email = "reem@example.com",
            city = "Jubail"
        )
    )

    Scaffold(
        modifier = modifier,
        topBar = {
            TopAppBar(
                title = {
                    Text("My Profile")
                }
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { }
            ) {
                Icon(
                    imageVector = Icons.Default.Edit,
                    contentDescription = "Edit profile"
                )
            }
        }
    ) { innerPadding ->

        LazyColumn(
            modifier = Modifier.padding(innerPadding),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {

            item {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text("Students")

                    Text("${students.size} students")
                }
            }

            items(students) { student ->
                StudentCard(
                    student = student
                )
            }
        }
    }
}

@Preview(
    name = "Light",
    showBackground = true
)
@Composable
private fun ProfileScreenLightPreview() {
    CSC402Lab3Theme {
        ProfileScreen()
    }
}

@Preview(
    name = "Dark",
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES
)
@Composable
private fun ProfileScreenDarkPreview() {
    CSC402Lab3Theme {
        ProfileScreen()
    }
}