package com.maxcoplan.week1

object Main extends App {
  println(SquareRoot.sqrt(10))
}


object SquareRoot {
  private val DELTA = 0.0001
  private def abs(x: Double) = if (x<0) -x else x

  // private def isGoodEnough(guess: Double, x: Double): Boolean = abs(guess*guess - x) < 0.001
  private def isGoodEnough(guess: Double, x: Double): Boolean = abs(x / guess - guess ) < DELTA

  private def sqrtIter(guess: Double, x: Double): Double =
    if (isGoodEnough(guess, x)) guess
    else sqrtIter(improve(guess,x),x)

  private def improve(guess: Double, x: Double) =
    (guess + x / guess) /2

  def sqrt(x: Double) = sqrtIter(1.0, x)
}
