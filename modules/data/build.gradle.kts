plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
}

kotlin {
    androidTarget {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }

    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach {
        it.binaries.framework {
            baseName = "data"
            isStatic = true
        }
    }

    sourceSets {
        commonMain.dependencies {
            //put your multiplatform dependencies here
            implementation(projects.modules.domain)

            //put your multiplatform dependencies here
            implementation(libs.koin.core)
            implementation(libs.settings)
        }
        commonTest.dependencies {
            implementation(libs.kotlin.test)
            implementation(libs.settings.test)
        }
    }
}

android {
    namespace = "ir.rsum.domain"
    compileSdk = 34
    defaultConfig {
        minSdk = 24
    }
}
