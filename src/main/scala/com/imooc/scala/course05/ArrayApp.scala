package com.imooc.scala.course05

object ArrayApp extends App{
// object ArrayApp
//  def main(args: Array[String]): Unit = {
//    println("test")
//  }
  println("test")

  val a = new Array[String](5)
  a(1) = "hello"

  val b = Array("hadoop", "spark", "storm") //高端写法，底层调用了apply

  val c = Array(2,3,4,5,6,1,5,7,4)
  c.sum
  c.min
  c.max
  c.mkString

  //  变长数组
  val d = scala.collection.mutable.ArrayBuffer[Int]()
  d += 1
  d += 2
  d ++= Array(7,8,9) //两个加号，因为加的是数组
  d.insert(0, 0)
  d.remove(1)
  d.remove(0, 3)
  d.trimEnd(2)

  d.toArray.mkString

  for (i <- 0 until d.length){
    println(d(i))
  }

  //  用的最多的，等同循环
  for (elc <- d) {
    println(elc)
  }
  println(d)



}
