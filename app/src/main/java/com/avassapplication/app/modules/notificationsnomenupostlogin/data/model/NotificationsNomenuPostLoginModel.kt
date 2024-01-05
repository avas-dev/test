package com.avassapplication.app.modules.notificationsnomenupostlogin.`data`.model

import com.avassapplication.app.R
import com.avassapplication.app.appcomponents.di.MyApp
import kotlin.String

data class NotificationsNomenuPostLoginModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSKIP: String? = MyApp.getInstance().resources.getString(R.string.lbl_skip2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.msg_get_daily_affir)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enable_notifica)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnabledNotific: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enabled_notific)

)
