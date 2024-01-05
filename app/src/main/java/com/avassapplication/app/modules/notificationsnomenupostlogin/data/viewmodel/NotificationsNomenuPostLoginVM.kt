package com.avassapplication.app.modules.notificationsnomenupostlogin.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.avassapplication.app.modules.notificationsnomenupostlogin.`data`.model.NotificationsNomenuPostLoginModel
import org.koin.core.KoinComponent

class NotificationsNomenuPostLoginVM : ViewModel(), KoinComponent {
  val notificationsNomenuPostLoginModel: MutableLiveData<NotificationsNomenuPostLoginModel> =
      MutableLiveData(NotificationsNomenuPostLoginModel())

  var navArguments: Bundle? = null
}
