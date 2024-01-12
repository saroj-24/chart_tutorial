// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.2.1" apply false
}
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
       classpath("com.android.tools.build:gradle:7.0.2")
    }
}
