package com.sdp.scala.eight.generics1

/**
  * Created by Basil on 29/02/2016.
  */
object MainApp extends App {

  val example1 = Pair(1, Pair(2, Pair(3, End())))

  assert(example1.length == 3)
  assert(example1.tail.length == 2)
  assert(End().length == 0)

  val example2 = Pair(1, Pair(2, Pair(3, End())))
  assert(example2.contains(3) == true)
  assert(example2.contains(4) == false)
  assert(End().contains(0) == false)

  /*val example3 = Pair(1, Pair(2, Pair(3, End())))
  assert(example3(0) == 1)
  assert(example3(1) == 2)
  assert(example3(2) == 3)
  assert(try {
    example3(3)
    false
  } catch {
    case e: Exception => true
  })*/

  val example4 = Pair(1, Pair(2, Pair(3, End())))
  assert(example4(0) == Success(1))
  assert(example4(1) == Success(2))
  assert(example4(2) == Success(3))
  assert(example4(3) == Failure("Index out of bounds"))

}
