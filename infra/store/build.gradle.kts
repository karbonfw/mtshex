plugins {
    `java-library`
    id("io.freefair.lombok")
    id("com.diffplug.spotless")
}

val persistenceApiVersion: String by project
val springBootVersion: String by project

dependencies {
    // project dependencies
    implementation(project(":domain"))
    implementation(project(":app"))
    // spring data JPA
    implementation("jakarta.persistence:jakarta.persistence-api:$persistenceApiVersion")
    implementation("org.springframework.data:spring-data-jpa:$springBootVersion")
}