buildscript {
    repositories {
        google()
        mavenCentral()

        // Android Build Server
        // maven { url = uri("../nowinandroid-prebuilts/m2repository") }
    }

}

plugins {
    id("com.android.application") version "7.3.0" apply false
    id("com.android.library") version "7.3.0" apply false
    id("org.jetbrains.kotlin.jvm") version "1.7.10"
}
