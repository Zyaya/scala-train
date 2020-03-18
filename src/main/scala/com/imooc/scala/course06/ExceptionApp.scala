package com.imooc.scala.course06

object ExceptionApp extends App {
  try{
    var i = 10/0
  }catch {
    case e:ArithmeticException => println("除数不能为0")
    case e:Exception => println(e.getMessage)
  }finally {
// 释放资源
  }
}
