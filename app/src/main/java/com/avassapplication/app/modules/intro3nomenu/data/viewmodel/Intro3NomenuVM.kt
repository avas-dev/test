package com.avassapplication.app.modules.intro3nomenu.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.avassapplication.app.modules.intro3nomenu.`data`.model.Intro3NomenuModel
import org.koin.core.KoinComponent

class Intro3NomenuVM : ViewModel(), KoinComponent {
  val intro3NomenuModel: MutableLiveData<Intro3NomenuModel> = MutableLiveData(Intro3NomenuModel())

  var navArguments: Bundle? = null
}
