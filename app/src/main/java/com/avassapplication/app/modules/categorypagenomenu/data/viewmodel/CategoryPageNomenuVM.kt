package com.avassapplication.app.modules.categorypagenomenu.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.avassapplication.app.modules.categorypagenomenu.`data`.model.CategoryPageNomenuModel
import org.koin.core.KoinComponent

class CategoryPageNomenuVM : ViewModel(), KoinComponent {
  val categoryPageNomenuModel: MutableLiveData<CategoryPageNomenuModel> =
      MutableLiveData(CategoryPageNomenuModel())

  var navArguments: Bundle? = null
}
