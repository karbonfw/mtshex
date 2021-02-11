plugins {
    `java-library`
    id("io.freefair.lombok")
    id("com.diffplug.spotless")
}

dependencies {
    implementation(project(":domain"))
}
