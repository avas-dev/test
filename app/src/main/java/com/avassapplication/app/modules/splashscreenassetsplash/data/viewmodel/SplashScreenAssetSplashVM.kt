package com.avassapplication.app.modules.splashscreenassetsplash.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.avassapplication.app.modules.splashscreenassetsplash.`data`.model.SplashScreenAssetSplashModel
import org.koin.core.KoinComponent

class SplashScreenAssetSplashVM : ViewModel(), KoinComponent {
  val splashScreenAssetSplashModel: MutableLiveData<SplashScreenAssetSplashModel> =
      MutableLiveData(SplashScreenAssetSplashModel())

  var navArguments: Bundle? = null
}
