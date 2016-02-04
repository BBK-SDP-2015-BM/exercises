package com.sdp.scala.dp.abstractFactory

/**
 * Created by bmason06 on 04/02/2016.
 */
class NYCParserFactory extends AbstractParserFactory {
  override def getParserInstance(parserType: String): XMLParser = parserType match {
      case "Error" => new NYCErrorXMLParser
      case "Feedback" => new NYCFeedbackXMLParser
      case "Order" => new NYCOrderXMLParser
      case "Response" => new NYCResponseXMLParser
      case _ => throw new RuntimeException("Parser does not exist")
  }
}
