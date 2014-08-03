import play.PlayScala

name := """LayeredInfrastructure"""

version := "1.0-SNAPSHOT"


lazy val layeredInfrastructure = (project in file("."))
  .enablePlugins(PlayScala)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws
)
