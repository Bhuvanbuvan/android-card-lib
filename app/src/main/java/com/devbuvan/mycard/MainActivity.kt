package com.devbuvan.mycard

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.devbuvan.android_card_lib.Helloworld

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
	super.onCreate(savedInstanceState)
	enableEdgeToEdge()
	setContentView(R.layout.activity_main)
	var hell=Helloworld()
	hell.printlog()
  }
}