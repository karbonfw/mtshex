plugins {
    java
    id("io.freefair.lombok") version "5.3.0"
    id("com.diffplug.spotless") version "5.10.0"
}

java {
    sourceCompatibility = JavaVersion.VERSION_14
    targetCompatibility = JavaVersion.VERSION_14
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

subprojects {
    plugins.withId("com.diffplug.spotless") {
        spotless {
            java {
                googleJavaFormat("1.8")
                removeUnusedImports()
                importOrder("karbonfw", "java", "javax", "org", "com", "lombok")
            }
        }
    }
}