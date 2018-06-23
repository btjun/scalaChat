package com.scala.will

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(Array("com.scala.will"))
class Application{

}

object Application {

  def main(args: Array[String]): Unit = {
    SpringApplication.run(classOf[Application], args:_*)
  }
}
