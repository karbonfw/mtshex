plugins {
    `java-library`
    id("io.freefair.lombok")
}

dependencies {
    implementation(project(":domain"))
}
