package com.avassapplication.app.modules.homepagestatedefaulthome.`data`.model

import com.avassapplication.app.R
import com.avassapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomePageStateDefaultHomeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtApptitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_meditation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCategory: String? = MyApp.getInstance().resources.getString(R.string.lbl_upgrade)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtApptitleOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_meditacije)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_categories)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_featured)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeall: String? = MyApp.getInstance().resources.getString(R.string.lbl_see_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_title)
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
  var txtCategoryThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_premium)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTitleFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_title)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtShortdescriptOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_short_descripti)

)
