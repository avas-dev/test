package com.avassapplication.app.modules.soundliststatedefaultsound.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.avassapplication.app.modules.soundliststatedefaultsound.`data`.model.SoundListStateDefaultSoundModel
import org.koin.core.KoinComponent

class SoundListStateDefaultSoundVM : ViewModel(), KoinComponent {
  val soundListStateDefaultSoundModel: MutableLiveData<SoundListStateDefaultSoundModel> =
      MutableLiveData(SoundListStateDefaultSoundModel())

  var navArguments: Bundle? = null
}
