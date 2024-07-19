buildscript {
  val kotlin_version by extra("1.7.20")

  repositories {
	google()
	mavenCentral()
	mavenLocal()
  }

  dependencies {
	classpath("com.android.tools.build:gradle:7.1.3")
	classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version")
  }
}
plugins {
  alias(libs.plugins.android.library)
  id("maven-publish")
}

android {
  namespace = "com.devbuvan.android_card_lib"
  compileSdk = 34

  defaultConfig {
	minSdk = 24

	testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
	consumerProguardFiles("consumer-rules.pro")
  }

  buildTypes {
	release {
	  isMinifyEnabled = false
	  proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
	  consumerProguardFiles ("consumer-rules.pro")
	}
  }
  compileOptions {
	sourceCompatibility = JavaVersion.VERSION_1_8
	targetCompatibility = JavaVersion.VERSION_1_8
  }
}
java {
  toolchain {
	languageVersion = JavaLanguageVersion.of(17)       /// << --- ADD This
  }
}


java {
  sourceCompatibility = JavaVersion.VERSION_17          ////  << --- ADD This
  targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
  implementation ("androidx.recyclerview:recyclerview:1.2.1")
  implementation(libs.androidx.appcompat)
  implementation(libs.material)
  testImplementation(libs.junit)
  androidTestImplementation(libs.androidx.junit)
  androidTestImplementation(libs.androidx.espresso.core)
}
publishing {
  publications {
	create<MavenPublication>("maven") {
	  groupId = "com.github.Bhuvanbuvan"
	  artifactId = "android-card-lib"
	  version = "1.1"
	  pom {
		description.set("First Android Library")
	  }
	}
  }
  repositories {
	mavenLocal()
  }
}