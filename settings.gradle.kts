pluginManagement {
    repositories {
        maven("https://maven.fabricmc.net") { name = "Fabric" }
        mavenCentral()
        gradlePluginPortal()
    }
    plugins {
        id("fabric-loom").version(settings.extra["loom_version"] as String)
        kotlin("jvm").version(System.getProperty("kotlin_version"))
    }
}

include("OptiGUI", "OptiGlue:Stub", "OptiGlue:1.19", "OptiGlue:1.19.3")
