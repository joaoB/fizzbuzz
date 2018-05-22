package app

import services.{FizzBuzz, Lucky, Report}

object FizzBuzzApp extends App {

  lazy val step1 = new FizzBuzz {}
	println("Step 1:")
  println("Running the program with a range from 1-20")
  println(step1.translate().mkString(" "))
  println("=" * 25)

  lazy val step2 = new FizzBuzz with Lucky
  println("Step 2:")
  println("Running the program with a range from 1-20")
  println(step2.translate().mkString(" "))
  println("=" * 25)


  lazy val step3 = new FizzBuzz with Lucky with Report
  println("Step 3:")
  println("Running the program with a range from 1-20")
  println(step3.translate().mkString(" "))
  println("=" * 25)

}
