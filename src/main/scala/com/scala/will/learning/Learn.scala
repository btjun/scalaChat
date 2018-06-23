package com.scala.will.learning

import java.io.{File, PrintWriter}

import scala.io.Source


object Learn extends App{

  val writer = new PrintWriter(new File("test.txt"))
  writer.println("ok")
  val path = getClass.getClassLoader.getResource("application.yml").getPath
  println(path)
  val s = Source.fromFile(path)
  s.getLines().foreach(println)
  s.close()
}
