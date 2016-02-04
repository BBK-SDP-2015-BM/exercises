package com.sdp.scala.dp.abstractFactory

/**
 * Created by bmason06 on 04/02/2016.
 */
class NYCErrorXMLParser extends XMLParser {
  override def parse(): Unit = {
    println("NYC parsing Error XML")
  }
}
