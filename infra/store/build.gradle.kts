plugins {
    `java-library`
    id("io.freefair.lombok")
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
}

dependencies {
    // project dependencies
    implementation(project(":domain"))
    implementation(project(":app"))
    // spring data JPA
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
}