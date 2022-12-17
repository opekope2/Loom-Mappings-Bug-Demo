plugins {
    kotlin("jvm").version(System.getProperty("kotlin_version"))
}

base { archivesName.set(project.extra["archives_base_name"] as String) }

version = "${project.extra["mod_version"]}+stub"
group = project.extra["maven_group"] as String

repositories {
    mavenCentral()
}

dependencies {}

sourceSets["main"].apply {
    java.setSrcDirs("java")
    kotlin.setSrcDirs("kotlin")
    resources.setSrcDirs("resources")
}

fun SourceDirectorySet.setSrcDirs(vararg dirs: String) = setSrcDirs(mutableListOf(dirs))
