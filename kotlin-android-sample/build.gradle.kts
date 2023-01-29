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
  sourcePath {
    srcJar = "$rootDir/proto/build/libs/proto.jar"
  }

  kotlin {
    android = true
    javaInterop = true
  }
}

dependencies {
  implementation("androidx.core:core-ktx:1.9.0")
  api("com.squareup.wire:wire-runtime:4.4.3")
  implementation("androidx.appcompat:appcompat:1.6.0")
  testImplementation("junit:junit:4.13.2")
  androidTestImplementation("androidx.test.ext:junit:1.1.5")
  androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}
