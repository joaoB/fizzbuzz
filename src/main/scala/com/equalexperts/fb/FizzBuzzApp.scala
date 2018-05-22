package com.equalexperts.fb

object FizzBuzzApp extends App {

  val step1 = new FizzBuzz {}
	println("Step 1:")
  println("Running the program with a range from 1-20")
  println(step1.translate().mkString(" "))
  println("=" * 25)


}
