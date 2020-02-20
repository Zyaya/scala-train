package com.imooc.scala.course05

object MapApp extends App{

  val a = Map("yalin" -> 18, "shanchen" -> 28)

  val b = scala.collection.mutable.Map("yalin" -> 18 ,"shanchen" -> 28)
  b("lisi") = 9
  b += ("hello" -> 10)
  b ++= Map("hi" -> 20)

  for((key, value) <- b){
    println(key + ":" + value)
  }

  println(b.keySet)
  println(b.values)
  println(b.valuesIterator)
  println(b.keys)

  for (key <- b.keySet){
    println(key + ":" + b.getOrElse(key, 9))
  }

  // _表示占位符
  for ((key,_) <- b){
    println(key + ":" + b.getOrElse(key, 9))
  }


  val c = scala.collection.mutable.HashMap[String,Int]()

  //源码特别多，根据key="yalin"取对应value，如果没有这个key，就用9替代value
  b.getOrElse("yalin", 9)
}
