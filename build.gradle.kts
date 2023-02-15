buildscript {
    repositories {
        google()
        mavenCentral()

        // Android Build Server
        // maven { url = uri("../nowinandroid-prebuilts/m2repository") }
    }

}

plugins {
    id("org.jetbrains.kotlin.jvm") version "1.8.10"
}
