package com.avassapplication.app.modules.intro3nomenu.`data`.model

import com.avassapplication.app.R
import com.avassapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Intro3NomenuModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtIntroTwo: String? = MyApp.getInstance().resources.getString(R.string.msg_izbolj_ajte_svo)

)
