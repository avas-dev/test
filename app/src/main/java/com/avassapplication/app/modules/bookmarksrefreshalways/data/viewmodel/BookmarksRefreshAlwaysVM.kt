package com.avassapplication.app.modules.bookmarksrefreshalways.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.avassapplication.app.modules.bookmarksrefreshalways.`data`.model.BookmarksRefreshAlwaysModel
import org.koin.core.KoinComponent

class BookmarksRefreshAlwaysVM : ViewModel(), KoinComponent {
  val bookmarksRefreshAlwaysModel: MutableLiveData<BookmarksRefreshAlwaysModel> =
      MutableLiveData(BookmarksRefreshAlwaysModel())

  var navArguments: Bundle? = null
}
