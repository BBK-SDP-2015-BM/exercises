package com.sdp.scala.dp.abstractFactory

/**
 * Created by bmason06 on 04/02/2016.
 */
class ParserFactoryProducer {

  def getFactory(factory: String): AbstractParserFactory = factory match {
    case "NYC" => new NYCParserFactory
    case "London" => new LondonParserFactory
    case _ => throw new RuntimeException("Factory does not exist")
  }

}
