package com.avassapplication.app.modules.postlogininfoform.`data`.model

import com.avassapplication.app.R
import com.avassapplication.app.appcomponents.di.MyApp
import kotlin.String

data class PostLoginInfoFormModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSKIPactioncl: String? = MyApp.getInstance().resources.getString(R.string.lbl_skip2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtApptitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_personal_info)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etNameinputValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etBirthdayinputValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etTelinputValue: String? = null
)
