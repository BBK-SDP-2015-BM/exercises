package com.sdp.scala.dp.abstractFactory

/**
 * Created by bmason06 on 04/02/2016.
 */
class LondonErrorXMLParser extends XMLParser {
  override def parse(): Unit = {
    println("London parsing Error XML")
  }
}
