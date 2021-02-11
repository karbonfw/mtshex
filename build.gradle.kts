plugins {
    java
    id("io.freefair.lombok") version "5.3.0"
    id("com.diffplug.spotless") version "5.10.0"
}

java {
    sourceCompatibility = JavaVersion.VERSION_14
    targetCompatibility = JavaVersion.VERSION_14
}

spotless {
    java {
        googleJavaFormat("1.8").aosp()
        removeUnusedImports()
    }
}


allprojects {
    group = "karbonfw.mtshex"
    version = "1.0.0-SNAPSHOT"

    tasks.withType<Test> {
        useJUnitPlatform()
    }
    repositories {
        mavenCentral()
        jcenter()
    }
}