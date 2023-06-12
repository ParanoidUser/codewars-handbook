plugins {
    java
    jacoco
    id("org.sonarqube") version "4.2.1.3168"
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
        implementation("org.apache.commons:commons-lang3:3.12.0")
        implementation("org.springframework.boot:spring-boot-starter-web:3.1.0")
        compileOnly("org.projectlombok:lombok:1.18.28")
        annotationProcessor("org.projectlombok:lombok:1.18.28")
        testImplementation("org.mockito:mockito-inline:5.2.0")
        testImplementation("org.junit.jupiter:junit-jupiter:5.9.3")
        testImplementation("org.awaitility:awaitility:4.2.0")
        testImplementation("org.springframework.boot:spring-boot-starter-test:3.1.0")
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
                junitXml.required.set(false)
                html.required.set(false)
            }
        }
        jacocoTestReport {
            reports {
                xml.required.set(true)
                html.required.set(false)
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