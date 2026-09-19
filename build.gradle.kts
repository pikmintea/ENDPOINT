plugins {
    kotlin("jvm") version "2.4.10"
    application
}

group = "org.pikmintea.endpoint"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.github.spair:imgui-java-app:1.92.7.1")

}

kotlin {
    jvmToolchain(25)
}
application {
    mainClass.set("org.pikmintea.endpoint.MainKt")
}