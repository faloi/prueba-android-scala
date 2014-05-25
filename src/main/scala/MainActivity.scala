package com.scratch

import android.app.Activity
import android.os.Bundle
import android.widget.Toast

class MainActivity extends Activity with TypedActivity {
  override def onCreate(bundle: Bundle) {
    super.onCreate(bundle)
    setContentView(R.layout.main)
    findView(TR.textview).setText("Hola, la concha de tu madre!")
  }
}
