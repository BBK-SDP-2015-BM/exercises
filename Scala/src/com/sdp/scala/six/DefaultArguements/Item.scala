package com.sdp.scala.six.DefaultArguements

/**
 * Created by bmason06 on 11/02/2016.
 */
class Item(name: String, price: Double) {
  def cost(grocery: Boolean = false, medication: Boolean = false, taxRate: Double = 0.10): Double = {
    if (grocery || medication) price else price + price * taxRate
  }
}
