package com.sdp.scala.six.PatternMatching

/**
 * Created by bmason06 on 11/02/2016.
 */
object Forecaster {

  def forecast(temp: Int): String = temp match {
    case 100 => "Sunny"
    case 80 => "Mostly Sunny"
    case 50 => "Partly Sunny"
    case 20 => "Mostly Sunny"
    case 0 => "Cloudy"
    case _ => "Unknown"
  }

}

