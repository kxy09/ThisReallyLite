plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.devtools.ksp") version "1.8.20-1.0.10"
}

android {
    namespace = "me.zhenxin.thisreallylite"
    compileSdk = 33

    defaultConfig {
        applicationId = "me.zhenxin.thisreallylite"
        minSdk = 21
        targetSdk = 33
        versionCode = 20230814
        versionName = "1.3.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = true
            setProguardFiles(
                listOf(
                    getDefaultProguardFile("proguard-android-optimize.txt"),
                    "proguard-rules.pro"
                )
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
    implementation("com.highcapable.yukihookapi:api:1.1.11")
    compileOnly("de.robv.android.xposed:api:82")
    ksp("com.highcapable.yukihookapi:ksp-xposed:1.1.11")

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("androidx.preference:preference:1.2.0")
    implementation("com.google.android.material:material:1.8.0")
}