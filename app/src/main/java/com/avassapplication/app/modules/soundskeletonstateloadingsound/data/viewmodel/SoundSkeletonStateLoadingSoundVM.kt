package com.avassapplication.app.modules.soundskeletonstateloadingsound.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.avassapplication.app.modules.soundskeletonstateloadingsound.`data`.model.SoundSkeletonStateLoadingSoundModel
import org.koin.core.KoinComponent

class SoundSkeletonStateLoadingSoundVM : ViewModel(), KoinComponent {
  val soundSkeletonStateLoadingSoundModel: MutableLiveData<SoundSkeletonStateLoadingSoundModel> =
      MutableLiveData(SoundSkeletonStateLoadingSoundModel())

  var navArguments: Bundle? = null
}
