package com.avassapplication.app.modules.detailpagemainnomenunoloadingrefreshalways.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.avassapplication.app.modules.detailpagemainnomenunoloadingrefreshalways.`data`.model.DetailPageMainNomenuNoLoadingRefreshAlwaysModel
import org.koin.core.KoinComponent

class DetailPageMainNomenuNoLoadingRefreshAlwaysVM : ViewModel(), KoinComponent {
  val detailPageMainNomenuNoLoadingRefreshAlwaysModel:
      MutableLiveData<DetailPageMainNomenuNoLoadingRefreshAlwaysModel> =
      MutableLiveData(DetailPageMainNomenuNoLoadingRefreshAlwaysModel())

  var navArguments: Bundle? = null
}
