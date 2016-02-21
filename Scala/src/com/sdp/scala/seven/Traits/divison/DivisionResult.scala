package com.sdp.scala.seven.Traits.divison

/**
  * Created by Basil on 21/02/2016.
  */
sealed trait DivisionResult {

}

class Finite(result: Int) extends DivisionResult {

}

class Infinite extends DivisionResult {

}
