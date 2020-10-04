plugins {
    application
    id("name.remal.check-updates") version "1.0.211"
    id("org.jmailen.kotlinter") version "3.2.0"
    kotlin("jvm") version "1.4.10"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
}

application {
    mainClass.set("name.goldencham.photosorter.ApplicationKt")
}

defaultTasks("checkUpdates", "formatKotlin", "clean", "build")
