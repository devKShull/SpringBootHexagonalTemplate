dependencies {

    implementation(project(":application"))
    implementation(project(":domain"))

    implementation(libs.springframework.boot.starter.web)
    implementation(libs.springdoc.openapi.starter.webmvc.ui)

    implementation(libs.mapstruct)
    annotationProcessor(libs.mapstruct.processor)
}