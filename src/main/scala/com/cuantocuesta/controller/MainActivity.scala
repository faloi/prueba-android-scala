package com.cuantocuesta.controller

import org.scaloid.common._
import android.view.Gravity
import com.octo.android.robospice.{JacksonGoogleHttpClientSpiceService, SpiceManager}

class MainActivity extends SActivity {
  private var spiceManager = new SpiceManager(classOf[JacksonGoogleHttpClientSpiceService])

  onCreate {
    contentView = new SLinearLayout {
      this += new SVerticalLayout {
        SButton("Saludame", sayHello())
        SButton("Clavate una request", stickYourselfARequest())
      }.<<.fill.>>
    }
  }

  def sayHello() = toast("Hola, la concha de tu madre!!", Gravity.CENTER_VERTICAL)
  def stickYourselfARequest() {
    toast("piola")
  }
}
