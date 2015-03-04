name := "freechickfila"

version := "1.0"

lazy val `freechickfila` = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq( javaJdbc , javaEbean , cache , javaWs )

libraryDependencies += "net.sourceforge.htmlunit" % "htmlunit" % "2.15"

libraryDependencies += "org.projectlombok" % "lombok" % "1.16.2"


unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )  