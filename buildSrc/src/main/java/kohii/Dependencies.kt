/*
 * Copyright (c) 2019 Nam Nguyen, nam@ene.im
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package kohii

@Suppress("unused", "MemberVisibilityCanBePrivate")
object Versions {
  const val exoPlayer = "2.14.2"
  const val exoPlayerSnapShot = "dev-v2-r${exoPlayer}-SNAPSHOT"
  const val exoPlayerCode = 2014002
}

object ReleaseInfo {

  const val repoName = "kohii"
  const val groupId = "im.ene.kohii"
  const val description = "Android Video Playback made easy."
  const val websiteUrl = "https://github.com/eneim/kohii"
  const val vcsUrl = "https://github.com/eneim/kohii"
  val licenses = arrayOf("Apache-2.0")
}

@Suppress("MayBeConstant", "unused")
object BuildConfig {

  const val compileSdkVersion = 30
  const val targetSdkVersion = 30
  const val minSdkVersion = 19
  const val demoSdkVersion = 21 // to prevent dex limit on debug build.

  const val releaseVersionCode = 10300 // [major].[2 digits for minor].[2 digits for patch]
  const val releaseVersionName = "1.3.0.${Versions.exoPlayerCode}-SNAPSHOT"
}

@Suppress("MayBeConstant", "unused")
object Libs {

  object Common {
    const val androidGradlePlugin = "com.android.tools.build:gradle:7.0.2"
    const val dexcountGradlePlugin = "com.getkeepsafe.dexcount:dexcount-gradle-plugin:3.0.1"
    const val ktLintPlugin = "org.jlleitschuh.gradle:ktlint-gradle:9.2.1"
    const val bintrayPlugin = "com.jfrog.bintray.gradle:gradle-bintray-plugin:1.8.5"

    private const val dokkaVersion = "1.5.30"
    const val dokkaPlugin = "org.jetbrains.dokka:dokka-gradle-plugin:$dokkaVersion"
    const val dokkaAndroidPlugin = "org.jetbrains.dokka:android-documentation-plugin:$dokkaVersion"
    const val binaryValidator = "org.jetbrains.kotlinx:binary-compatibility-validator:0.7.1"
    const val nexusPublish = "io.github.gradle-nexus:publish-plugin:1.1.0"

    const val junit = "junit:junit:4.13"
    const val junitExt = "androidx.test.ext:junit-ktx:1.1.2"
    const val robolectric = "org.robolectric:robolectric:4.3.1"
    const val mockitoKotlin = "com.nhaarman.mockitokotlin2:mockito-kotlin:2.1.0"
  }

  object Kotlin {
    private const val version = "1.5.30"

    const val stdlibJdk7 = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$version"
    const val stdlibJdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$version"
    const val reflect = "org.jetbrains.kotlin:kotlin-reflect:$version"
    const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"
    const val extensions = "org.jetbrains.kotlin:kotlin-android-extensions:$version"
    const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.4.2"
  }

  object AndroidX {
    const val activityKtx = "androidx.activity:activity-ktx:1.1.0"
    const val appcompat = "androidx.appcompat:appcompat:1.1.0"
    const val appcompatResources = "androidx.appcompat:appcompat-resources:1.1.0"
    const val collectionKtx = "androidx.collection:collection-ktx:1.1.0"
    const val benchmark = "androidx.benchmark:benchmark-junit4:1.0.0"
    const val browser = "androidx.browser:browser:1.2.0"
    const val palette = "androidx.palette:palette-ktx:1.0.0"
    const val emoji = "androidx.emoji:emoji:1.0.0"

    const val vector = "androidx.vectordrawable:vectordrawable:1.1.0"

    const val recyclerView = "androidx.recyclerview:recyclerview:1.1.0"
    const val recyclerViewSelection = "androidx.recyclerview:recyclerview-selection:1.1.0"

    const val viewPager = "androidx.viewpager:viewpager:1.0.0"
    const val viewPager2 = "androidx.viewpager2:viewpager2:1.0.0"

    const val coordinatorLayout = "androidx.coordinatorlayout:coordinatorlayout:1.1.0"

    object Media {
      private const val version = "1.0.3"

      // private const val version = "1.1.0-SNAPSHOT"
      val widget = "androidx.media2:media2-widget:$version"
      val common = "androidx.media2:media2-common:$version"
      val player = "androidx.media2:media2-player:$version"
      val session = "androidx.media2:media2-session:$version"
    }

    object Navigation {
      private const val version = "2.3.0"

      val runtimeKtx = "androidx.navigation:navigation-runtime-ktx:$version"
      val commonKtx = "androidx.navigation:navigation-common-ktx:$version"
      val uiKtx = "androidx.navigation:navigation-ui-ktx:$version"
      val fragmentKtx = "androidx.navigation:navigation-fragment-ktx:$version"
      val safeArgs = "androidx.navigation:navigation-safe-args-gradle-plugin:$version"
    }

    object Fragment {
      private const val version = "1.2.4"
      const val fragmentKtx = "androidx.fragment:fragment-ktx:$version"
    }

    object Test {
      private const val version = "1.3.0"
      val core = "androidx.test:core:$version"
      val runner = "androidx.test:runner:$version"
      val rules = "androidx.test:rules:$version"

      const val espressoCore = "androidx.test.espresso:espresso-core:3.3.0"
    }

    const val archCoreTesting = "androidx.arch.core:core-testing:2.1.0"

    object Paging {
      private const val version = "2.1.2"
      val common = "androidx.paging:paging-common-ktx:$version"
      val runtime = "androidx.paging:paging-runtime-ktx:$version"
    }

    const val preference = "androidx.preference:preference-ktx:1.1.0"

    // beta4 breaks the overlay demo ...
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:2.0.0"

    const val core = "androidx.core:core:1.3.0"
    const val coreKtx = "androidx.core:core-ktx:1.3.0"

    object Lifecycle {
      private const val version = "2.2.0"
      val extensions = "androidx.lifecycle:lifecycle-extensions:$version"
      val reactive = "androidx.lifecycle:lifecycle-reactivestreams-ktx:$version"
      val compiler = "androidx.lifecycle:lifecycle-compiler:$version"
      val java8 = "androidx.lifecycle:lifecycle-common-java8:$version"
      val runtime = "androidx.lifecycle:lifecycle-runtime-ktx:$version"
      val liveData = "androidx.lifecycle:lifecycle-livedata-ktx:$version"
      val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:$version"
      val service = "androidx.lifecycle:lifecycle-service:$version"
    }

    object Room {
      private const val version = "2.2.5"
      val common = "androidx.room:room-common:$version"
      val runtime = "androidx.room:room-runtime:$version"
      val compiler = "androidx.room:room-compiler:$version"
      val ktx = "androidx.room:room-ktx:$version"
      val testing = "androidx.room:room-testing:$version"
    }

    object Work {
      private const val version = "2.3.1"
      val runtimeKtx = "androidx.work:work-runtime-ktx:$version"
    }
  }

  object ExoPlayer {
    private fun subLib(name: String): String {
      return "com.google.android.exoplayer:exoplayer-$name:${Versions.exoPlayer}"
    }

    private fun extLib(name: String): String {
      return "com.google.android.exoplayer:extension-$name:${Versions.exoPlayer}"
    }

    val all = "com.google.android.exoplayer:exoplayer:${Versions.exoPlayer}"

    val common = subLib("common")
    val core = subLib("core")
    val ui = subLib("ui")
    val dash = subLib("dash")
    val hls = subLib("hls")
    val smoothStreaming = subLib("smoothstreaming")

    val mediaSession = extLib("mediasession")
    val okhttpExtension = extLib("okhttp")
    val imaExtension = extLib("ima")
    val rtmpExtension = extLib("rtmp")

    val ima = extLib("ima")
    val cast = extLib("cast")

    val workManager = extLib("workmanager")

    val allSnapshot = "com.github.google.exoplayer:exoplayer:${Versions.exoPlayerSnapShot}"
  }

  object Google {
    const val material = "com.google.android.material:material:1.1.0"
    const val gmsGoogleServices = "com.google.gms:google-services:4.3.3"
    const val firebaseAnalytics = "com.google.firebase:firebase-analytics:17.4.3"
    const val firebaseCrashlyticsPlugin = "com.google.firebase:firebase-crashlytics-gradle:2.2.0"
    const val crashlytics = "com.google.firebase:firebase-crashlytics-ktx:17.2.1"

    const val youtubeApi = "com.google.apis:google-api-services-youtube:v3-rev20200618-1.30.9"
    const val httpClientAndroid = "com.google.http-client:google-http-client-android:1.35.0"
    const val apiClientAndroid = "com.google.api-client:google-api-client-android:1.30.9"
    const val apiClientGson = "com.google.api-client:google-api-client-gson:1.30.9"
  }

  object Dagger {
    private const val version = "2.28.1"
    val daggerBase = "com.google.dagger:dagger:$version"
    val androidSupport = "com.google.dagger:dagger-android-support:$version"
    val compiler = "com.google.dagger:dagger-compiler:$version"
    val androidProcessor = "com.google.dagger:dagger-android-processor:$version"
  }

  object Square {
    private const val moshiVersion = "1.12.0"
    val moshi = "com.squareup.moshi:moshi:$moshiVersion"
    val moshiCodegen = "com.squareup.moshi:moshi-kotlin-codegen:$moshiVersion"
    val moshiKotlin = "com.squareup.moshi:moshi-kotlin:$moshiVersion"
    const val leakCanary = "com.squareup.leakcanary:leakcanary-android:2.6"
    const val leakCanaryPlumber = "com.squareup.leakcanary:plumber-android:2.6"
    const val okio = "com.squareup.okio:okio:2.10.0"
  }

  object Glide {
    private const val version = "4.11.0"
    val glideAll = "com.github.bumptech.glide:glide:$version"
    val compiler = "com.github.bumptech.glide:compiler:$version"
  }

  object Coil {
    private const val version = "0.11.0"
    val coilBase = "io.coil-kt:coil:$version"
    val coilSvg = "io.coil-kt:coil-svg:$version"
    val coilGif = "io.coil-kt:coil-gif:$version"
    val coilVideo = "io.coil-kt:coil-video:$version"
  }

  object Other {
    const val androidSvg = "com.caverock:androidsvg-aar:1.4"
    const val timber = "com.jakewharton.timber:timber:4.7.1"
  }
}
