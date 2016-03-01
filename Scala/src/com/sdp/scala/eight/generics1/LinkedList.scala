package com.sdp.scala.eight.generics1

/**
  * Created by Basil on 29/02/2016.
  */
sealed trait LinkedList[T] {

  def length(): Int = this match {
    case End() => 0
    case Pair(head, tail) => 1 + tail.length
  }

  def contains(item: T): Boolean = this match {
    case End() => false
    case Pair(head, tail) => item == head || tail.contains(item)
  }

  def apply(n: Int): Result[T] = this match {
    case End() => Failure("Index out of bounds")
    case Pair(head, tail) => {
      if (n == 0) Success(head)
      else tail.apply(n-1)
    }
  }

}

final case class End[T]() extends LinkedList[T]

final case class Pair[T](head: T, tail: LinkedList[T]) extends LinkedList[T]
