package com.sdp.scala.dp.facade

/**
  * Created by Basil on 06/02/2016.
  */
trait ScheduleServer {
  def startBooting()
  def readSystemConfigFile()
  def init()
  def initializeContext()
  def initializeListeners()
  def createSystemObjects()
  def releaseProcesses()
  def destroy()
  def destroySystemObjects()
  def destroyListeners()
  def destroyContext()
  def shutdown()
}
