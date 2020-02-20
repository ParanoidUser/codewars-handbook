rootProject.name = "codewars-solutions"

val ignore = setOf("build", "8 kyu", "7 kyu", "6 kyu", "5 kyu", "4 kyu", "3 kyu", "2 kyu", "1 kyu", "kata")
File("kata").walk().maxDepth(2)
        .filter { it.isDirectory && !ignore.contains(it.name) }
        .forEach {
            include(it.name)
            project(":${it.name}").projectDir = it
        }

plugins {
    id("com.gradle.enterprise") version "3.1.1"
}

gradleEnterprise {
    buildScan {
        termsOfServiceUrl = "https://gradle.com/terms-of-service"
        termsOfServiceAgree = "yes"

        background {
            value("Git Commit", exec("git rev-parse --short=8 --verify HEAD"))
            value("Git Branch", exec("git rev-parse --abbrev-ref HEAD"))
        }

        obfuscation {
            username { "${it.first()}${it.last()}".toUpperCase() }
            hostname { "localhost" }
            ipAddresses { it.map { "0.0.0.0" } }
        }
    }
}

fun exec(command: String): String {
    val process = Runtime.getRuntime().exec(command)
    if (process.waitFor() != 0) {
        println("WARNING: " + String(process.errorStream.readBytes()))
        return "unknown"
    }
    return String(process.inputStream.readBytes()).trim()
}