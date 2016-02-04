package com.sdp.scala.dp.builder

/**
 * Created by bmason06 on 04/02/2016.
 */
class Car(carType: String) {

  var body = ""
  var bodyStyle = ""
  var power = ""
  var engine = ""
  var breaks = ""
  var seats = ""
  var windows = ""
  var fuelType = ""

  override def toString = s"Car Type: $carType\n Body: $body\n Style: $bodyStyle\n Power: $power\n Engine: $engine\n Breaks: $breaks\n Seats: $seats\n Windows: $windows\n Fuel: $fuelType)"
}
