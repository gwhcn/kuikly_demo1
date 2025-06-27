plugins {
    //trick: for the same plugin versions in all sub-modules
    id("com.android.application").version("7.4.2").apply(false)
    id("com.android.library").version("7.4.2").apply(false)
    kotlin("android").version("1.9.21").apply(false)
    kotlin("multiplatform").version("1.9.21").apply(false)
    id("com.google.devtools.ksp").version("1.9.21-1.0.16").apply(false)
    id("org.jetbrains.compose").version("1.7.3").apply(false)
}