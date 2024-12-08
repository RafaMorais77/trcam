pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")   // Inclui grupos do Android
                includeGroupByRegex("com\\.google.*")    // Inclui grupos do Google
                includeGroupByRegex("androidx.*")        // Inclui grupos do AndroidX
                includeGroup("com.google.mlkit")         // Inclui dependências do ML Kit
                includeGroup("com.google.guava")         // Inclui dependências do Guava
            }
        }
        mavenCentral()           // Repositório Maven Central
        gradlePluginPortal()     // Portal de Plugins do Gradle
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()                 // Repositório Google
        mavenCentral()           // Repositório Maven Central
    }
}

rootProject.name = "trcam"       // Nome do projeto raiz
include(":app")                 // Inclui o módulo app
