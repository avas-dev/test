package com.avassapplication.app.modules.subscriptionsuccesspagepagepopup.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.avassapplication.app.modules.subscriptionsuccesspagepagepopup.`data`.model.SubscriptionSuccessPagePagePopupModel
import org.koin.core.KoinComponent

class SubscriptionSuccessPagePagePopupVM : ViewModel(), KoinComponent {
  val subscriptionSuccessPagePagePopupModel: MutableLiveData<SubscriptionSuccessPagePagePopupModel>
      = MutableLiveData(SubscriptionSuccessPagePagePopupModel())

  var navArguments: Bundle? = null
}
