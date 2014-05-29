package com.cuantocuesta.controller

import org.scaloid.common._
import android.view.Gravity
import com.octo.android.robospice.{JacksonGoogleHttpClientSpiceService, SpiceManager}
import com.octo.android.robospice.persistence.DurationInMillis
import com.cuantocuesta.service.SampleSpiceRequest
import com.octo.android.robospice.request.listener.RequestListener
import com.cuantocuesta.models.Currency
import com.octo.android.robospice.persistence.exception.SpiceException

class MainActivity extends SActivity {
  private val spiceManager = new SpiceManager(classOf[JacksonGoogleHttpClientSpiceService])

  onCreate {
    spiceManager.start(this);

    contentView = new SLinearLayout {
      this += new SVerticalLayout {
        SButton("Saludame", sayHello())
        SButton("Clavate una request", stickYourselfARequest())
      }.<<.fill.>>
    }
  }

  def sayHello() = toast("Hola, la concha de tu madre!!", Gravity.CENTER_VERTICAL)
  def stickYourselfARequest() {
    spiceManager.execute(new SampleSpiceRequest(), "json", DurationInMillis.ONE_MINUTE, new CurrencyRequestListener());
  }

  class CurrencyRequestListener extends RequestListener[Currency] {
    override def onRequestFailure(spiceException: SpiceException) {
      toast("Falló mal la request, che. Se rompió todo. Y bue.")
    }

    override def onRequestSuccess(result: Currency) {
      toast("FUNCO")
    }
  }
}
