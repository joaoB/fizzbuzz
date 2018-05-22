package services

object Messages {
  val fizz = "fizz"
  val buzz = "buzz"
  val fizzbuzz = "fizzbuzz"
  val lucky = "lucky"
  val integer = "integer"
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

trait Report extends FizzBuzz {

  case class Report(fizz: Int = 0, buzz: Int = 0, fizzBuzz : Int = 0, lucky: Int = 0, integer: Int = 0) {
    override def toString: String =
      s"${Messages.fizz}: $fizz " +
        s"${Messages.buzz}: $buzz " +
        s"${Messages.fizzbuzz}: $fizzBuzz " +
        s"${Messages.lucky}: $lucky " +
        s"${Messages.integer}: $integer"
  }

  override def translate(start : Int = 1, end : Int = 20) : List[String] = {
    val translated = super.translate(start, end)
    val r = translated.foldLeft(Report()) {
      case (acc, Messages.fizz)     => acc.copy(fizz = acc.fizz + 1)
      case (acc, Messages.buzz)     => acc.copy(buzz = acc.buzz + 1)
      case (acc, Messages.fizzbuzz) => acc.copy(fizzBuzz = acc.fizzBuzz + 1)
      case (acc, Messages.lucky)    => acc.copy(lucky = acc.lucky + 1)
      case (acc, _)                 => acc.copy(integer = acc.integer + 1)
    }
    translated :+ r.toString
  }

}