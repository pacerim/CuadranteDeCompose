package com.example.cuadrantedecompose

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
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

    }
    Cuadrante(
        stringResource(R.string.header1),
        stringResource(R.string.text1),
        stringResource(R.string.header2),
        stringResource(R.string.text2),
        stringResource(R.string.header3),
        stringResource(R.string.text3),
        stringResource(R.string.header4),
        stringResource(R.string.text4))
}

@Composable
private fun Cuadrante(
    header : String,
    description : String,
    backgroundColor : Color,
    modifier: Modifier = Modifier
) {


}

@Preview(showBackground = true)
@Composable
fun ComposeQuadrantAppPreview() {
    CuadranteDeComposeTheme {
        CuadrantesComposeApp()
    }
}