name := """play-java-seed"""
organization := "com.aj"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.2"

libraryDependencies += guice
//Drools dependencies
resolvers += "public-jboss" at "https://repository.jboss.org/nexus/content/groups/public-jboss/"
libraryDependencies ++= Seq(
  "org.drools" % "drools-core" % "6.3.0.Final",
  "org.drools" % "drools-compiler" % "6.3.0.Final"
)

