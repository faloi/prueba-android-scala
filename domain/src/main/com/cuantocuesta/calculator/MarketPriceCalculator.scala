package com.cuantocuesta.calculator

import com.cuantocuesta.Listing
import com.cuantocuesta.calculator.strategies.{SimpleAverage, CalculationStrategy}
import com.cuantocuesta.extensions.IterableExtensions._

class MarketPriceCalculator(strategy: CalculationStrategy) {
  def this() = this(SimpleAverage)

  def getValueFrom(listings: Iterable[Listing]) = relevantListings(listings).map(_.price).avg

  private def relevantListings(listings: Iterable[Listing]) = listings.filter(strategy.isRelevant)
}


