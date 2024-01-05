package com.avassapplication.app.modules.soundliststatedefaultsound.`data`.model

import com.avassapplication.app.R
import com.avassapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SoundListStateDefaultSoundModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCategory: String? = MyApp.getInstance().resources.getString(R.string.lbl_upgrade)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtApptitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_sounds)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMeditationtitl: String? =
      MyApp.getInstance().resources.getString(R.string.msg_spring_meditat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_short_meditatio)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_name_of_the_med)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_0_00)

)
