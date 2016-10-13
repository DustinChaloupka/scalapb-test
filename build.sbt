name := "scalapb-test"

scalaVersion := "2.11.8"

PB.targets in Compile := Seq(
  scalapb.gen() -> (sourceManaged in Compile).value
)

libraryDependencies ++= Seq(
  "io.grpc" % "grpc-netty" % "1.0.1",
  "com.trueaccord.scalapb" %% "scalapb-runtime-grpc" % "0.5.43",
  "com.google.api.grpc" % "googleapis-common-protos" % "0.0.3" % "protobuf"
)
