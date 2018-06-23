package com.scala.will.service


import com.scala.will.utils.QA
import org.springframework.stereotype.Service

@Service
class ChatServiceImpl extends ChatService{

  override def answer(q: String):String = {
    val result = new StringBuilder
    result.append("Please refer to ICP portal ->")
    val a = q.split(" ").toList.map(x => QA.qaMap.getOrElse(x.toLowerCase,"")).filter(!_.isEmpty)
    if (a.nonEmpty) {
      a.foreach(x => result.append("<br><a href=\"http://localhost/ash.html\" target=\"_blank\">").append(x).append("</a>"))
      result.toString()
    }else
      "Sorry, please try to use keyword like 'access/Linux/Window'"

  }
}
