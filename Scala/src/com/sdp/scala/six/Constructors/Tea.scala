package com.sdp.scala.six.Constructors

/**
 * Created by bmason06 on 11/02/2016.
 */
class Tea(decaf: Boolean = false, name: String, sugar: Boolean = false, milk: Boolean = false) {

  def describe(): String = {
    var s = name
    if (decaf) s+=" decaf"
    if (milk) s+=" + milk"
    if (sugar) s+=" + sugar"
    return s
  }

  def calories(): Int = {
    var i = 0
    if (milk) i+=100
    if (sugar) i+=16
    return i
  }

}
