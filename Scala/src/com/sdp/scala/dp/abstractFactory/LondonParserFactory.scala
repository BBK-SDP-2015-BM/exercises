package com.sdp.scala.dp.abstractFactory

/**
 * Created by bmason06 on 04/02/2016.
 */
class LondonParserFactory extends AbstractParserFactory {
  override def getParserInstance(parserType: String): XMLParser = parserType match {
    case "Error" => new LondonErrorXMLParser
    case "Feedback" => new LondonFeedbackXMLParser
    case "Order" => new LondonOrderXMLParser
    case "Response" => new LondonResponseXMLParser
    case _ => throw new RuntimeException("Parser does not exist")
  }
}
