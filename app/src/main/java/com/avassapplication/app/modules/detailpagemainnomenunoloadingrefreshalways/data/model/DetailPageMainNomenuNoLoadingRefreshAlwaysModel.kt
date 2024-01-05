package com.avassapplication.app.modules.detailpagemainnomenunoloadingrefreshalways.`data`.model

import com.avassapplication.app.R
import com.avassapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DetailPageMainNomenuNoLoadingRefreshAlwaysModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMeditationtitl: String? =
      MyApp.getInstance().resources.getString(R.string.msg_name_of_the_ses)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_0_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_0_00)

)
