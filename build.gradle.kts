plugins {
    java
    jacoco
    alias(libs.plugins.sonarqube)
}

subprojects {
    apply(plugin = "java")
    apply(plugin = "jacoco")

    java {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    sourceSets {
        main {
            java.srcDir("main")
        }
        test {
            java.srcDir("test")
        }
    }

    repositories {
        mavenCentral()
    }

    dependencies {
        implementation(rootProject.libs.commons.lang3)
        compileOnly(rootProject.libs.lombok)
        annotationProcessor(rootProject.libs.lombok)
        testImplementation(rootProject.libs.mockito.inline)
        testImplementation(rootProject.libs.junit.jupiter)
        testImplementation(rootProject.libs.awaitility)
        testRuntimeOnly(rootProject.libs.junit.platform.launcher)
    }

    tasks {
        compileJava {
            options.encoding = "UTF-8"
        }
        compileTestJava {
            options.encoding = "UTF-8"
        }
        test {
            useJUnitPlatform()
            testLogging {
                events("FAILED", "SKIPPED")
                exceptionFormat = org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL
                showExceptions = true
                showStackTraces = false
            }
            reports {
                junitXml.required = false
                html.required = false
            }
        }
        jacocoTestReport {
            reports {
                xml.required = true
                html.required = false
            }
        }
    }
}

sonarqube {
    properties {
        property("sonar.issue.ignore.multicriteria", "fc31,iv22")
        // Code Smell [minor]: The default unnamed package should not be used
        property("sonar.issue.ignore.multicriteria.fc31.ruleKey", "java:S1220")
        property("sonar.issue.ignore.multicriteria.fc31.resourceKey", "**/*.java")
        // Code Smell [major]: Ternary operators should not be nested
        property("sonar.issue.ignore.multicriteria.iv22.ruleKey", "java:S3358")
        property("sonar.issue.ignore.multicriteria.iv22.resourceKey", "**/*.java")
    }
}