package com.example.testejogoimagens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.testejogoimagens.ui.theme.TesteJogoImagensTheme
import java.lang.Math.random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TesteJogoImagensTheme {
                TesteJogoImagens(modifier = Modifier
                    .fillMaxSize()
                    .safeDrawingPadding())

                }
            }
        }
    }


@Composable
fun TesteJogoImagens(modifier: Modifier = Modifier) {
    var result by remember{ mutableStateOf(1)}
    var imagemResult = when(result){
        1 -> R.drawable.b1
        2 -> R.drawable.c2
        3 -> R.drawable.s3
        4 -> R.drawable.t4
        5 -> R.drawable.c5
        6 -> R.drawable.c6
        7 -> R.drawable.t7
        8 -> R.drawable.m8
        else ->R.drawable.t9
    }
    Column(
        modifier = Modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(painter = painterResource(imagemResult)
            , contentDescription = "Pokémon")

        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = { result = (1..9).random() }) {
            Text(text = "Rolar")
        }
    }
    
    
}


