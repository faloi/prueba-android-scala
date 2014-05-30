package com.cuantocuesta

case class Listing(price: Double, category: String = "") {
  def categoryIs(anotherCategory: String): Boolean = category == anotherCategory
}
