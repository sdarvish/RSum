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
include(":modules:core")
include(":modules:domain")
include(":modules:data")
include(":modules:home")
include(":modules:intro")
