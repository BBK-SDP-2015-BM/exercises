package com.sdp.scala.dp.builder

/**
 * Created by bmason06 on 04/02/2016.
 */
class SportsCarBuilder extends CarBuilder{
  override def getCar(): Car = {
    val car = new Car("Sports")
    car.bodyStyle = "External dimensions: overall length (inches): 192.3,\noverall width (inches): 75.5, overall height (inches): 54.2,\nwheelbase (inches): 112.3, front track (inches): 63.7,\nrear track (inches): 64.1 and curb to curb turning circle (feet): 37.7"
    car.power = "323 hp @ 6,800 rpm; 278 ft lb of torque @ 4,800 rpm"
    car.engine = "3.6L V 6 DOHC and variable valve timing"
    car.breaks = "Four-wheel disc brakes: two ventilated. Electronic brake distribution.\nStability control"
    car.seats = "Driver sports front seat with one power adjustments manual height,\nfront passenger seat sports front seat with one power adjustments"
    car.windows = "Front windows with one-touch on two windows"
    car.fuelType = "Petrol 17 MPG city, 28 MPG highway, 20 MPG combined and 380 mi. range"
    return car
  }
}
