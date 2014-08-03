import play.PlayScala

name := """LayeredDomain"""

version := "1.0-SNAPSHOT"

lazy val layeredInfrastructure = (project in file("../layered-infrastructure")).enablePlugins(PlayScala)

lazy val layeredDomain = (project in file("."))
  .enablePlugins(PlayScala)
  .dependsOn(layeredInfrastructure)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws
)
