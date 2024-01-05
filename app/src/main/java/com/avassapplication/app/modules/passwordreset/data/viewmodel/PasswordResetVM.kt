package com.avassapplication.app.modules.passwordreset.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.avassapplication.app.modules.passwordreset.`data`.model.PasswordResetModel
import org.koin.core.KoinComponent

class PasswordResetVM : ViewModel(), KoinComponent {
  val passwordResetModel: MutableLiveData<PasswordResetModel> =
      MutableLiveData(PasswordResetModel())

  var navArguments: Bundle? = null
}
