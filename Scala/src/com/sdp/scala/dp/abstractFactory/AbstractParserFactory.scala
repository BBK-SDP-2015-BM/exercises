package com.sdp.scala.dp.abstractFactory

/**
 * Created by bmason06 on 04/02/2016.
 */
trait AbstractParserFactory {
  def getParserInstance(parserType: String): XMLParser
}
