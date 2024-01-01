package ir.rsum.core.navigation

import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.value.Value

interface RootComponent {

    val stack: Value<ChildStack<*, Child>>

    fun onBackClicked(toIndex: Int)

    interface Child
}