package com.scratch

import org.scaloid.common._
import android.view.Gravity

class MainActivity extends SActivity {
  onCreate {
    contentView = new SLinearLayout {
      SButton("Saludame", saludar())
    }
  }

  def saludar() = toast("Hola, la concha de tu madre!!", Gravity.CENTER_VERTICAL)
}
