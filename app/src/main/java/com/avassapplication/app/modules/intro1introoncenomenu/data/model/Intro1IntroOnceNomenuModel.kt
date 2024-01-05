package com.avassapplication.app.modules.intro1introoncenomenu.`data`.model

import com.avassapplication.app.R
import com.avassapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Intro1IntroOnceNomenuModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSkipactioncl: String? = MyApp.getInstance().resources.getString(R.string.lbl_skip)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIntroOne: String? = MyApp.getInstance().resources.getString(R.string.msg_vklju_ite_medit)

)
