rootProject.name = "mikrocord"

fun importProject(name: String) {
    include(name)
    project(":$name").apply {
        projectDir = File("./MikroCord-Proxy/${name}")
        buildFileName = "../../gradle/subprojects/${name}-build.gradle"
        if (!buildFile.exists()) {
            // Default to .kts
            buildFileName = buildFileName + ".kts"
        }
    }
}

importProject("api")
importProject("chat")
importProject("config")
importProject("event")
importProject("log4j")
importProject("native")
importProject("protocol")
importProject("proxy")
importProject("query")