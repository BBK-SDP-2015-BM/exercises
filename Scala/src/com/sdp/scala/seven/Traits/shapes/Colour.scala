package com.sdp.scala.seven.Traits.shapes

/**
 * Created by bmason06 on 18/02/2016.
 */
sealed trait Colour {

  var r = 0
  var g = 0
  var b = 0

  def Red: Colour = {
    new Colour {
      r = 255
    }
  }

  def Yellow: Colour = {
    new Colour {
      r = 255
      g = 255
    }
  }

  def Pink: Colour = {
    new Colour {
      r = 255
      g = 192
      b = 203
    }
  }

  def createColour(r:Int, g:Int, b:Int): Colour = {
    new Colour {
      this.r = r
      this.g = g
      this.b = b
    }
  }

  def lightOrDark(colour: Colour) = {
    val rgb = List(colour.r, colour.g, colour.b)
    if (rgb.reduce((sum, x) => sum + x) > 382) {
      println("dark")
    } else {
      println("light")
    }
  }

}
