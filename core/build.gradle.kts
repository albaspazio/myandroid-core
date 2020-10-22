plugins {
    id(Plugins.androidLibrary)
    kotlin(Plugins.kotlinAndroid)
    kotlin(Plugins.kotlinExtensions)

    id("name.remal.check-dependency-updates") version "1.0.211"
}

android {

    compileSdkVersion(Configs.compileSdkVersion)
    defaultConfig {
        minSdkVersion(Configs.minSdkVersion)
        targetSdkVersion(Configs.targetSdkVersion)
        versionCode = Configs.versionCode
        versionName = Configs.versionName
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile(ProGuards.proguardTxt), ProGuards.androidDefault)        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

}

androidExtensions {
    isExperimental = true
}


dependencies {

    api(Dependencies.AndroidX.ktxCore)
    api(Dependencies.AndroidX.navFragment)
    api(Dependencies.AndroidX.navUi)
    api(Dependencies.Kotlin.stdLib)
    api(Dependencies.Kotlin.reflect)

    api("androidx.appcompat:appcompat:1.3.0-alpha02")
    api("androidx.constraintlayout:constraintlayout:2.0.2")
    api("com.google.android.material:material:1.2.1")

    api("io.reactivex.rxjava2:rxandroid:2.1.1")
    api("com.jakewharton.rxrelay2:rxrelay:2.1.1")
    api("io.reactivex.rxjava2:rxkotlin:2.4.0")

    api("com.sun.mail:android-mail:1.6.5")
    api("com.sun.mail:android-activation:1.6.5")
    implementation("androidx.localbroadcastmanager:localbroadcastmanager:1.0.0")

    testImplementation("junit:junit:4.13")
    androidTestImplementation("androidx.test:runner:1.3.0")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.3.0")
}