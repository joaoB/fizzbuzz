package services

object Messages {
  val fizz = "fizz"
  val buzz = "buzz"
  val fizzbuzz = "fizzbuzz"
  val lucky = "lucky"
}

trait FizzBuzz {

  private def isMultipleOf(n: Int, m: Int) = n % m == 0
  private def isMultipleFive(n: Int) = isMultipleOf(n, 5)
  private def isMultipleThree(n: Int) = isMultipleOf(n, 3)
  private def isMultipleFifteen(n: Int) = isMultipleOf(n, 15)

  def translate(index: Int) : String = index match {
    case elem if isMultipleFifteen(elem) => Messages.fizzbuzz
    case elem if isMultipleThree(elem) => Messages.fizz
    case elem if isMultipleFive(elem) => Messages.buzz
    case _ => index.toString
  }

  def translate(start : Int = 1, end : Int = 20) : List[String] = (start to end).toList map translate

}

trait Lucky extends FizzBuzz {
  override def translate(index: Int) : String =
    if (index.toString.contains("3"))
      Messages.lucky
  else
    super.translate(index)

}
