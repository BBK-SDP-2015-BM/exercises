package com.sdp.scala.dp.abstractFactory

/**
 * Created by bmason06 on 04/02/2016.
 */
class NYCOrderXMLParser extends XMLParser {
  override def parse(): Unit = {
    println("NYC parsing order XML")
  }
}
