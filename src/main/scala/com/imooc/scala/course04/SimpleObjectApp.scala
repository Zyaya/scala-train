package com.imooc.scala.course04

object SimpleObjectApp {

  def main(args: Array[String]): Unit = {
    val person = new People()
    var person2 = new People()
    person.name = "Messi"
    println(person.name + ".." + person.age)
    println(person2.name + ".." + person.age)
    println("invoke eat method: " + person.eat)
    person.watchFootball("Barcelona")
    person.printInfo()

  }

  class People{

    //定义属性
    //var name:String =""
    var name:String = _ //  占位符
    val age:Int = 10

    private [this] val gender = "male" //私有化定义后，只能在类里使用变量gender，但是可以调用方法
    def printInfo(): Unit ={
      println("gender: " + gender)
    }

    def eat():String ={
      name + " eat...."
    }

    def watchFootball(teamName: String): Unit ={
      println(name + " is watching match of " + teamName)
    }

  }
}
