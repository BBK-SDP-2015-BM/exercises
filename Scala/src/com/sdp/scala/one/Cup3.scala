package com.sdp.scala.one

/**
 * Created by bmason06 on 28/01/2016.
 */
class Cup3 {
  var percentFull = 0
  val max = 100
  def add(increase:Int):Int = {
    percentFull += increase
    if(percentFull > max) {
      percentFull = max
    }
    if(percentFull < 0) {
      percentFull = 0
    }
    percentFull // Return this value
  }

}
