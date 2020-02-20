package com.imooc.scala.course04

object ApplyApp {
  def main(args: Array[String]): Unit = {
//    for (i <- 1 to 10){
//      ApplyTest.incr
//    }
//    println (ApplyTest.count) //10,说明object本身就是一个单例对象
  }

  val b = ApplyTest() // ==> Object.apply 调用的是object里面的apply方法 记住！默认调的是object里的apply
  println("----------")
  val c = new ApplyTest()
  println(c)
  c()

  //面试常考
  //类名（）==> Object.apply
  //对象（）==> Class.apply
}

//类ApplyTest是object的ApplyTest的伴生类，object是class的伴生对象
class ApplyTest
{
  def apply(): Unit ={
    println ("Class ApplyTest apply ....")
    new ApplyTest
  }
}

object ApplyTest{

  println ("Object ApplyTest enter ....")
  var count = 0
  def incr = count = count + 1

  //面试常考
  //最佳实践：在Object的apply方法中去new Class
  def apply(): Unit ={
    println ("Object ApplyTest apply ....")
    // 在object的apply中new class
    new ApplyTest
  }
  println ("Object ApplyTest leave ....")
}