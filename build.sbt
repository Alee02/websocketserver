name := "websocketserver"

version := "1.0"

scalaVersion := "2.12.6"

lazy val akkaVersion = "2.6.0-M2"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion,
  "com.typesafe.akka" %% "akka-stream" % akkaVersion,
  "com.typesafe.akka" %% "akka-stream-testkit" % akkaVersion,
  "com.typesafe.akka" %% "akka-http" % "10.1.8",
  "com.typesafe.akka" %% "akka-http-testkit" % "10.1.8" % Test,
  "com.typesafe.akka" %% "akka-http-spray-json" % "10.1.8",
  "org.scalatest" %% "scalatest" % "3.0.5" % "test"
)
