// Include the Android plugin
androidDefaults

// Name of your app
name := "Desafio Mobile Meli"

// Version of your app
version := "0.1"

// Version number of your app
versionCode := 0

// Version of Scala
scalaVersion := "2.10.1"

// Version of the Android platform SDK
platformName := "android-19"

// Dependencies
libraryDependencies ++= Seq(
  "org.scaloid" %% "scaloid" % "3.3-8",
  "com.octo.android.robospice" % "robospice" % "1.4.12"
)
