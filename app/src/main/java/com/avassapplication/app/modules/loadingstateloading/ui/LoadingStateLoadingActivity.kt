package com.avassapplication.app.modules.loadingstateloading.ui

import androidx.activity.viewModels
import com.avassapplication.app.R
import com.avassapplication.app.appcomponents.base.BaseActivity
import com.avassapplication.app.databinding.ActivityLoadingStateLoadingBinding
import com.avassapplication.app.modules.loadingstateloading.`data`.viewmodel.LoadingStateLoadingVM
import kotlin.String
import kotlin.Unit

class LoadingStateLoadingActivity :
    BaseActivity<ActivityLoadingStateLoadingBinding>(R.layout.activity_loading_state_loading) {
  private val viewModel: LoadingStateLoadingVM by viewModels<LoadingStateLoadingVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loadingStateLoadingVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "LOADING_STATE_LOADING_ACTIVITY"

  }
}
