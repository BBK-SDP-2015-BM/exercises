package com.sdp.scala.dp.facade

/**
  * Created by Basil on 06/02/2016.
  */
object FacadePattern extends App {

  val server = new ScheduleServerFacade

  server.startServer()
  server.stopServer()

}
