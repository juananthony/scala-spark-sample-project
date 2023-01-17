package io.juananton.github.scalaSparkSample

import org.apache.spark.sql.SparkSession

object SampleApp {

  def main(args: Array[String]): Unit = {

    implicit val spark = SparkSession
      .builder()
      .master("local[*]")
      .appName("Sample Scala-Spark project")
      .getOrCreate()

    val users = spark.read.format("csv").option("header", true).load("./sampleData/UsersMock.csv")

    users.show()
  }
}
