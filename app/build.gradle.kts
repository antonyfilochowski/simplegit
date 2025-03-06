plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.org.jetbrains.kotlin.android)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.kotlin.serialization)
    alias(libs.plugins.hilt.android)
    alias(libs.plugins.ksp)
//    id("com.google.gms.google-services")
//
    id("dagger.hilt.android.plugin")
    id("kotlin-parcelize")
}

android {
    namespace = "com.antonyf.simplegit"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.antonyf.simplegit"
        minSdk = 33
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)

//    retrofit-core = { group = "com.squareup.retrofit2", name = "retrofit", version.ref = "retrofit" }
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.graphics.shapes)
    implementation(libs.androidx.ui.tooling.preview)

//  material3")
    implementation(libs.androidx.material3)
    implementation(libs.androidx.material.icons.extended)
//    implementation("androidx.compose.material:material:1.6.7")
    implementation(libs.androidx.lifecycle.viewmodel.savedstate)
    implementation(libs.androidx.lifecycle.runtime.compose)
    implementation(libs.androidx.lifecycle.viewmodel.compose)
    implementation(libs.accompanist.flowlayout)

    // Splash Api
//    implementation(libs.androidx.core.splashscreen)

    // work manager
//    implementation(libs.androidx.work.runtime.ktx)

    // compose navigation
    implementation(libs.navigation.compose)
    implementation(libs.androidx.livedata)
    implementation(libs.androidx.foundation)

    // room components
    implementation(libs.androidx.room.runtime)
    ksp(libs.androidx.room.compiler)
    implementation(libs.androidx.room.ktx)
    implementation(libs.androidx.room.paging)
    testImplementation(libs.androidx.room.testing)

    implementation(libs.androidx.datastore.preferences)

    // Typed DataStore (Typed API surface, such as Proto)
    implementation(libs.androidx.datastore)

    // paging 3.3.5
    implementation(libs.androidx.paging.compose)
    implementation(libs.androidx.paging.runtime.ktx)
    // Coil
    implementation(libs.coil.compose)
    implementation(libs.bundles.coil)

    // dagger - hilt
    ksp(libs.hilt.android.compiler)
    implementation(libs.hilt.android)
    ksp(libs.androidx.hilt.compiler)
    implementation(libs.androidx.hilt.navigation.compose)

    // koin - kotlin based di for android/kotlin
    implementation(project.dependencies.platform(libs.koin.bom))
    implementation(libs.koin.core)
    implementation(libs.koin.ksp.compiler)
    implementation(libs.koin.annotation)
    implementation(libs.koin.android)
    implementation(libs.koin.androidx.compose)
    implementation(libs.koin.compose)
    implementation(libs.koin.compose.viewmodel)

    // work manager
    implementation(libs.androidx.work.runtime.ktx)

//   hilt work usually causes compile problems
//    implementation(libs.androidx.hilt.work)

//    // firebase
    implementation(platform(libs.firebase.bom))

    implementation(libs.firebase.auth)
    implementation(libs.firebase.firestore)
    implementation(libs.firebase.messaging)
    implementation(libs.jetbrains.kotlinx.coroutines.play.services)
    implementation(libs.firebase.firestore)
    implementation(libs.firebase.storage.ktx)

    // ktor
    implementation(libs.ktor.ktor.client.websockets)
    implementation(libs.ktor.ktor.client.okhttp)
    implementation(libs.ktor.serialization.kotlinx.json)
    implementation(libs.ktor.client.content.negotiation)
    implementation(libs.ktor.client.android)
    implementation(libs.ktor.client.core)
    implementation(libs.ktor.client.cio)
    implementation(libs.ktor.client.logging)

    // KotlinX Serialization
    implementation(libs.kotlinx.serialization.json)

    // retrofit
    implementation(libs.retrofit.core)
    implementation(libs.converter.gson)

    // retrofit with Scalar Converter
    implementation(libs.retrofit2.converter.scalars)

    implementation(libs.gson)
    implementation(libs.converter.moshi)
    implementation(libs.moshi)
    implementation(libs.moshi.kotlin)
    implementation(libs.okhttp)
    implementation(libs.logging.interceptor)

    // volley http library
    implementation(libs.volley)

    implementation(libs.retrofit2.kotlinx.serialization.converter)
    /*
    https://jsonplaceholder.typicode.com/
    https://jsonplaceholder.typicode.com/users
     */
    implementation(libs.kotlinx.coroutines.android)

    testImplementation(libs.junit)
    // work manager
    androidTestImplementation(libs.androidx.work.testing)
    // testing Navigation
    androidTestImplementation(libs.androidx.navigation.testing)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.ui.test.manifest)
    testImplementation(libs.kotlinx.coroutines.test)
}