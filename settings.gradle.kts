rootProject.name = "codewars-handbook"

File(rootDir, "kata").walk().maxDepth(2)
        .filter {
            logger.debug("$it")
            var isSubProject = false
            if (it.isDirectory) {
                val srcDir = File(it, "main")
                isSubProject = srcDir.isDirectory && !srcDir.listFiles().isNullOrEmpty()
                if (srcDir.isDirectory && srcDir.listFiles().isNullOrEmpty()) {
                    logger.warn("$srcDir no source files found")
                }

                val testDir = File(it, "test")
                if (isSubProject && testDir.listFiles().isNullOrEmpty()) {
                    logger.warn("$testDir no test files found")
                }

                val readme = File(it, "README.md")
                if (isSubProject && !readme.isFile) {
                    logger.warn("$readme not found")
                }

                val groupedByDifficulty = 3
                val depth = it.toPath().nameCount - rootDir.toPath().nameCount
                if (isSubProject && depth != groupedByDifficulty) {
                    logger.warn("$it invalid directory depth. Expected: $groupedByDifficulty, Actual: $depth")
                }
            }
            isSubProject
        }
        .forEach {
            include(it.name)
            project(":${it.name}").projectDir = it
        }

plugins {
    id("com.gradle.enterprise") version "3.2"
}

gradleEnterprise {
    buildScan {
        if (!System.getenv("CI").isNullOrEmpty()) {
            termsOfServiceUrl = "https://gradle.com/terms-of-service"
            termsOfServiceAgree = "yes"
        }

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