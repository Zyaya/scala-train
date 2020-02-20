package com.imooc.scala.course05

object TupleApp extends App{

  val a = (1,2,3,4,5)
  println(a._1)

  // 获取元组长度 productArity
  for(i <- 0 until(a.productArity)){
    println(a.productElement(i))
  }

  val hostPort = ("localhost", 8080)
  hostPort._1
  hostPort._2
}
