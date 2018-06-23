package com.scala.will.controller

import com.scala.will.entity.Msg
import com.scala.will.service.ChatServiceImpl
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{GetMapping, RequestParam, RestController}

@RestController
class ChatController{

  @Autowired
  var chatServiceImpl:ChatServiceImpl = _

  @GetMapping(path = Array("chat"))
  def chat(@RequestParam question:String):Msg = {

    val msg = new Msg(1l,"FFFFFFFFFFFFFFFFFFFFFFFFFFF")
    msg.setId(1l)
    msg.setContent(chatServiceImpl.answer(question))

    msg
  }

}
