# Scala-Spark sample project

This is a boilerplate project of Spark 3.3 with Scala 2.12 and sbt. The goal of this repository is reuse the structure and configuration for further projects.

To test the configuration, this sample project reads a CSV (mock data) using a Spark DataFrame and show some content. 

## Dependencies

* Spark 3.3.1
* Java 11.
  * Spark runs on Java 8/11/17 and Scala 2.12/2.13. This sample use Java 11 because there is a [bug in Java 17 with Spark 3.3.1](https://stackoverflow.com/questions/73465937/apache-spark-3-3-0-breaks-on-java-17-with-cannot-access-class-sun-nio-ch-direct).
* Scala 2.13
* sbt 1.8.2

## Run

`sbt run compile`