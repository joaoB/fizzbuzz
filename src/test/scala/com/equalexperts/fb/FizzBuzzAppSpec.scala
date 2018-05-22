package com.equalexperts.fb

import org.scalatest.{FlatSpec, Matchers}

class FizzBuzzAppSpec extends FlatSpec with Matchers {

  "step2" should "render the correct output" in {
    val expected = "1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz"
    val result = FizzBuzzApp.step2.translate().mkString(" ")
    result should be (expected)

  }

  "step3" should "render the correct output" in {
    val expected = "1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz " +
      "fizz: 4 buzz: 3 fizzbuzz: 1 lucky: 2 integer: 10"
    val result = FizzBuzzApp.step3.translate().mkString(" ")
    result should be (expected)

  }

}
