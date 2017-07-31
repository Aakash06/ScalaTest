lazy val common = Seq {
  name := "Scala_capstone"
  version := "1.0"
  scalaVersion := "2.12.3"
  libraryDependencies += "org.scalatest" % "scalatest_2.12" % "3.0.3" % "test"
}

lazy val inventory_sdk = project.
  dependsOn(inventory)
  .settings(common)

lazy val inventory = project.
  dependsOn(inventory)
  .settings(common)

lazy val checkoutServices = project.
  dependsOn(inventory)
  .settings(common)

lazy val notificationServices= project.
  dependsOn(inventory)
  .settings(common)

lazy val root = project.in(file(".")).aggregate(inventory,checkoutServices,notificationServices,inventory_sdk)