package com.avassapplication.app.modules.appiconasseticon.`data`.model

import com.avassapplication.app.R
import com.avassapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AppIconAssetIconModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMeditation: String? = MyApp.getInstance().resources.getString(R.string.lbl_meditation)

)
