plugins {
    id("java-library")
    id("org.jetbrains.kotlin.jvm")
    id("com.squareup.wire")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

wire {
    sourcePath {
        srcJar = "$rootDir/proto/build/libs/proto.jar"
    }

    kotlin {

    }
}

dependencies {
    protoPath(project(":proto"))
    implementation(project(":proto"))
    api("com.squareup.wire:wire-runtime:4.4.3")
}
