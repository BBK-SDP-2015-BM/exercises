package com.sdp.scala.dp

/**
 * Created by bmason06 on 04/02/2016.
 */
class LowerTextFormatter extends TextFormatter {
  override def format(text: String): Unit = {
    printf("[%s]: %s\n", this.getClass.getSimpleName, text.toLowerCase)
  }
}
