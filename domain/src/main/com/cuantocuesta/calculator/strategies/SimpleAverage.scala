package com.cuantocuesta.calculator.strategies

import com.cuantocuesta.Listing

case object SimpleAverage extends CalculationStrategy {
  override def isRelevant(listing: Listing): Boolean = true
}
