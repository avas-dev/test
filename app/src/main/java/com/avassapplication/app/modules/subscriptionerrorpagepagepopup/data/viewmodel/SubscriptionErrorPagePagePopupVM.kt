package com.avassapplication.app.modules.subscriptionerrorpagepagepopup.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.avassapplication.app.modules.subscriptionerrorpagepagepopup.`data`.model.SubscriptionErrorPagePagePopupModel
import org.koin.core.KoinComponent

class SubscriptionErrorPagePagePopupVM : ViewModel(), KoinComponent {
  val subscriptionErrorPagePagePopupModel: MutableLiveData<SubscriptionErrorPagePagePopupModel> =
      MutableLiveData(SubscriptionErrorPagePagePopupModel())

  var navArguments: Bundle? = null
}
