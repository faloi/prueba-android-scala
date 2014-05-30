package com.cuantocuesta.service

import com.google.api.client.http.GenericUrl
import com.google.api.client.json.jackson.JacksonFactory
import com.octo.android.robospice.request.googlehttpclient.GoogleHttpClientSpiceRequest
import com.cuantocuesta.models.Currency

class SampleSpiceRequest() extends GoogleHttpClientSpiceRequest(classOf[Currency]) {
  private var baseUrl: String = "https://api.mercadolibre.com/currencies/ARS"

  override def loadDataFromNetwork(): Currency = {
    val request = getHttpRequestFactory.buildGetRequest(new GenericUrl(baseUrl))
    request.setParser(new JacksonFactory().createJsonObjectParser())
    request.execute().parseAs(getResultType)
  }
}
