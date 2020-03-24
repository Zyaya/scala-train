package com.imooc.scala.course09

import java.io.{FileInputStream, InputStreamReader}

import scala.xml.XML

object XMLApp {

  def main(args: Array[String]): Unit = {

    loadXML()
  }

  def loadXML(): Unit ={
    val xml1 = XML.load(this.getClass.getClassLoader.getResource("test.xml"))
    println(xml1)

    val xml2 = XML.load(new FileInputStream("/Users/zhangyalin/IdeaProjects/scala-train/src/main/resources/test.xml"))
    println(xml2)

    val xml3 = XML.load(
      new InputStreamReader(
        new FileInputStream("/Users/zhangyalin/IdeaProjects/scala-train/src/main/resources/test.xml")
      )
    )
    println(xml3)



  }

}
