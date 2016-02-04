package com.sdp.scala.dp.abstractFactory

/**
 * Created by bmason06 on 04/02/2016.
 *
 * An abstract factory should be used to generate families of classes.
 */
object AbstractFactoryPattern extends App {

  var producer1 = new ParserFactoryProducer
  var factory1 = producer1.getFactory("NYC")
  var parser1 = factory1.getParserInstance("Order")
  parser1.parse()

  var producer2 = new ParserFactoryProducer
  var factory2 = producer2.getFactory("London")
  var parser2 = factory2.getParserInstance("Feedback")
  parser2.parse()

}
