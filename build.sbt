name := "Play2Skeleton"
 
version := "1.0" 
      
lazy val `play2skeleton` = (project in file(".")).enablePlugins(PlayScala)

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"
      
resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"
      
scalaVersion := "2.12.6"

libraryDependencies ++= Seq(
  jdbc,
  ehcache,
  ws,
  guice,
  "io.getquill" %% "quill-jdbc" % "2.5.4",
  "org.scalatestplus.play" %% "scalatestplus-play" % "3.0.0" % "test"
)

      