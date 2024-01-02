enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "RSum"
include(":androidApp")
include(":common")
include(":core:settings")
include(":core:navigation")
include(":features:home")
include(":features:intro")
