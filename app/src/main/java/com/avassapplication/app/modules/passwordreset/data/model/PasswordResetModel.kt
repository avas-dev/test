package com.avassapplication.app.modules.passwordreset.`data`.model

import com.avassapplication.app.R
import com.avassapplication.app.appcomponents.di.MyApp
import kotlin.String

data class PasswordResetModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCreateanewac: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_reset_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCreateanewpa: String? =
      MyApp.getInstance().resources.getString(R.string.msg_create_a_new_pa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etPasswordfieldValue: String? = null
)
