package com.sdp.scala.eight.generics2

/**
  * Created by Basil on 01/03/2016.
  */
object MainApp extends App {

  val example = Pair(1, Pair(2, Pair(3, Pair(4, End))))

  assert(example.length == 4)
  assert(example.double.sum == 20)
  assert(example.sum == 10)
  assert(example.product == 24)

  //assert(example.double.sum)

  assert(example.length2 == 4)
  //assert(example.double.sum == 20)
  assert(example.sum2 == 10)
  assert(example.product2 == 24)

}
