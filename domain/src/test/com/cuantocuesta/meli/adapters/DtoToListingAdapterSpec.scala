package com.cuantocuesta.meli.adapters

import org.specs2.mutable._
import org.specs2.specification.Scope
import com.cuantocuesta.meli.dtos.Result
import com.cuantocuesta.Listing

class DtoToListingAdapterSpec extends Specification {
  "The adapter" should {
    "be able to convert a dto to a listing" in new setUp {
      val result = new Result()
      result.category_id = "MLA8256"
      result.price = 12.5

      adapter.valueFor(result) must beEqualTo(Listing(12.5, "MLA8256"))
    }
  }
}

trait setUp extends Scope {
  val adapter = new DtoToListingAdapter
}