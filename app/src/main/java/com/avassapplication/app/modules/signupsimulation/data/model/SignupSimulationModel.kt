package com.avassapplication.app.modules.signupsimulation.`data`.model

import com.avassapplication.app.R
import com.avassapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SignupSimulationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCreateanewac: String? =
      MyApp.getInstance().resources.getString(R.string.msg_create_a_new_ac)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOrcontinuewit: String? =
      MyApp.getInstance().resources.getString(R.string.msg_or_continue_wit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSigninwithGo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sign_in_with_go)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_already_have_an)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLogin: String? = MyApp.getInstance().resources.getString(R.string.lbl_log_in2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etEmailfieldValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPasswordfieldValue: String? = null
)
