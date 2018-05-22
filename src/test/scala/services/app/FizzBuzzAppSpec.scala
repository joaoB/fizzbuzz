package services.app

import app.FizzBuzzApp
import org.scalatest.{FlatSpec, Matchers}

class FizzBuzzAppSpec extends FlatSpec with Matchers {

  "step2" should "render the correct output" in {
    val expected = "1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz"
    val result = FizzBuzzApp.step2.translate().mkString(" ")
    result should be (expected)

  }
}