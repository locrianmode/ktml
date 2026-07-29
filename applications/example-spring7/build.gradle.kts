plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.spring.boot4)
    alias(libs.plugins.ktml)
}

dependencies {
    implementation(libs.ktml.runtime)
//    developmentOnly(libs.ktml.dev.mode)
    implementation(libs.ktml.spring7)
    implementation(libs.spring.boot.starter.web4)
}

repositories {
    mavenLocal()
    mavenCentral()
}
