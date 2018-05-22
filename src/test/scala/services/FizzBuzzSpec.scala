package services

import org.scalatest._

class FizzBuzzSpec extends FlatSpec with Matchers {

  private val f = new FizzBuzz {}
  it should "return the number" in {
    f.translate(1) should be ("1")
  }

  it should "‘fizz’ for numbers that are multiples of 3" in {
    val multiples = List(3, 6)
    multiples map { multiple =>
      f.translate(multiple) should be (Messages.fizz)
    }
  }

  it should "‘buzz’ for numbers that are multiples of 5" in {
    val multiples = List(5, 10)
    multiples map { multiple =>
      f.translate(multiple) should be (Messages.buzz)
    }
  }

  it should "‘fizzbuzz’ for numbers that are multiples of 15" in {
    val multiples = List(15, 30)
    multiples map { multiple =>
      f.translate(multiple) should be (Messages.fizzbuzz)
    }
  }

  it should "work for the provided result" in {
    val numbers = (1 to 20).toList
    val expected = "1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz"
    val result = (numbers map f.translate).mkString(" ")
    result should be (expected)
  }

  it should "work for the provided result with default params" in {
    val expected = "1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz"
    val result = f.translate().mkString(" ")
    result should be (expected)
  }


}
