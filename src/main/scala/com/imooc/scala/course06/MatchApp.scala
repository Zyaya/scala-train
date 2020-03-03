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

}
