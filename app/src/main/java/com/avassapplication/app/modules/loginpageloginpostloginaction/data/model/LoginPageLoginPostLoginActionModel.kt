package com.avassapplication.app.modules.loginpageloginpostloginaction.`data`.model

import com.avassapplication.app.R
import com.avassapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LoginPageLoginPostLoginActionModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLogin: String? = MyApp.getInstance().resources.getString(R.string.lbl_prijava)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSipozabilgesl: String? =
      MyApp.getInstance().resources.getString(R.string.msg_si_pozabil_gesl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAlipanadaljuj: String? =
      MyApp.getInstance().resources.getString(R.string.msg_ali_pa_nadaljuj)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrijavazGoogl: String? =
      MyApp.getInstance().resources.getString(R.string.msg_prijava_z_googl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPotrebujenov: String? = MyApp.getInstance().resources.getString(R.string.msg_potrebuje_nov)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignup: String? = MyApp.getInstance().resources.getString(R.string.lbl_prijavi_se)
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
