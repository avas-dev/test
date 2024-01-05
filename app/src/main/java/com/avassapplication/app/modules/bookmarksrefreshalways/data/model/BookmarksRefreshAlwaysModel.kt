package com.avassapplication.app.modules.bookmarksrefreshalways.`data`.model

import com.avassapplication.app.R
import com.avassapplication.app.appcomponents.di.MyApp
import kotlin.String

data class BookmarksRefreshAlwaysModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtApptitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_bookmarks)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCategory: String? = MyApp.getInstance().resources.getString(R.string.lbl_upgrade)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCategoryPageT: String? = MyApp.getInstance().resources.getString(R.string.lbl_bookmarks)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCategoryPageD: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_favourite)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_title)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShortdescript: String? =
      MyApp.getInstance().resources.getString(R.string.msg_short_descripti)

)
