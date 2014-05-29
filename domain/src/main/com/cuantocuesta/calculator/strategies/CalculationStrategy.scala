package com.cuantocuesta.calculator.strategies

import com.cuantocuesta.Listing

trait CalculationStrategy {
  def isRelevant(listing: Listing) : Boolean
}
