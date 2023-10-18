package me.alibinkhani.beep_maker

import android.content.Context
import android.widget.Toast

object Beep {
    fun makeBeep(context: Context, text: String) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
    }
}