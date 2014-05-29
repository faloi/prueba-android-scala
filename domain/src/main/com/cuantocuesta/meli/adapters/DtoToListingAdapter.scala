package com.cuantocuesta.meli.adapters

import com.cuantocuesta.meli.dtos.Result
import com.cuantocuesta.Listing

class DtoToListingAdapter() {
  def valueFor(listing: Result) = Listing(listing.title, listing.price)
}
