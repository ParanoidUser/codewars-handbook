plugins {
    java
    id("org.sonarqube") version "2.8"
}

subprojects {
    apply(plugin = "java")

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
        testImplementation("org.junit.jupiter:junit-jupiter:5.5.2")
        testRuntimeOnly("org.junit.vintage:junit-vintage-engine:5.5.2")
        testImplementation("junit:junit:4.12")
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
    }
}

sonarqube {
    properties {
        property("sonar.projectKey", "codewars-solutions")
    }
}