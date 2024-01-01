package ir.rsum.intro

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.ClickableText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.unit.dp


@Composable
fun IntroContent(
    component: IntroComponent,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        ClickableText(
            AnnotatedString("Welcome to Resource Summery Application"),
            modifier = Modifier.padding(12.dp)
        ) {
            component.onConfigComplete()
        }
    }
}