package ir.rsum.intro

import com.arkivanov.decompose.ComponentContext

class IntroComponent(
    componentContext: ComponentContext,
    val onConfigurationComplete: () -> Unit,
    val onBack: () -> Unit
) : ComponentContext by componentContext {
    fun onBack() {
        onBack.invoke()
    }

    fun onConfigComplete() {
        onConfigurationComplete()
    }
}