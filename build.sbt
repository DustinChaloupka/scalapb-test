name := "scalapb-test"

scalaVersion := "2.11.8"

PB.targets in Compile := Seq(
  scalapb.gen() -> (sourceManaged in Compile).value
)

libraryDependencies ++= Seq(
  // Removing this dependency gives:
  //   google/api/annotations.proto: File not found.
  //   test.proto: Import "google/api/annotations.proto" was not found or had errors.
  "com.google.api.grpc" % "googleapis-common-protos" % "0.0.3" % "protobuf"
)
