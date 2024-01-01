package ir.rsum.navigation

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.router.stack.StackNavigation
import com.arkivanov.decompose.router.stack.childStack
import com.arkivanov.decompose.router.stack.pop
import com.arkivanov.decompose.router.stack.popTo
import com.arkivanov.decompose.router.stack.push
import com.arkivanov.decompose.value.Value
import ir.rsum.core.navigation.RootComponent
import ir.rsum.home.HomeComponent
import ir.rsum.intro.IntroComponent
import kotlinx.serialization.Serializable

class AppRootComponent(
    componentContext: ComponentContext,
) : RootComponent, ComponentContext by componentContext {

    private val navigation = StackNavigation<Config>()

    override val stack: Value<ChildStack<*, RootComponent.Child>> =
        childStack(
            serializer = Config.serializer(),
            handleBackButton = true,
            childFactory = ::child,
            initialConfiguration = Config.Intro,
            source = navigation
        )

    private fun child(
        config: Config,
        childComponentContext: ComponentContext
    ): Child =
        when (config) {
            Config.Home -> Child.Home(homeComponent(childComponentContext))
            Config.Intro -> Child.Intro(introComponent(childComponentContext))
        }

    private fun homeComponent(componentContext: ComponentContext): HomeComponent =
        HomeComponent(componentContext)

    private fun introComponent(componentContext: ComponentContext): IntroComponent =
        IntroComponent(
            componentContext,
            onBack = navigation::pop,
            onConfigurationComplete = { navigation.push(Config.Home) }
        )


    override fun onBackClicked(toIndex: Int) {
        navigation.popTo(index = toIndex)
    }

    sealed interface Child : RootComponent.Child {
        class Home(val component: HomeComponent) : Child
        class Intro(val component: IntroComponent) : Child
    }

    @Serializable
    private sealed class Config : RootComponent.Child {
        @Serializable
        data object Home : Config()

        @Serializable
        data object Intro : Config()
    }
}