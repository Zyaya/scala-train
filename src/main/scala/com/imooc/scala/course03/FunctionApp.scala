package com.imooc.scala.course03

//hello
object FunctionApp {

  def main(args: Array[String]): Unit = {

    println(add(2,3))
    println(three())
    println(three) //没有入参的函数，调用时括号是可以省略的
    sayHello()
    sayHello
    sayName()
    sayName("shanchen")
    loanConf("spark-production.conf")
    println(speed(100,10))
    println(speed(distance = 100, time = 10))
    println(speed(time = 10, distance = 200))
    println(sum(1, 2, 3, 4, 5))
    Range(1,10,2)
    1.until(10)

    for (i <- 1 to 10 if i % 2 == 0){
      println(i)
    }

    val courses = Array("Hadoop","SparkSQL","Flink")
    for (course <- courses ){
      println(course)
    }

    //course 其实就是courses里面的每一个元素
    //==> 就是将左边的course作用上一个函数，变成另外一个结果
    //println就是作用到course上的一个函数
    courses.foreach(course => println(course))

    var (num, sum2) = (100, 0)
    while (num > 0){
      sum2 = sum2 + num
      num = num - 1
    }
    println(sum2)

  }



  def add(x:Int, y:Int):Int = {
    x + y
  }

  def three() = 1 + 2

  def sayHello(): Unit ={
    println("Say Hello...")
  }

  def sayName(name:String = "yalin"): Unit ={
    println(name)
  }

  def loanConf(conf:String = "spark-defaults.conf"): Unit ={
    println(conf)
  }

  def speed(distance:Float, time:Float):Float = {
    distance/time
  }

  def sum(numbers:Int*): Int = {
    var result = 0
    for (number <- numbers) {
      result += number
    }
    result
  }
}
