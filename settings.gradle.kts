rootProject.name = "codewars-handbook"

val exclude = listOf("build")
File(rootDir, "kata").walk().maxDepth(2)
        .filter { it.isDirectory && !exclude.contains(it.name) }
        .forEach {
            include(it.name)
            project(":${it.name}").projectDir = it
        }

plugins {
    id("com.gradle.enterprise") version "3.10.1"
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