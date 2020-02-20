package com.imooc.scala.course04

object ConstrutorApp {

  def main(args: Array[String]): Unit = {

   // val person = new Person("zhangsan", 30)
//    println(person.name + " : " + person.age + " : " + person.school)
//
//    val person2 = new Person("yalin", 18, "male")
//    println(person2.name + " : " + person2.age + " : " + person2.gender)

    val student = new Student("yalin", 18, "Math")
    println(student.name + " : " + student.age + " : " + student.major + " : " + student.school)
    //println(student.name + " : " + student.age + " : " + student.major + " : " + person.school)
    println(student.toString) //点击查看object的代码
    println(student)
  }
}

//主构造器，如果把val去掉，上面就会报错，原因可能是name:String有默认的访问修饰符？？老师的提问
class Person(val name:String, val age:Int) {

  println ("Person Constructor enter...")

  val school = "ustc"
  var gender:String = _

  //附属构造器
  def this(name:String, age:Int, gender:String){
    this(name, age) //附属构造器的第一行代码必须要调用主构造器或其他构造器
    this.gender = gender
  }


  println ("Person Constructor leave")
}

//继承，继承过来的变量，如果主类没有，就要声明为val或var
class Student(name:String, age:Int, val major:String) extends Person(name, age){

  println ("Person Student enter...")

  override val school = "peking"
  override def toString: String = "Person: override def to String"

  println ("Person Student enter...")

}

//重写
