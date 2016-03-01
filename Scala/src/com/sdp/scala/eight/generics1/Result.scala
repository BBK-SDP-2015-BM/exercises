package com.sdp.scala.eight.generics1

/**
  * Created by Basil on 29/02/2016.
  */
sealed trait Result[A]
case class Success[A](result: A) extends Result[A]
case class Failure[A](reason: String) extends Result[A]
