buildscript {
    repositories {
        google()
        mavenCentral()

        // Android Build Server
        // maven { url = uri("../nowinandroid-prebuilts/m2repository") }
    }

}

plugins {
    alias(libs.plugins.kotlin.jvm) apply false
}
