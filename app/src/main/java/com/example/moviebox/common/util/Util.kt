package com.example.moviebox.common.util

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import com.example.moviebox.R
import okhttp3.ResponseBody
import org.json.JSONObject

class ProgressBar() {
    companion object {
        fun progressDialog(context: Context): Dialog {
            val dialog = Dialog(context)
            val layout = LayoutInflater.from(context).inflate(R.layout.item_loading, null)
            dialog.setContentView(layout)
            dialog.setCancelable(false)

            dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            return dialog
        }
    }
}
        fun findExceptionMessage(errorBody: ResponseBody?): String {
            return if (errorBody != null) {
                val errorObj = JSONObject(errorBody.charStream().readText())
                val errorMessage = errorObj.getString("status_message")
                errorMessage
            } else {
                "Error"
            }
        }

