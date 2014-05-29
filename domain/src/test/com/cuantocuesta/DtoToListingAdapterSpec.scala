package com.cuantocuesta

import org.specs2.mutable._
import org.specs2.specification.Scope
import com.cuantocuesta.meli.dtos.Result
import com.cuantocuesta.meli.adapters.DtoToListingAdapter

class DtoToListingAdapterSpec extends Specification {
  "The adapter" should {
    "be able to convert a dto to a listing" in new setUp {
      val result = new Result()
      result.title = "Auriculares Sony"
      result.price = 12.5

      adapter.valueFor(result) must beEqualTo(Listing("Auriculares Sony", 12.5))
    }
  }
}

trait setUp extends Scope {
  val adapter = new DtoToListingAdapter
}