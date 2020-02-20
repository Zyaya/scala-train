package com.imooc.scala.course04

object Test {

  def main(args: Array[String]): Unit = {

    val name = "yalin"
    val age = 18

    val c = new yalin
    println(c)
    println(c.toString)
  }

  class yalin{

  }
// 主构造器、附属构造器联系
//  class Zhu(name:String, age:Int){
//     println (name + " " + age)
//
//
//    def this () = this(new String(), new Int())
//
//  }
}
