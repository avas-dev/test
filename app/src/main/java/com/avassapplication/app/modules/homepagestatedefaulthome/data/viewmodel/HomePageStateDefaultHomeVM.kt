package com.avassapplication.app.modules.homepagestatedefaulthome.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.avassapplication.app.modules.homepagestatedefaulthome.`data`.model.HomePageStateDefaultHomeModel
import org.koin.core.KoinComponent

class HomePageStateDefaultHomeVM : ViewModel(), KoinComponent {
  val homePageStateDefaultHomeModel: MutableLiveData<HomePageStateDefaultHomeModel> =
      MutableLiveData(HomePageStateDefaultHomeModel())

  var navArguments: Bundle? = null
}
