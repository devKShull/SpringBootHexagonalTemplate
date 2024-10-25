rootProject.name = "template"

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            from(files("libs.versions.toml"))
        }
    }
}

data class Module(
    val name: String,
    val path: String
)

val modules = mutableListOf<Module>()

fun module(name: String, path: String){
    modules.add(Module(name, "$rootDir/$path"))
}

module(":boot", "/template/framework/boot")
module(":application", "/template/hexagonal/application")
module(":domain", "/template/hexagonal/domain")
module(":adapter-jpa", "/template/hexagonal/adapter/adapter-jpa")
module(":adapter-rest", "/template/hexagonal/adapter/adapter-rest")

modules.forEach {
    include(it.name)
    project(it.name).projectDir = file(it.path)
}