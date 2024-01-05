package com.avassapplication.app.modules.intro2nomenu.`data`.model

import com.avassapplication.app.R
import com.avassapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Intro2NomenuModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSkipactioncl: String? = MyApp.getInstance().resources.getString(R.string.lbl_skip)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNaprej: String? = MyApp.getInstance().resources.getString(R.string.lbl_naprej)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIntroOne: String? = MyApp.getInstance().resources.getString(R.string.msg_obvladujte_stre)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNaprejOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_naprej)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIntroOneOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_obvladujte_stre)

)
