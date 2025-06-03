
// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript{
    dependencies{
       //classpath("com.google.dagger:hilt-android-gradle-plugin:2.44")
    }
}

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.ksp) apply false
    //alias(libs.plugins.android.application) apply false
    //alias(libs.plugins.kotlin.android) apply false
    //alias(libs.plugins.ksp) apply false
    alias(libs.plugins.hilt) apply false
    alias(libs.plugins.jetbrainsKotlinSerialization) apply false
}