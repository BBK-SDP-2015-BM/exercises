package com.sdp.scala.six.PatternMatching

/**
 * Created by bmason06 on 11/02/2016.
 */
import com.atomicscala.AtomicTest._

object MyForecastTest extends App {

  val forcaster = new Forecaster
/*
  forcaster.forecast(100) is "Sunny"
  forcaster.forecast(80) is "Mostly Sunny"
  forcaster.forecast(50) is "Partly Sunny"
  forcaster.forecast(20) is "Mostly Sunny"
  forcaster.forecast(0) is "Cloudy"
  forcaster.forecast(15) is "Unknown"*/

  val sunnyData = Vector(100,80,50,20,0,15)
  val expectedData = Vector("Sunny","Mostly Sunny","Partly Sunny","Mostly Sunny","Cloudy","Unknown")
  val combo = (sunnyData zip expectedData)

  for ((d, e) <- combo) {
    forcaster.forecast(d) is e
  }

}
