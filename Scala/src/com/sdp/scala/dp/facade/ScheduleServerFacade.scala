package com.sdp.scala.dp.facade

/**
  * Created by Basil on 06/02/2016.
  */
class ScheduleServerFacade {

  private val server = new ScheduleServerImpl

  def startServer() = {
    server.startBooting()
    server.readSystemConfigFile()
    server.init()
    server.initializeContext()
    server.initializeListeners()
    server.createSystemObjects()
  }

  def stopServer() = {
    server.releaseProcesses()
    server.destroy()
    server.destroySystemObjects()
    server.destroyListeners()
    server.destroyContext()
    server.shutdown()
  }
}
