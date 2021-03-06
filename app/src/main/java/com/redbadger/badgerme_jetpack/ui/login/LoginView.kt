package com.redbadger.badgerme_jetpack.ui.login

import android.app.Activity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInClient
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.redbadger.badgerme_jetpack.R
import com.redbadger.badgerme_jetpack.ui.theme.BadgerMe_JetpackTheme

@Composable
fun LoginView() {
    Box {
        Column (modifier = Modifier
            .fillMaxSize()
            .padding(top = 30.dp)) {
            Title()
        }
        Column (modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center) {
            Icons()
        }
        Column (modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 30.dp), verticalArrangement = Arrangement.Bottom) {
            SignInButton()
        }
    }
}

@Composable
fun Title() {
    Row (modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center){
        Box {
            Image(
                painter = painterResource(id = R.drawable.orange_box),
                contentDescription = "Title flair",
                modifier = Modifier.padding(start = 195.dp).size(90.dp)
            )
            Text(
                text = "Badger Me",
                color = MaterialTheme.colors.onBackground,
                style = MaterialTheme.typography.h2,
                textAlign = TextAlign.Center
            )
        }
    }

}

@Composable
fun Icons() {
    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Column{
                Image(
                    painter = painterResource(id = R.drawable.activity_food),
                    contentDescription = "food",
                    modifier = Modifier
                        .size(120.dp)
                        .padding(4.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.activity_drinks),
                    contentDescription = "food",
                    modifier = Modifier
                        .size(120.dp)
                        .padding(4.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.type_badger),
                    contentDescription = "food",
                    modifier = Modifier
                        .size(120.dp)
                        .padding(4.dp)
                )
            }
            Column {
                Image(
                    painter = painterResource(id = R.drawable.activity_walking),
                    contentDescription = "food",
                    modifier = Modifier
                        .size(120.dp)
                        .padding(4.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.activity_hugs),
                    contentDescription = "food",
                    modifier = Modifier
                        .size(120.dp)
                        .padding(4.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.activity_chats),
                    contentDescription = "food",
                    modifier = Modifier
                        .size(120.dp)
                        .padding(4.dp)
                )
            }
        }
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(start = 60.dp, end = 60.dp, top = 20.dp),
        horizontalArrangement = Arrangement.Center) {
        Text(
            text = "BadgerMe lets you create and join events with other Badgers.",
            color = MaterialTheme.colors.onBackground,
            style = MaterialTheme.typography.body1,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun SignInButton() {
    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
        Button(
            shape = RoundedCornerShape(size = 60.dp),
            onClick = { /*TODO*/ },
            modifier = Modifier
                .wrapContentHeight()
                .fillMaxWidth()
                .padding(14.dp)
        ) {
            Text(
                text = "Sign in with Google",
                modifier = Modifier.padding(vertical = 10.dp)
            )
        }
    }
}

private fun getGoogleLoginAuth(activity: Activity): GoogleSignInClient {
    val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
        .requestEmail()
        .requestId()
        .requestProfile()
        .build()
    return GoogleSignIn.getClient(activity, gso)
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    BadgerMe_JetpackTheme {
        LoginView()
    }
}