package com.sdp.scala.eight.generics2

/**
  * Created by Basil on 01/03/2016.
  */
object MainApp extends App {

  val example = Pair(1, Pair(2, Pair(3, End)))

  assert(example.length == 3)
  assert(example.double.sum == 12)
  assert(example.sum == 6)
  assert(example.product == 6)

}
