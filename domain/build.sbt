name := "domain"

version := "1.0"

scalaVersion := "2.10.1"

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "2.3.12" % "test"
)

scalacOptions in Test ++= Seq("-Yrangepos")

resolvers ++= Seq("snapshots", "releases").map(Resolver.sonatypeRepo)