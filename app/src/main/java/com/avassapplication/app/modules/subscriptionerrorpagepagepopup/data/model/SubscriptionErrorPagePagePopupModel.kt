package com.avassapplication.app.modules.subscriptionerrorpagepagepopup.`data`.model

import com.avassapplication.app.R
import com.avassapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SubscriptionErrorPagePagePopupModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtError: String? = MyApp.getInstance().resources.getString(R.string.msg_payment_not_com)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_payment_has_fai)

)
