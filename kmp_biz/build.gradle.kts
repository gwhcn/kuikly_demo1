plugins {
    kotlin("multiplatform")
    id("com.android.library")
}

kotlin {

    androidTarget {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
        publishLibraryVariants("release")
    }

    iosX64()
    iosArm64()
    iosSimulatorArm64()

    sourceSets {
        val commonMain by getting {
            dependencies {

            }
        }

        val androidMain by getting {
            dependencies {

            }
        }

        val iosX64Main by getting
        val iosArm64Main by getting
        val iosSimulatorArm64Main by getting
        val iosMain by creating {
            dependsOn(commonMain)
            iosX64Main.dependsOn(this)
            iosArm64Main.dependsOn(this)
            iosSimulatorArm64Main.dependsOn(this)
        }

    }
}

android {
    namespace = "com.test.kmp_biz"
    compileSdk = 34
    defaultConfig {
        minSdk = 21
        targetSdk = 30
    }
//    sourceSets {
//        named("main") {
//            assets.srcDirs("src/commonMain/assets")
//        }
//    }
}

//ksp {
//    arg("moduleId", getPageName())        // 标识模块Id
//    arg("isMainModule", "false")      // 是否是主模块
//    arg("enableMultiModule","true")   // 启用多模块
//}

val KEY_PAGE_NAME = "pageName"

fun getPageName(): String {
    return (project.properties[KEY_PAGE_NAME] as? String) ?: ""
}

fun getCommonCompilerArgs(): List<String> {
    return listOf(
        "-Xallocator=std"
    )
}

fun getLinkerArgs(): List<String> {
    return listOf()
}