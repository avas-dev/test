package com.avassapplication.app.modules.intro2nomenu.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.avassapplication.app.modules.intro2nomenu.`data`.model.Intro2NomenuModel
import org.koin.core.KoinComponent

class Intro2NomenuVM : ViewModel(), KoinComponent {
  val intro2NomenuModel: MutableLiveData<Intro2NomenuModel> = MutableLiveData(Intro2NomenuModel())

  var navArguments: Bundle? = null
}
