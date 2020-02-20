package com.imooc.scala.course05

//面试常考 Nil 就是一个空的集合
//面试常考 head、tail
object ListApp extends App{

//  val l = List(1,2,3,4,5) //定长
//  println(l)
//
//  val l2 = 1 :: Nil // 两个冒号，把1当作head，把Nil当作tail，拼成一个集合
//  val l3 = 1 :: l2
//  val l4 = l :: l2 :: l3
//
//  // 变长
//  val l5 = scala.collection.mutable.ListBuffer[Int]()
//  // 不能 scala.collection.mutable.ListBuffer[Int]，因为调的是apply方法。(_)或者()
//  l5 += 2
//  l5 += (3,4,5)
//  l5 ++= List(6,7,8,9)
//
//  l5 -= 2
//  l5 -= (6,7)
//  l5 --= List(4,5,3)
//
//  println(l5.head)
//  println(l5.tail)

  // :_* 可以把sequence 转换成可变参数（参数个数可以变化，像args）
  def sum(nums:Int*):Int = {
    if(nums.length == 0){
      0
    } else{
      nums.head + sum(nums.tail:_*)
    }
  }

  println(sum())
  println(sum(1,2,3,4))

  def test(nums:Int*):Unit = {
    for (i <- 0 until nums.length) {
      println(nums(i))
    }
  }

  test(55,66,77,88)

  val set = scala.collection.mutable.Set[Int]()
  set += 1
  set += (1, 1)
  set ++= Set(2, 3, 4)

}
