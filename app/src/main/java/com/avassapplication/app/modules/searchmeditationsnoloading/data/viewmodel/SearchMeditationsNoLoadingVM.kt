package com.avassapplication.app.modules.searchmeditationsnoloading.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.avassapplication.app.modules.searchmeditationsnoloading.`data`.model.SearchMeditationsNoLoadingModel
import org.koin.core.KoinComponent

class SearchMeditationsNoLoadingVM : ViewModel(), KoinComponent {
  val searchMeditationsNoLoadingModel: MutableLiveData<SearchMeditationsNoLoadingModel> =
      MutableLiveData(SearchMeditationsNoLoadingModel())

  var navArguments: Bundle? = null
}
