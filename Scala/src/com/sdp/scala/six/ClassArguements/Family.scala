package com.sdp.scala.six.ClassArguements

/**
 * Created by bmason06 on 11/02/2016.
 */
class Family(names: String*) {

  def familySize(): Int = {
    names.length
  }

}
