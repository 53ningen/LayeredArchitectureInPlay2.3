import play.PlayScala

name := """LayeredApplication"""

version := "1.0-SNAPSHOT"

lazy val layeredDomain = (project in file("../layered-domain")).enablePlugins(PlayScala)
lazy val layeredInfrastructure = (project in file("../layered-infrastructure")).enablePlugins(PlayScala)

lazy val layeredApplication = (project in file("."))
  .enablePlugins(PlayScala)
  .dependsOn(layeredDomain, layeredInfrastructure)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws
)
