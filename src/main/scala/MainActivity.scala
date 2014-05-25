package com.scratch

import org.scaloid.common._

class MainActivity extends SActivity {
  onCreate {

    contentView = new SLinearLayout {
      SButton("Saludame", toast("Hola, la concha de tu madre!!"))
    }
  }
}
