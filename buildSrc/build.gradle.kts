apply{
    plugin("kotlin")
}

buildscript {
    repositories {
        gradlePluginPortal()
    }
    dependencies{
        classpath(kotlin("gradle-plugin","1.3.71"))
    }
}
dependencies{
    implementation(gradleKotlinDsl())
    implementation(kotlin("stdlib","1.3.71"))
}
repositories {
    gradlePluginPortal()
}