plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}
rootProject.name = "kotlin-starter-2"
include("src:main:OOP")
findProject(":src:main:OOP")?.name = "OOP"
