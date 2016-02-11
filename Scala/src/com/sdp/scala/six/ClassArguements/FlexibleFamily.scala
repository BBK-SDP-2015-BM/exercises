package com.sdp.scala.six.ClassArguements

/**
 * Created by bmason06 on 11/02/2016.
 */
class FlexibleFamily(mother: String, father: String, children: String*) {
  def familySize(): Int = {
    children.length + 2
  }
}
