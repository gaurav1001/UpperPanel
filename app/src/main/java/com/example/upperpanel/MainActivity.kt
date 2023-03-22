package com.example.upperpanel

import android.inputmethodservice.Keyboard
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.upperpanel.ui.theme.UpperPanelTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
               UpperPanel()
             }
        }


    @Composable
    fun UpperPanel(){
        Column(
            Modifier
                .background(Color(0xFF495E57))
                .fillMaxWidth()) {
            Text(text = "Little Lemon",
                fontSize = 32.sp,
                color = Color.Yellow,
                modifier = Modifier.padding(start = 20.dp, top = 20.dp)
            )
            Text(text = "Chicago",
                fontSize = 24.sp,
                color = Color.White,
                modifier = Modifier.padding(start = 20.dp)
            )

            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(20.dp), horizontalArrangement = Arrangement.Start) {

                Text(text = "We are family owned meddetraian restrurant,focused on traditional recipes served with a modern twist",
                      modifier = Modifier.width(200.dp),
                      fontSize = 20.sp,
                      color = Color.White
                    )

                Image(painter = painterResource(id = R.drawable.gourmet),
                    contentDescription ="",
                    Modifier.height(200.dp)
                        .clip(RoundedCornerShape(20.dp)),
                )

            }

            Button(onClick = { /*TODO*/ },
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Yellow),
                modifier = Modifier.padding(horizontal = 20.dp)
            ) {
                Text(text = "Order")
            }

        }


    }

    @Preview
    @Composable
    fun UpperPanelPreview(){
      UpperPanel()
    }

}
