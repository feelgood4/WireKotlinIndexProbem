plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("com.squareup.wire")
}

android {
    compileSdk = 33

    defaultConfig {
        minSdk = 24
        targetSdk = 33
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

wire {
//    sourcePath {
////        if (File("$rootDir/proto/build/libs/proto.jar").exists())
////            srcJar = "$rootDir/proto/build/libs/proto.jar"
//    }

    kotlin {
        android = true
        javaInterop = true
    }
}

dependencies {
//  protoPath(project(":proto"))
    implementation(project(":proto"))
    api("com.squareup.wire:wire-runtime:4.4.3")
    implementation("androidx.appcompat:appcompat:1.6.0")
}
