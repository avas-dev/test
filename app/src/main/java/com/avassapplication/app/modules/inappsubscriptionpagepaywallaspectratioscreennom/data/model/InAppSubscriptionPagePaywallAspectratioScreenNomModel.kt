package com.avassapplication.app.modules.inappsubscriptionpagepaywallaspectratioscreennom.`data`.model

import com.avassapplication.app.R
import com.avassapplication.app.appcomponents.di.MyApp
import kotlin.String

data class InAppSubscriptionPagePaywallAspectratioScreenNomModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPaywalltitle: String? =
      MyApp.getInstance().resources.getString(R.string.msg_unlock_exclusiv)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPaywalldescrip: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol2)

)
