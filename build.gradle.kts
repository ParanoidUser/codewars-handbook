plugins {
    java
    jacoco
    id("org.sonarqube") version "2.8"
    id("com.github.ben-manes.versions") version "0.28.0"
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
}