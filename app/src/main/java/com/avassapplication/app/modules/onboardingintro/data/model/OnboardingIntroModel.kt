package com.avassapplication.app.modules.onboardingintro.`data`.model

import com.avassapplication.app.R
import com.avassapplication.app.appcomponents.di.MyApp
import kotlin.String

data class OnboardingIntroModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.msg_welcome_to_the)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDesignedwitht: String? =
      MyApp.getInstance().resources.getString(R.string.msg_designed_with_t)

)
