package com.cuantocuesta.calculator.strategies

import com.cuantocuesta.Listing

case class AverageOfCategory(category: String) extends CalculationStrategy {
  override def isRelevant(listing: Listing): Boolean = listing.categoryIs(category)
}
