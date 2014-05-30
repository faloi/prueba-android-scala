package com.cuantocuesta.extensions

object IterableExtensions {
  def average[T]( ts: Iterable[T] )( implicit num: Numeric[T] ) = {
    num.toDouble( ts.sum ) / ts.size
  }

  implicit class IterableWithAvg[T: Numeric](data: Iterable[T]) { def avg = average(data) }
}
