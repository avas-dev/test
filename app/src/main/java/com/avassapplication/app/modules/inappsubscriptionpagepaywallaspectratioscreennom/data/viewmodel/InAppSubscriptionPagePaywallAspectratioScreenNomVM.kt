package com.avassapplication.app.modules.inappsubscriptionpagepaywallaspectratioscreennom.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.avassapplication.app.modules.inappsubscriptionpagepaywallaspectratioscreennom.`data`.model.InAppSubscriptionPagePaywallAspectratioScreenNomModel
import org.koin.core.KoinComponent

class InAppSubscriptionPagePaywallAspectratioScreenNomVM : ViewModel(), KoinComponent {
  val inAppSubscriptionPagePaywallAspectratioScreenNomModel:
      MutableLiveData<InAppSubscriptionPagePaywallAspectratioScreenNomModel> =
      MutableLiveData(InAppSubscriptionPagePaywallAspectratioScreenNomModel())

  var navArguments: Bundle? = null
}
