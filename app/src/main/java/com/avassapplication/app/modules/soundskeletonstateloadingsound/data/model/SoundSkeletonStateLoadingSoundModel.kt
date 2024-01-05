package com.avassapplication.app.modules.soundskeletonstateloadingsound.`data`.model

import com.avassapplication.app.R
import com.avassapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SoundSkeletonStateLoadingSoundModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMeditationtitl: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sounds_meditat)

)
