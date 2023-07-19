import java.lang.IllegalArgumentException
import kotlin.math.roundToInt

rootProject.name = "codewars-handbook"
val projectDepth = 3 // kata/<rank>/<problem>/
val kata = File(rootDir, "kata").walk()
    .filter { it.isDirectory && "\\retired\\" !in it.path && it.toPath().nameCount == rootDir.toPath().nameCount + projectDepth }
    .sortedBy { it.name }
    .toList()

val forkCount: Int = Integer.getInteger("forkCount", 1)
val forkSid: Int = Integer.getInteger("forkSid", 1)
if (forkSid > forkCount)
    throw IllegalArgumentException("Fork is out of bound (sid=$forkSid, total=$forkCount)")

val length: Double = kata.size / forkCount.toDouble()
val from: Int = (length * (forkSid - 1)).roundToInt()
val to: Int = (length * forkSid).roundToInt()
logger.info("($forkSid/$forkCount) ${to - from} projects out of ${kata.size} in range=[$from,$to]")

kata.subList(from, to).forEach {
    include(it.name)
    project(":${it.name}").projectDir = it
}

plugins {
    id("com.gradle.enterprise") version "3.13.4"
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