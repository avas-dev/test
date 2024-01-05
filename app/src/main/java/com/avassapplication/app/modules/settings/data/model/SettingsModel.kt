package com.avassapplication.app.modules.settings.`data`.model

import com.avassapplication.app.R
import com.avassapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SettingsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtCategoryPageT: String? = MyApp.getInstance().resources.getString(R.string.lbl_settings)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTermAndCondition: String? =
      MyApp.getInstance().resources.getString(R.string.msg_terms_conditi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGeneralinfo: String? = MyApp.getInstance().resources.getString(R.string.lbl_general_info)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtContactus: String? = MyApp.getInstance().resources.getString(R.string.lbl_contact_us)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRestorePurchas: String? =
      MyApp.getInstance().resources.getString(R.string.msg_restore_purchas)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTermsofServic: String? =
      MyApp.getInstance().resources.getString(R.string.msg_terms_of_servic)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_if_you_subscrib)

)
