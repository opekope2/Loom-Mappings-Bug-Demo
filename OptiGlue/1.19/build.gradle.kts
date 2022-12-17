plugins {
    id("fabric-loom")
    kotlin("jvm").version(System.getProperty("kotlin_version"))
}

base { archivesName.set(project.extra["archives_base_name"] as String) }

version = "${project.extra["mod_version"]}+1.19"
group = project.extra["maven_group"] as String

repositories {}

dependencies {
    minecraft("com.mojang", "minecraft", project.extra["minecraft_version"] as String)
    mappings("net.fabricmc", "yarn", project.extra["yarn_mappings"] as String, null, "v2")
    modImplementation("net.fabricmc", "fabric-loader", project.extra["loader_version"] as String)
    modImplementation("net.fabricmc.fabric-api", "fabric-api", project.extra["fabric_version"] as String)
    modImplementation(
        "net.fabricmc",
        "fabric-language-kotlin",
        project.extra["fabric_language_kotlin_version"] as String
    )
}

sourceSets["main"].apply {
    java.setSrcDirs("java")
    kotlin.setSrcDirs("kotlin")
    resources.setSrcDirs("resources")
}

tasks {
    processResources {
        filesMatching("fabric.mod.json") {
            expand(
                mutableMapOf(
                    "version" to version as String,
                    "fabricloader" to project.extra["loader_version"] as String,
                    "fabric_api" to project.extra["fabric_version"] as String,
                    "fabric_language_kotlin" to project.extra["fabric_language_kotlin_version"] as String,
                    "minecraft" to project.extra["minecraft_version"] as String,
                    "java" to project.extra["java_version"] as String
                )
            )
        }
    }
}

fun SourceDirectorySet.setSrcDirs(vararg dirs: String) = setSrcDirs(mutableListOf(dirs))
