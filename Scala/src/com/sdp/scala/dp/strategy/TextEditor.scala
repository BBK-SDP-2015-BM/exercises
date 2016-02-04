package com.sdp.scala.dp.strategy

/**
 * Created by bmason06 on 04/02/2016.
 */
class TextEditor(formatter: TextFormatter) {

  def publishText(text: String) = {
    formatter.format(text)
  }

}
