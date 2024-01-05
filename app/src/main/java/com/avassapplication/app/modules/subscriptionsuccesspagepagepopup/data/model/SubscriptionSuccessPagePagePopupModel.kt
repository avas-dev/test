package com.avassapplication.app.modules.subscriptionsuccesspagepagepopup.`data`.model

import com.avassapplication.app.R
import com.avassapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SubscriptionSuccessPagePagePopupModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtYoureonPremi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_re_on_premi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStartlistening: String? =
      MyApp.getInstance().resources.getString(R.string.msg_start_listening)

)
