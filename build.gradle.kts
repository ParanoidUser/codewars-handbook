plugins {
    java
    jacoco
    id("org.sonarqube") version "2.8"
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

    /*
     * The dependency list matches actual dependency versions being used on Codewars platform.
     * For more information check the link - https://github.com/Codewars/codewars.com/wiki/Language-Java
     */
    dependencies {
        implementation("org.apache.commons", "commons-lang3", "3.9")
        compileOnly("org.projectlombok", "lombok", "1.18.12")
        annotationProcessor("org.projectlombok", "lombok", "1.18.12")
        testImplementation("org.junit.jupiter", "junit-jupiter", "5.6.0")
        testRuntimeOnly("org.junit.vintage", "junit-vintage-engine", "5.6.0")
        testImplementation("junit", "junit", "4.13")
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
        }
        jacocoTestReport {
            reports {
                xml.isEnabled = true
            }
        }
        check {
            dependsOn(jacocoTestReport)
        }
    }

    sonarqube {
        properties {
            property("sonar.issue.ignore.multicriteria", "j1,j2,j3,j4,j5")
            // Code Smell [major]: "for" loop stop conditions should be invariant
            property("sonar.issue.ignore.multicriteria.j1.ruleKey", "java:S127")
            // Code Smell [major]: Utility classes should not have public constructors
            property("sonar.issue.ignore.multicriteria.j2.ruleKey", "java:S1118")
            // Code Smell [minor]: The default unnamed package should not be used
            property("sonar.issue.ignore.multicriteria.j3.ruleKey", "java:S1220")
            // Code Smell [minor]: Multiple variables should not be declared on the same line
            property("sonar.issue.ignore.multicriteria.j4.ruleKey", "java:S1659")
            // Code Smell [major]: Ternary operators should not be nested
            property("sonar.issue.ignore.multicriteria.j5.ruleKey", "java:S3358")
        }
    }
}