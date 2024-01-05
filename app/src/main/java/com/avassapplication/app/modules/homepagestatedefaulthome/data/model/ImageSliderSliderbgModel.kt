package com.avassapplication.app.modules.homepagestatedefaulthome.`data`.model

import com.avassapplication.app.R
import com.avassapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ImageSliderSliderbgModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleOne: String? = MyApp.getInstance().resources.getString(R.string.msg_category_title)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var imageBg: String? = ""

)
