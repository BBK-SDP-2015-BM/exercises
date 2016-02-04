package com.sdp.scala.dp.builder

/**
 * Created by bmason06 on 04/02/2016.
 */
class SedanCarBuilder extends CarBuilder {
  override def getCar(): Car = {
    val car = new Car("Sedan")
    car.bodyStyle = "External dimensions: overall length (inches): 202.9,\noverall width (inches): 76.2, overall height (inches): 60.7,\nwheelbase (inches): 112.9, front track (inches): 65.3,\nrear track (inches): 65.5 and curb to curb turning circle (feet): 39.5"
    car.power = "285 hp @ 6,500 rpm; 253 ft lb of torque @ 4,000 rpm"
    car.engine = "3.5L Duramax V 6 DOHC"
    car.breaks = "Four-wheel disc brakes: two ventilated. Electronic brake distribution"
    car.seats = "Front seat centre armrest.Rear seat centre armrest.Split-folding rear seats"
    car.windows = "Laminated side windows.Fixed rear window with defroster"
    car.fuelType = "Diesel 19 MPG city, 29 MPG highway, 23 MPG combined and 437 mi. range"
    return car
  }
}
