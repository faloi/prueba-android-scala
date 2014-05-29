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
  //scala interface for the Android Api
  "org.scaloid" %% "scaloid" % "3.3-8",
  //(1) a HTTP client and JSON parser to POJO's
  "com.google.http-client" % "google-http-client-jackson" % "1.18.0-rc",
  //(2) a tool for making requests without blocking the UI
  "com.octo.android.robospice" % "robospice" % "1.4.12",
  //integration of (1) into (2)
  "com.octo.android.robospice" % "robospice-google-http-client" % "1.4.12"
)
