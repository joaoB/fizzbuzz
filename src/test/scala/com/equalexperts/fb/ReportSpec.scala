package com.equalexperts.fb

import org.scalatest._

class ReportSpec extends FlatSpec with Matchers {

  class Dummy(value: String) extends FizzBuzz {
    override def translate(index: Int) = value
  }

  private def reportie(value: String) = new Dummy(value) with Report

  it should "count fizz correctly" in {
    val result = reportie(Messages.fizz).translate(1, 5)
    result.last should include (s"${Messages.fizz}: 5")
  }

  it should "count buzz correctly" in {
    val result = reportie(Messages.buzz).translate(1, 5)
    result.last should include (s"${Messages.buzz}: 5")
  }

  it should "count fizzbuzz correctly" in {
    val result = reportie(Messages.fizzbuzz).translate(1, 5)
    result.last should include (s"${Messages.fizzbuzz}: 5")
  }

  it should "count lucky correctly" in {
    val result = reportie(Messages.lucky).translate(1, 5)
    result.last should include (s"${Messages.lucky}: 5")
  }

  it should "count integer correctly" in {
    val result = reportie("99").translate(1, 5)
    result.last should include (s"${Messages.integer}: 5")
  }



}
