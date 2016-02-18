package com.sdp.scala.seven.MapReduce

/**
 * Created by bmason06 on 18/02/2016.
 */
import com.atomicscala.AtomicTest._

object MainApp extends App {

  // 1.
  // a. Map
  var v = Vector(1,2,3,4)
  v.map(n => (11 * n) + 10) is Vector(21,32,43,54)

  // b. foreach
  v = Vector(1,2,3,4)
  v.foreach(n => (11 * n) + 10) // is Vector(21,32,43,54)
  println(v.toString()) // Vector(1, 2, 3, 4) unchanged

  // c. for
  v = Vector(1,2,3,4)

  v = for(n <- v) yield (n * 11) + 10
  v is Vector(21,32,43,54)

  // 2.
  v = Vector(1,2,3,4)

  v = for(n <- v) yield n + 1
  v is Vector(2,3,4,5)

  // 3.
  v = Vector(1,10,100,1000)
  v.reduce((sum, n) => sum + n) is 1111

  v = Vector(1,10,100,1000)
  var sum = 0
  for(n <- v) {
    sum += n
  }
  sum is 1111

  // 4.
  sumIt(1, 2, 3) is 6
  sumIt(45, 45, 45, 60) is 195

  def sumIt(in: Int*): Int = {
    in.reduce((sum, n) => sum + n)
  }

}
