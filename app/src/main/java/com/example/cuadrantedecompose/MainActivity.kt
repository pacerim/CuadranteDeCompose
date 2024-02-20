package com.example.cuadrantedecompose

import androidx.compose.ui.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cuadrantedecompose.ui.theme.CuadranteDeComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CuadranteDeComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CuadrantesComposeApp()
                }
            }
        }
    }
}

@Composable
fun CuadrantesComposeApp() {

    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            Cuadrante(
                header = stringResource(R.string.header1),
                description = stringResource(R.string.text1),
                backgroundColor = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            Cuadrante(
                header = stringResource(R.string.header2),
                description = stringResource(R.string.text2),
                backgroundColor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            Cuadrante(
                header = stringResource(R.string.header3),
                description = stringResource(R.string.text3),
                backgroundColor = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            Cuadrante(
                header = stringResource(R.string.header4),
                description = stringResource(R.string.text4),
                backgroundColor = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
    
}

@Composable
private fun Cuadrante(
    header : String,
    description : String,
    backgroundColor : Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .background(backgroundColor)
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = header,
            textAlign = TextAlign.Justify,
            fontWeight = FontWeight.Bold
            )
        Text(
            text = description,
            textAlign = TextAlign.Justify
            )
    }


}

@Preview(showBackground = true)
@Composable
fun ComposeQuadrantAppPreview() {
    CuadranteDeComposeTheme {
        CuadrantesComposeApp()
    }
}