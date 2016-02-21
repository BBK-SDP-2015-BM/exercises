package com.sdp.scala.seven.Traits.divison

/**
  * Created by Basil on 21/02/2016.
  */
object Divide {

  def apply(x: Int, y: Int): DivisionResult = y match {
    case 0 => new Infinite
    case _ => new Finite(x/y)
  }

}
