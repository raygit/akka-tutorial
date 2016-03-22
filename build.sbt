name := "akka-tutorial"

fork in run := false // no forking when running apps

scalaVersion := "2.11.7"

javaHome := Some(file("/Library/Java/JavaVirtualMachines/jdk1.7.0_67.jdk/Contents/Home"))

libraryDependencies ++= Seq("com.typesafe.akka" %% "akka-actor" % "2.4.2",
"com.typesafe.akka" % "akka-stream-experimental_2.11" % "2.0.3",
"com.typesafe.akka" % "akka-http-core-experimental_2.11" % "2.0.3",
"com.typesafe.akka" % "akka-http-experimental_2.11" % "2.0.3")

