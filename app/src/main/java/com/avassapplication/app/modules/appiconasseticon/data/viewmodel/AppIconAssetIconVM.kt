package com.avassapplication.app.modules.appiconasseticon.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.avassapplication.app.modules.appiconasseticon.`data`.model.AppIconAssetIconModel
import org.koin.core.KoinComponent

class AppIconAssetIconVM : ViewModel(), KoinComponent {
  val appIconAssetIconModel: MutableLiveData<AppIconAssetIconModel> =
      MutableLiveData(AppIconAssetIconModel())

  var navArguments: Bundle? = null
}
