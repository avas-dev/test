package com.avassapplication.app.modules.loadingstateloading.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.avassapplication.app.modules.loadingstateloading.`data`.model.LoadingStateLoadingModel
import org.koin.core.KoinComponent

class LoadingStateLoadingVM : ViewModel(), KoinComponent {
  val loadingStateLoadingModel: MutableLiveData<LoadingStateLoadingModel> =
      MutableLiveData(LoadingStateLoadingModel())

  var navArguments: Bundle? = null
}
