package com.sdp.scala.eight.generics2

/**
  * Created by Basil on 01/03/2016.
  */
sealed trait IntList {

  def length: Int =
    this match {
      case End => 0
      case Pair(hd, tl) => 1 + tl.length
    }

  def double: IntList =
    this match {
      case End => End
      case Pair(hd, tl) => Pair(hd * 2, tl.double)
    }

  def product: Int =
    this match {
      case End => 1
      case Pair(hd, tl) => hd * tl.product
    }

  def sum: Int = this match {
    case End => 0
    case Pair(hd, tl) => hd + tl.sum
  }

  def fold(end: Int, f: (Int, Int) => Int): Int =
    this match {
      case End => end
      case Pair(hd, tl) => f(hd, tl.fold(end, f))
    }

  def length2: Int = fold(0, (x, y) => 1 + y)
  def sum2: Int = fold(0, (x, y) => x + y)
  def product2: Int = fold(1, (x, y) => x * y)

}

final case object End extends IntList
final case class Pair(head: Int, tail: IntList) extends IntList



