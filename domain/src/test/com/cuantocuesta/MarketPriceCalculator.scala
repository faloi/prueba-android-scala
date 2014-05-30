package com.cuantocuesta

import org.specs2.mutable.Specification
import com.cuantocuesta.calculator.MarketPriceCalculator
import com.cuantocuesta.calculator.strategies.AverageOfCategory

class PriceCalculatorSpec extends Specification {

  "The price calculator" should {
    "be able to get market price with a simple average" in {
      new MarketPriceCalculator().getValueFrom(
        Seq(Listing(price = 20), Listing(price = 30))
      ) must beEqualTo (25)
    }

    "be able to get market price ignoring unimportant categories" in {
      new MarketPriceCalculator(AverageOfCategory("MLA1111")).getValueFrom(
        Seq(Listing(10, "MLA2555"), Listing(100, "MLA1111"), Listing(50, "MLA1111"))
      ) must beEqualTo (75)
    }
  }
  
}