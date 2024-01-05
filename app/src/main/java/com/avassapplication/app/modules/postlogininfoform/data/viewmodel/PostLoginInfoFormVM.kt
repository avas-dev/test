package com.avassapplication.app.modules.postlogininfoform.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.avassapplication.app.modules.postlogininfoform.`data`.model.PostLoginInfoFormModel
import org.koin.core.KoinComponent

class PostLoginInfoFormVM : ViewModel(), KoinComponent {
  val postLoginInfoFormModel: MutableLiveData<PostLoginInfoFormModel> =
      MutableLiveData(PostLoginInfoFormModel())

  var navArguments: Bundle? = null
}
