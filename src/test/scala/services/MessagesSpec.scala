package services

import org.scalatest._

class MessagesSpec extends FlatSpec with Matchers {

  "Messages.fizz" should "‘fizz’ for numbers" in {
    Messages.fizz should be ("fizz")
  }

  "Messages.buzz" should "‘buzz’ for numbers" in {
    Messages.buzz should be ("buzz")
  }

  "Messages.fizzbuzz" should "‘fizzbuzz’ for numbers" in {
    Messages.fizzbuzz should be ("fizzbuzz")
  }

  "Messages.lucky" should "‘lucky’" in {
    Messages.lucky should be ("lucky")
  }


}
