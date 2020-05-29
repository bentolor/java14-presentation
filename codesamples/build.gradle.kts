plugins {
    `java-library`
}

repositories {
    mavenCentral()
}

java {
    sourceCompatibility = JavaVersion.VERSION_14
    group = "de.bentolor.java9to14samples"
}

tasks.withType<JavaCompile> {
    options.compilerArgs.add("--enable-preview")
}
tasks.test {
    useJUnitPlatform()
    jvmArgs("--enable-preview")
}

dependencies {
    implementation("org.jetbrains:annotations:17.0.0")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.4.2")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.4.2")
}
