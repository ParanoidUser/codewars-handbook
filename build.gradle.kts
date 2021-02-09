plugins {
    java
    jacoco
    id("org.sonarqube") version "3.1.1"
}

subprojects {
    apply(plugin = "java")
    apply(plugin = "jacoco")

    java {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    sourceSets {
        main {
            java {
                srcDir("main")
            }
        }
        test {
            java {
                srcDir("test")
            }
        }
    }

    repositories {
        mavenCentral()
    }

    dependencies {
        /*
        * The dependency list matches actual dependency versions being used on Codewars platform.
        * For more information check the links:
        * - https://github.com/Codewars/codewars.com/wiki/Language-Java
        * - https://github.com/Codewars/codewars-runner-cli/blob/master/documentation/environments/java.md
        */
        implementation("org.apache.commons", "commons-lang3", "3.11")
        implementation("org.springframework.boot", "spring-boot-starter-web", "2.4.1")
        compileOnly("org.projectlombok", "lombok", "1.18.16")
        annotationProcessor("org.projectlombok", "lombok", "1.18.16")
        testImplementation("org.mockito", "mockito-inline", "3.6.28")
        testImplementation("org.junit.jupiter", "junit-jupiter", "5.7.0")
        testImplementation("org.springframework.boot", "spring-boot-starter-test", "2.4.1")
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
                junitXml.isEnabled = false
                html.isEnabled = false
            }
        }
        jacocoTestReport {
            reports {
                xml.isEnabled = true
                html.isEnabled = false
            }
        }
    }

    if (projectDir.parentFile != rootDir) {
        val parent = project(":${projectDir.parentFile.name}")
        tasks.forEach {
            parent.tasks.findByName(it.name)?.dependsOn(it)
        }
        parent.childProjects[name] = project
    }
}

sonarqube {
    properties {
        /*
         * Down below is a list of SonarQube rules excluded from the analysis to
         * reflect the specifics of source code created on the Codewars platform.
         *
         * Initially, users are provided with a source code of class (or set
         * of classes) where they need to add their code to a predefined static
         * method to implement the logic described in a task. They are allowed,
         * but not obligated, to create additional fields, methods or inner
         * classes that should help them in task completion. But they cannot
         * change the original class structure or its parts, such as package name,
         * class name, predefined field and method name, method arguments, etc.
         * Sometimes, authors translate their kata from other languages to Java
         * without following naming conventions or best practices in the language
         * which raises code smells ordinary users cannot fix by themselves.
         *
         * Each exclusion SHOULD be unique and defined in the format: [group][severity][sid]
         *
         * Currently, there are two groups specified:
         *   (fc) The rules violated due to the fulfillment of the code structure
         *        contract defined by the kata author (e.g using default packages).
         *   (iv) The rules intentionally violated by using not traditional Java
         *        language capabilities to save lines of code (known as code golfing).
         *
         * There are five severity levels defined at Sonar their values following:
         *   (0) - blocker
         *   (1) - critical
         *   (2) - major
         *   (3) - minor
         *   (4) - info
         *
         * For example, the exclusion 'sonar.issue.ignore.multicriteria.fc32.ruleKey = java:S101'
         * can be explained as:
         *  - ignore the class naming conventions in the source code
         *  - because the bad class name was chosen by kata author (not the user)
         *  - the severity of the rule is minor
         *  - and this is the second rule being excluded with this severity
         */

        property("sonar.issue.ignore.multicriteria", "fc11,fc12,fc21,fc22,fc23,fc31,fc32,fc33,iv21,iv22,iv23,iv24,iv31")

        // Security Hotspot [Critical]: Using regular expressions is security-sensitive
        property("sonar.issue.ignore.multicriteria.fc11.ruleKey", "java:S4784")
        property("sonar.issue.ignore.multicriteria.fc11.resourceKey", "**/*.java")
        // Security Hotspot [Critical]: Using pseudorandom number generators (PRNGs) is security-sensitive
        property("sonar.issue.ignore.multicriteria.fc12.ruleKey", "java:S2245")
        property("sonar.issue.ignore.multicriteria.fc12.resourceKey", "**/*.java")
        // Code Smell [major]: Utility classes should not have public constructors
        property("sonar.issue.ignore.multicriteria.fc21.ruleKey", "java:S1118")
        property("sonar.issue.ignore.multicriteria.fc21.resourceKey", "**/*.java")
        // Code Smell [major]: Unused method parameters should be removed
        property("sonar.issue.ignore.multicriteria.fc22.ruleKey", "java:S1172")
        property("sonar.issue.ignore.multicriteria.fc22.resourceKey", "**/*.java")
        // Code Smell [major]: Non-constructor methods should not have the same name as the enclosing class
        property("sonar.issue.ignore.multicriteria.fc23.ruleKey", "java:S1223")
        property("sonar.issue.ignore.multicriteria.fc23.resourceKey", "**/*.java")
        // Code Smell [minor]: The default unnamed package should not be used
        property("sonar.issue.ignore.multicriteria.fc31.ruleKey", "java:S1220")
        property("sonar.issue.ignore.multicriteria.fc31.resourceKey", "**/*.java")
        // Code Smell [minor]: Class names should comply with a naming convention
        property("sonar.issue.ignore.multicriteria.fc32.ruleKey", "java:S101")
        property("sonar.issue.ignore.multicriteria.fc32.resourceKey", "**/*.java")
        // Code Smell [minor]: Method names should comply with a naming convention
        property("sonar.issue.ignore.multicriteria.fc33.ruleKey", "java:S100")
        property("sonar.issue.ignore.multicriteria.fc33.resourceKey", "**/*.java")

        // Code Smell [major]: "for" loop stop conditions should be invariant
        property("sonar.issue.ignore.multicriteria.iv21.ruleKey", "java:S127")
        property("sonar.issue.ignore.multicriteria.iv21.resourceKey", "**/*.java")
        // Code Smell [major]: Ternary operators should not be nested
        property("sonar.issue.ignore.multicriteria.iv22.ruleKey", "java:S3358")
        property("sonar.issue.ignore.multicriteria.iv22.resourceKey", "**/*.java")
        // Code Smell [major]: Assignments should not be made from within sub-expressions
        property("sonar.issue.ignore.multicriteria.iv23.ruleKey", "java:S1121")
        property("sonar.issue.ignore.multicriteria.iv23.resourceKey", "**/*.java")
        property("sonar.issue.ignore.multicriteria.iv24.ruleKey", "java:S1168")
        property("sonar.issue.ignore.multicriteria.iv24.resourceKey", "**/*.java")
        // Code Smell [minor]: Multiple variables should not be declared on the same line
        property("sonar.issue.ignore.multicriteria.iv31.ruleKey", "java:S1659")
        property("sonar.issue.ignore.multicriteria.iv31.resourceKey", "**/*.java")
    }
}