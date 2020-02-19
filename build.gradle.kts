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

    dependencies {
        implementation("org.apache.commons:commons-lang3:3.9")
        compileOnly("org.projectlombok:lombok:1.18.10")
        annotationProcessor("org.projectlombok:lombok:1.18.10")
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
        jacocoTestReport {
            reports {
                xml.isEnabled = true
                html.isEnabled = false
            }
        }
    }
}

sonarqube {
    properties {
        property("sonar.java.libraries", "${System.getProperty("java.home")}/lib/*.jar")
        property("sonar.coverage.jacoco.xmlReportPaths", "$buildDir/reports/jacoco")
    }
}