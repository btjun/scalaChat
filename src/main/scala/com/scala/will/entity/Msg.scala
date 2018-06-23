package com.scala.will.entity

import scala.beans.BeanProperty


class Msg {

  @BeanProperty var id:Long = -1
  @BeanProperty var content:String = ""

  def this(i:Long,c:String) = {
    this()
    this.id = i
    this.content = c
  }



}
