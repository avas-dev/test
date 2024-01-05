package com.avassapplication.app.modules.searchmeditationsnoloading.`data`.model

import com.avassapplication.app.R
import com.avassapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SearchMeditationsNoLoadingModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_explore)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_title)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShortdescript: String? =
      MyApp.getInstance().resources.getString(R.string.msg_short_descripti)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etSearchfieldValue: String? = null
)
