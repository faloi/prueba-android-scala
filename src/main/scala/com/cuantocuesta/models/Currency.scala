package com.cuantocuesta.models

import com.google.api.client.util.Key

class Currency {
  @Key
  var id: String = _

  @Key
  var description: String = _

  @Key
  var symbol: String = _

  @Key
  var decimal_places: Integer = _
}