enablePlugins(ScalaJSPlugin)

ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.12"

lazy val root = (project in file("."))
  .settings(
    name := "my-cv-new"
  )

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "2.8.0",
  "com.lihaoyi" %%% "scalatags" % "0.12.0"
)
siteSourceDirectory := target.value / "scala-2.13" / "my-cv-new-opt"
makeSite / mappings ++= Seq(
  file("src/main/resources/index.html") -> "index.html",
  file("src/main/resources/pure-min.css") -> "pure-min.css",
  file("src/main/resources/photo.jpeg") -> "photo.jpeg",
  file("src/main/resources/custom-styles.css") -> "custom-styles.css"
)
