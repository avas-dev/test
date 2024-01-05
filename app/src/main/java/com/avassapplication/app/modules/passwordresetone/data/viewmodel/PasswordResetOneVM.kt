package com.avassapplication.app.modules.passwordresetone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.avassapplication.app.modules.passwordresetone.`data`.model.PasswordResetOneModel
import org.koin.core.KoinComponent

class PasswordResetOneVM : ViewModel(), KoinComponent {
  val passwordResetOneModel: MutableLiveData<PasswordResetOneModel> =
      MutableLiveData(PasswordResetOneModel())

  var navArguments: Bundle? = null
}
