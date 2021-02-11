plugins {
    `java-library`
    id("io.freefair.lombok")
    id("com.diffplug.spotless")
    id("org.springframework.boot") version "2.4.2"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
}

dependencies {
    // project dependencies
    implementation(project(":domain"))
    implementation(project(":app"))
    implementation(project(":infra:store"))
    // spring
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-web")
    runtimeOnly("com.h2database:h2")
}
