package ir.rsum

import App
import androidx.compose.ui.window.ComposeUIViewController
import ir.rsum.core.navigation.RootComponent

fun MainViewController(root: RootComponent) = ComposeUIViewController {
    App(root)
}
