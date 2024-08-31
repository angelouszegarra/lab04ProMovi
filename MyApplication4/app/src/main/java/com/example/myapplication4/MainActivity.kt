package com.example.myapplication4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
<<<<<<< HEAD
<<<<<<< HEAD
import androidx.compose.foundation.background
=======
>>>>>>> 5ea267412077058a23bac47996a0ae439e394280
=======
>>>>>>> Upgrading_component_1
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
<<<<<<< HEAD
<<<<<<< HEAD
import androidx.compose.foundation.layout.height
=======
>>>>>>> 5ea267412077058a23bac47996a0ae439e394280
=======
import androidx.compose.foundation.layout.height
>>>>>>> Upgrading_component_1
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
<<<<<<< HEAD
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
=======
>>>>>>> Upgrading_component_1
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication4.ui.theme.MyApplication4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplication4Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ViewHolaCurso(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
<<<<<<< HEAD
fun ViewHolaCurso(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Welcome to the Course!",
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.Bold,
            color = Color.Blue
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Hello, Student!",
            style = MaterialTheme.typography.bodyLarge,
            color = Color.Gray
        )
        Spacer(modifier = Modifier.height(16.dp))
        TextField(
            value = "",
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .background(Color.LightGray),
            textStyle = TextStyle(
                fontSize = 18.sp,
                color = Color.Black
            ),
            placeholder = {
                Text(
                    text = "Escribe algo aquí",
                    color = Color.Gray
                )
            }
        )
    }
}

=======
>>>>>>> Upgrading_component_1
fun ViewHolaCurso() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Welcome to the Course!",
            fontSize = 28.sp,
<<<<<<< HEAD
            fontWeight = FontWeight.Bold
=======
            fontWeight = FontWeight.Bold,
            color = Color.Blue // Cambia el color del texto
>>>>>>> Upgrading_component_1
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Hello, Student!",
<<<<<<< HEAD
            fontSize = 20.sp
=======
            fontSize = 20.sp,
            color = Color.Gray // Cambia el color del texto
>>>>>>> Upgrading_component_1
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ViewHolaCursoPreview() {
    MyApplication4Theme {
        ViewHolaCurso()
    }
}