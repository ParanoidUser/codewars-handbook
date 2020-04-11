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
    id("com.gradle.enterprise") version "3.2.1"
}

gradleEnterprise {
    buildScan {
        if (!System.getenv("CI").isNullOrEmpty()) {
            termsOfServiceUrl = "https://gradle.com/terms-of-service"
            termsOfServiceAgree = "yes"
        }

        obfuscation {
            username { "[hidden]" }
            hostname { "[hidden]" }
            ipAddresses { listOf("[hidden]") }
        }
    }
}