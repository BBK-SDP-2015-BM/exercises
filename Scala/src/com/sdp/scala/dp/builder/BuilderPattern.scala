package com.sdp.scala.dp.builder

/**
 * Created by bmason06 on 04/02/2016.
 */
object BuilderPattern extends App {

  val builder = new SedanCarBuilder
  //val director = new CarDirector()
  val car = builder.getCar()
  println(car)

}
