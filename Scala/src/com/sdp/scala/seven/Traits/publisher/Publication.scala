package com.sdp.scala.seven.Traits.publisher

/**
  * Created by Basil on 21/02/2016.
  */
sealed trait Publication {

}

abstract class Book extends Publication with Authored {

}

abstract class Periodical(volume: Int, issue: Int) extends Publication with Edited {

}