package com.smartherd.msgshareapp

import android.app.Activity
import android.content.Context
import android.widget.Toast

fun Activity.showToast(message: String) {
	Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}
