organization := "my org"
name := "fizzbuzz"
version := "1.4"

scalaVersion := "2.12.4"
scalacOptions ++= List("-feature","-deprecation", "-unchecked", "-Xlint")


libraryDependencies ++= Seq(
  "org.scalatest"   %% "scalatest"    % "3.0.4"   % "test"
)
