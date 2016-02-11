package com.sdp.scala.six.DefaultArguements

/**
 * Created by bmason06 on 11/02/2016.
 */
class Planet(name: String, description: String, moons: Int = 1) {

  def hasMoon(): Boolean = {
    if (moons > 0) true else false
  }

}
