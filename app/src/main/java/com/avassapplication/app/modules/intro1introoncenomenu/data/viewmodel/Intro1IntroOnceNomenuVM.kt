package com.avassapplication.app.modules.intro1introoncenomenu.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.avassapplication.app.modules.intro1introoncenomenu.`data`.model.Intro1IntroOnceNomenuModel
import org.koin.core.KoinComponent

class Intro1IntroOnceNomenuVM : ViewModel(), KoinComponent {
  val intro1IntroOnceNomenuModel: MutableLiveData<Intro1IntroOnceNomenuModel> =
      MutableLiveData(Intro1IntroOnceNomenuModel())

  var navArguments: Bundle? = null
}
