// Top-level build file where you can add configuration options common to all sub-projects/modules.


buildscript {
    repositories {

        maven {
            url = uri("https://artifactory.productscience.app/releases")
        }
    }
    dependencies {
        classpath("com.productscience.transformer:transformer-plugin:0.18.4")
        classpath("com.productscience.transformer:transformer-instrumentation:0.18.4")
    }
}
plugins {
    id("com.android.application") version "8.2.0" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
}