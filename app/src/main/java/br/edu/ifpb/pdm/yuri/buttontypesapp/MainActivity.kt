package br.edu.ifpb.pdm.yuri.buttontypesapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.edu.ifpb.pdm.yuri.buttontypesapp.ui.theme.ButtonTypesAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ButtonTypesAppTheme {
                // Função que exibe os botões
                ButtonExamples()
            }
        }
    }
}

@Composable
fun ButtonExamples() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Botão preenchido com cor personalizada
        Button(onClick = { /* Ação */ }, colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF6200EA))) {
            Text("Filled Button", color = Color.White)
        }

        // Botão tonal preenchido com cor personalizada
        FilledTonalButton(onClick = { /* Ação */ }, colors = ButtonDefaults.filledTonalButtonColors(containerColor = Color(0xFFBB86FC))) {
            Text("Tonal Button", color = Color.Black)
        }

        // Botão contornado com borda customizada
        OutlinedButton(onClick = { /* Ação */ }, colors = ButtonDefaults.outlinedButtonColors(contentColor = Color(0xFF018786))) {
            Text("Outlined Button")
        }

        // Botão elevado com cor e sombra personalizada
        ElevatedButton(onClick = { /* Ação */ }, colors = ButtonDefaults.elevatedButtonColors(containerColor = Color(0xFF03DAC5))) {
            Text("Elevated Button")
        }

        // Botão de texto com cor personalizada
        TextButton(onClick = { /* Ação */ }, colors = ButtonDefaults.textButtonColors(contentColor = Color(0xFFBB86FC))) {
            Text("Text Button")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewButtonExamples() {
    ButtonTypesAppTheme {
        ButtonExamples()
    }
}
