import play.PlayScala

name := """Layered"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)
  .aggregate(layeredApplication, layeredDomain, layeredInfrastructure)
  .dependsOn(layeredApplication, layeredDomain, layeredInfrastructure)

lazy val layeredApplication = (project in file("modules/layered-application"))
  .enablePlugins(PlayScala)
  .dependsOn(layeredDomain, layeredInfrastructure)

lazy val layeredDomain = (project in file("modules/layered-domain"))
  .enablePlugins(PlayScala)
  .dependsOn(layeredInfrastructure)

lazy val layeredInfrastructure = (project in file("modules/layered-infrastructure"))
  .enablePlugins(PlayScala)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws
)
