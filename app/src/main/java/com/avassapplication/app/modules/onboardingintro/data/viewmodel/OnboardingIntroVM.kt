package com.avassapplication.app.modules.onboardingintro.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.avassapplication.app.modules.onboardingintro.`data`.model.OnboardingIntroModel
import org.koin.core.KoinComponent

class OnboardingIntroVM : ViewModel(), KoinComponent {
  val onboardingIntroModel: MutableLiveData<OnboardingIntroModel> =
      MutableLiveData(OnboardingIntroModel())

  var navArguments: Bundle? = null
}
