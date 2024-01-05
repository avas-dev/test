package com.avassapplication.app.modules.menumenutabs.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.avassapplication.app.modules.menumenutabs.`data`.model.MenuMenuTabsModel
import org.koin.core.KoinComponent

class MenuMenuTabsVM : ViewModel(), KoinComponent {
  val menuMenuTabsModel: MutableLiveData<MenuMenuTabsModel> = MutableLiveData(MenuMenuTabsModel())

  var navArguments: Bundle? = null
}
