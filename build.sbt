import Dependencies._

ThisBuild / scalaVersion := "2.13.11"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.example"
ThisBuild / organizationName := "example"

libraryDependencies ++= Seq(
  "dev.zio" %% "zio" % "1.0.0-RC15",
  "dev.zio" %% "zio-macros-access" % "0.4.0",
  "dev.zio" %% "zio-macros-mock" % "0.4.0",
  "dev.zio" %% "zio-test" % "1.0.0-RC15" % "test",
  "dev.zio" %% "zio-test-sbt" % "1.0.0-RC15" % "test"
)
scalacOptions += "-Ymacro-annotations"
testFrameworks := Seq(new TestFramework("zio.test.sbt.ZTestFramework"))
lazy val root = (project in file("."))
  .settings(
    name := "tic-tac-toe",
    libraryDependencies += munit % Test
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
