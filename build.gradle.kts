/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Kotlin application project to get you started.
 */

plugins {
    // Apply the Kotlin JVM plugin to add support for Kotlin.
    id("org.jetbrains.kotlin.jvm") version "1.3.70"

    // Apply the application plugin to add support for building a CLI application.
    application

    kotlin("plugin.spring") version "1.3.71"
}
val springVersion = "5.2.5.RELEASE"
extra["spring-version"] = "5.2.5.RELEASE"

java.sourceCompatibility = JavaVersion.VERSION_1_8

repositories {
    maven {
        url = uri("http://maven.aliyun.com/repository/public/")
    }
    maven {
        url = uri("http://maven.aliyun.com/repository/spring/")
    }
    mavenCentral()
}

dependencies {
    // Align versions of all Kotlin components
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))

    // Use the Kotlin JDK 8 standard library.
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    implementation("org.springframework:spring-core:5.2.5.RELEASE")
    implementation("org.springframework:spring-context:5.2.5.RELEASE")

    implementation("org.aspectj:aspectjrt:1.9.5")
    implementation("org.aspectj:aspectjweaver:1.9.5")

    implementation("org.apache.commons:commons-dbcp2:2.7.0")
    implementation("mysql:mysql-connector-java:8.0.19")

    //bean scope
    implementation("org.springframework:spring-webmvc:5.2.5.RELEASE")

    annotationProcessor("org.springframework:spring-context-indexer:5.2.5.RELEASE")

    compileOnly("org.projectlombok:lombok:1.18.12")
    annotationProcessor("org.projectlombok:lombok:1.18.12")

    testCompileOnly("org.projectlombok:lombok:1.18.12")
    testAnnotationProcessor("org.projectlombok:lombok:1.18.12")

    implementation("org.apache.logging.log4j:log4j-api:2.13.2")
    implementation("org.apache.logging.log4j:log4j-core:2.13.2")

    // Use the Kotlin test library.
    testImplementation("org.jetbrains.kotlin:kotlin-test")

    // Use the Kotlin JUnit integration.
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")


}

application {
    // Define the main class for the application.
    mainClassName = "kotlin.spring.framework.AppKt"
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "1.8"
    }
}
