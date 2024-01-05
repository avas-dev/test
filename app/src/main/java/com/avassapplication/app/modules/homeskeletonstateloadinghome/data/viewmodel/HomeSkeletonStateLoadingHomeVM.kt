package com.avassapplication.app.modules.homeskeletonstateloadinghome.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.avassapplication.app.modules.homeskeletonstateloadinghome.`data`.model.HomeSkeletonStateLoadingHomeModel
import org.koin.core.KoinComponent

class HomeSkeletonStateLoadingHomeVM : ViewModel(), KoinComponent {
  val homeSkeletonStateLoadingHomeModel: MutableLiveData<HomeSkeletonStateLoadingHomeModel> =
      MutableLiveData(HomeSkeletonStateLoadingHomeModel())

  var navArguments: Bundle? = null
}
