package com.imooc.scala.course06

import scala.util.Random

object MatchApp extends App {

  val names = Array("Akiho Yoshizawa", "YuiHatano", "Aoi Sola")
  val name = names(Random.nextInt(names.length))

  name match {
    case "Akiho Yoshizawa" => println("吉老师")
    case "YuiHatano" => println("波老师")
    case _ => println("真不知道你们在说什么") // _ 代表没有匹配上
  }

  def judgeGrade(grade:String): Unit ={
    grade match {
      case "A" => println("Excellent")
      case "B" => println("Good")
      case "C" => println("Just so so ")
      case _ => println("Need harder")
    }
  }

  judgeGrade("A")
  judgeGrade("C")
  judgeGrade("D")

  def judgeGrade2(name:String, grade:String): Unit ={
    grade match {
      case "A" => println("Excellent")
      case "B" => println("Good")
      case "C" => println("Just so so ")
      case _ if(name == "lisi") => println(name + ", you are a good boy, but....")
      case _ if(name == "A") => println(name + ", you are good boy")
      case _ => println("Need harder")
    }
  }

  judgeGrade2("A","S") // A, you are good boy
  judgeGrade2("zhangsan" ,"D") // Need harder
  judgeGrade2("zhangsan","B") // Good
  judgeGrade2("lisi","D") // lisi, you are good boy,but....
  judgeGrade2("A","A") // Excellent
  judgeGrade2("B","D") // Need harder
  judgeGrade2("B","A") // Excellent
  judgeGrade2("D","B") //Good
  judgeGrade2("C","D") // Need Harder

  def greeting(array:Array[String]): Unit ={
    array match{
      case Array("zhangsan") => println("Hi:zhangsan")
      case Array(x,y) => println("Hi:" + x + " , " + y)
      case Array("zhangsan", _*) =>println("Hi:zhangsan and other friends...")
      case _ => println("Hi,everybody...")
    }
  }

  greeting(Array("zhangsan","lisi","wangwu"))

  def greeting2(list:List[String]): Unit ={
    list match{
      case "zhangsan"::Nil => println("Hi:zhangsan")
      //case x::y::tail => println("Hi" + x + " , " + y)
      case _=> println("Hi,everybody...")
    }
  }

  greeting2(List("zhangsan","lisi"))
  greeting2(List("zhangsan"))

  def matchType(obj:Any): Unit ={
    obj match {
      case x:Int => println("Int")
      case s:String => println("String")
      case m:Map[_,_] =>m.foreach(println)
      case _ => println("other type")
    }
  }

  matchType("1")
  matchType(Map("name"->"PK"))


  def caseclassMatch(person: Person): Unit ={
    person match {
      case CTO(name,floor) => println("CTO name is " + name + ",floor is:")
      case Emploee(name,floor) => println("Employee name is: " + name + ",floor")
      case _ => println("other")
    }
  }

  //case class
  class Person //一定要传一个顶层的进来
  case class CTO(name:String, floor:String) extends Person
  case class Emploee(name:String, floor:String) extends Person
  case class Other(name:String) extends Person

  caseclassMatch(CTO("yalin","22"))
  caseclassMatch(Emploee("zhangsan","2"))
  caseclassMatch(Other("other"))

  val grades = Map("PK" -> "A","zhangsan" ->"C")

  def getGrade(name: String): Unit ={
    val grade = grades.get(name) //获取的是Option，Option下有Some、None
    grade match{
      case Some(grade) => println("your grade is" + grade)
      case None => println("Sorry")
    }
  }

  getGrade("PK")
  getGrade("zhangsan")
  getGrade("lisi")
}

