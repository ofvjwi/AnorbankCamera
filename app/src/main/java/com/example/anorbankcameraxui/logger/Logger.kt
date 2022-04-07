package com.example.anorbankcameraxui.logger

import android.util.Log

object Logger {

    private const val status: Boolean = true

    fun d(tag: String, message: String) {
        if (status) Log.d(tag, message)
    }

    fun e(tag: String, message: String) {
        if (status) Log.e(tag, message)
    }

    fun i(tag: String, message: String) {
        if (status) Log.i(tag, message)
    }

    fun w(tag: String, message: String) {
        if (status) Log.w(tag, message)
    }
}
