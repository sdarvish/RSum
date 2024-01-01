import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.Children
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.slide
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.stackAnimation
import ir.rsum.core.navigation.RootComponent
import ir.rsum.home.HomeContent
import ir.rsum.intro.IntroContent
import ir.rsum.navigation.AppRootComponent
import ir.rsum.navigation.AppRootComponent.Child.Home

@Composable
fun App(
    rootComponent: RootComponent
) {
    MaterialTheme {
        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Children(
                stack = rootComponent.stack,
                modifier = Modifier.fillMaxSize(),
                animation = stackAnimation(slide())
            ) {
                when (val instance = it.instance) {
                    is Home -> HomeContent(instance.component)
                    is AppRootComponent.Child.Intro -> IntroContent(instance.component)
                }
            }
        }
    }
}
