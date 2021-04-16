course := "progfun1"
name := "scala_coursera_recfun"
assignment := "recfun"
version := "0.1"

scalaVersion := "2.13.5"

scalacOptions ++= Seq("-language:implicitConversions", "-deprecation")

libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % Test

testOptions in Test += Tests.Argument(TestFrameworks.JUnit, "-a", "-v", "-s")
