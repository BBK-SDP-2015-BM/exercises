package com.sdp.scala.dp.facade

/**
  * Created by Basil on 06/02/2016.
  */
class ScheduleServerImpl extends ScheduleServer {
  override def startBooting(): Unit = {println("Starting boot...")}

  override def destroyContext(): Unit = {println("Destroying context...")}

  override def shutdown(): Unit = {println("Shutting down...")}

  override def initializeListeners(): Unit = {println("Initializing listeners...")}

  override def init(): Unit = {println("Initializing...")}

  override def createSystemObjects(): Unit = {println("Creating system objects...")}

  override def destroy(): Unit = {println("destroying...")}

  override def destroySystemObjects(): Unit = {println("Destroying system objects...")}

  override def releaseProcesses(): Unit = {println("Releasing processes...")}

  override def readSystemConfigFile(): Unit = {println("Reading system config file...")}

  override def initializeContext(): Unit = {println("Initializing context...")}

  override def destroyListeners(): Unit = {println("Destroying listeners...")}
}
