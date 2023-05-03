package com.example.cadastroendereco

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cadastroendereco.ui.theme.CadastroEnderecoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CadastroEnderecoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(120, 160, 87 )
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {

    var CEPstate by remember {
        mutableStateOf("")
    }

    var Cidadestate by remember {
        mutableStateOf("")
    }

    var Estadostate by remember {
        mutableStateOf("")
    }

    var Logradourostate by remember {
        mutableStateOf("")
    }

    var Numerostate by remember {
        mutableStateOf("")
    }

    var Complementostate by remember {
        mutableStateOf("")
    }

    var NomeLocalstate by remember {
        mutableStateOf("")
    }


    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
        //.background(color = Color(120, 160, 87 ))

    ) {

        Text(
            text = stringResource(id = R.string.primeiro),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp),
            fontSize = 18.sp,
            fontWeight = FontWeight.ExtraBold,
            textAlign = TextAlign.Center,
            color = Color.White
        )

        Text(
            text = stringResource(id = R.string.segundo),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 1.dp, bottom = 1.dp),
            fontSize = 14.sp,
            fontWeight = FontWeight.ExtraBold,
            textAlign = TextAlign.Center,
            color = Color.Black
        )



        OutlinedTextField(
            value = CEPstate,
            onValueChange = { CEPstate = it },
            modifier = Modifier
                .fillMaxWidth(),
            shape = RoundedCornerShape(20.dp),
            colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.White),
            label = {
                Text(text = "CEP")

            }
        )

        Row {


            OutlinedTextField(
                value = Cidadestate,
                onValueChange = { Cidadestate = it },
                modifier = Modifier.width(170.dp),
                //.padding(start = 8.dp),
                shape = RoundedCornerShape(20.dp),
                singleLine = true,
                colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.White),
                label = {
                    Text(text = "Cidade")
                }

            )

            Spacer(modifier = Modifier.width(7.dp))


            OutlinedTextField(
                value = Estadostate,
                onValueChange = { Estadostate = it },
                modifier = Modifier.width(180.dp),
                //.padding(start = 10.dp),
                shape = RoundedCornerShape(20.dp),
                colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.White),
                label = {
                    Text(text = "Estado")
                }
            )
        }

        Row {


            OutlinedTextField(
                value = Numerostate,
                onValueChange = { Numerostate = it },
                modifier = Modifier.width(170.dp),
                //.padding(start = 8.dp),
                shape = RoundedCornerShape(20.dp),
                singleLine = true,
                colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.White),
                label = {
                    Text(text = "Número")
                }

            )

            Spacer(modifier = Modifier.width(7.dp))

            OutlinedTextField(
                value = Logradourostate,
                onValueChange = { Logradourostate = it },
                modifier = Modifier.width(180.dp),
                //.padding(start = 10.dp),
                shape = RoundedCornerShape(20.dp),
                colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.White),
                label = {
                    Text(text = "Logradouro")
                }
            )


        }

        OutlinedTextField(
            value = Complementostate,
            onValueChange = { Complementostate = it },
            modifier = Modifier
                .fillMaxWidth(),
            shape = RoundedCornerShape(20.dp),
            colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.White),
            label = {
                Text(text = "Complemento")

            }
        )

        OutlinedTextField(
            value = NomeLocalstate,
            onValueChange = {  NomeLocalstate = it },
            modifier = Modifier
                .fillMaxWidth(),
            shape = RoundedCornerShape(20.dp),
            colors = TextFieldDefaults.textFieldColors(backgroundColor = Color.White),
            label = {
                Text(text = "Nomear Local")

            }
        )



        Button(onClick = { /*TODO*/ }, modifier = Modifier
            .fillMaxWidth()
            .padding(top = 7.dp, start = 30.dp, end = 30.dp),
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(107, 177, 115))
        ) {
            Text(text = "Cadastar",
                color = Color.White,
                //fontsize = 18.sp,
                fontWeight = FontWeight.ExtraBold
            )
        }


        Image(painter = painterResource(id = R.drawable.foto),
            contentDescription = stringResource(id = R.string.foto_tela),
            modifier =    Modifier.align(CenterHorizontally)
        )

//        Image(
//            painter = painterResource(id = R.drawable.foto),
//            contentDescription = stringResource(id = R.string.foto_tela),
//            modifier = Modifier.align(CenterHorizontally)
//        )



    }
}





@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CadastroEnderecoTheme {
        Greeting("Android")
    }
}