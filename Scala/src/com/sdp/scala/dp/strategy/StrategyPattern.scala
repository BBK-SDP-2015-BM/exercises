package com.sdp.scala.dp.strategy

/**
 * Created by bmason06 on 04/02/2016.
 *
 * The strategy pattern encapsulates behavior. This should be used when multiple classes differ only in the way that they behave.
 *
 */
object StrategyPattern extends App {

  var formatter1 = new CapTextEditor
  var editor = new TextEditor(formatter1)
  editor.publishText("Testing text in caps formatter")

  var formatter2 = new LowerTextFormatter
  editor = new TextEditor(formatter2)
  editor.publishText("Testing text in lower formatter")

}
