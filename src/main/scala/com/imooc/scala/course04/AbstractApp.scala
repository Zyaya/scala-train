package com.imooc.scala.course04

object AbstractApp {

  def main(args: Array[String]): Unit = {

  val student = new Student2()
    println(student.name)
  }
}

/**
  * 类的一个或者多个方法没有完整的实现（只有定义，没有实现）
  */

abstract class Person2{
  def speak

  val name:String
  val age:Int
}

class Student2 extends Person2{
  override def speak: Unit = "speak override"

  override val name: String = "shanchen"
  override val age: Int = 25
}