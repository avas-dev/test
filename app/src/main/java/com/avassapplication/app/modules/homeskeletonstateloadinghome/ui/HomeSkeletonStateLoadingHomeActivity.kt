package com.avassapplication.app.modules.homeskeletonstateloadinghome.ui

import androidx.activity.viewModels
import com.avassapplication.app.R
import com.avassapplication.app.appcomponents.base.BaseActivity
import com.avassapplication.app.databinding.ActivityHomeSkeletonStateLoadingHomeBinding
import com.avassapplication.app.modules.homeskeletonstateloadinghome.`data`.viewmodel.HomeSkeletonStateLoadingHomeVM
import kotlin.String
import kotlin.Unit

class HomeSkeletonStateLoadingHomeActivity :
    BaseActivity<ActivityHomeSkeletonStateLoadingHomeBinding>(R.layout.activity_home_skeleton_state_loading_home)
    {
  private val viewModel: HomeSkeletonStateLoadingHomeVM by
      viewModels<HomeSkeletonStateLoadingHomeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homeSkeletonStateLoadingHomeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "HOME_SKELETON_STATE_LOADING_HOME_ACTIVITY"

  }
}
