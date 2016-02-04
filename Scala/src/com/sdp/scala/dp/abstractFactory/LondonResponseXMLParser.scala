package com.sdp.scala.dp.abstractFactory

/**
 * Created by bmason06 on 04/02/2016.
 */
class LondonResponseXMLParser extends XMLParser{
  override def parse(): Unit = {
    println("London parsing Response XML")
  }
}
