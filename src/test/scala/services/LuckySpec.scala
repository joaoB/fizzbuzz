package services

import org.scalatest._

class LuckySpec extends FlatSpec with Matchers {

  trait Dummy extends FizzBuzz {
    override def translate(index: Int) = "dummy"
  }

  private val lucky = new Dummy with Lucky

  it should "return delegate to super for number without 3" in {
    lucky.translate(1) should be ("dummy")
  }

  it should "return lucky if number has a 3" in {
    lucky.translate(3) should be (Messages.lucky)
    lucky.translate(33) should be (Messages.lucky)
    lucky.translate(13) should be (Messages.lucky)
    lucky.translate(3000) should be (Messages.lucky)
    lucky.translate(11113) should be (Messages.lucky)
  }



}
