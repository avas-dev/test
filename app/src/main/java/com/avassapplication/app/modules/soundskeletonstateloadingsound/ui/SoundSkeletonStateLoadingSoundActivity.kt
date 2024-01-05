package com.avassapplication.app.modules.soundskeletonstateloadingsound.ui

import androidx.activity.viewModels
import com.avassapplication.app.R
import com.avassapplication.app.appcomponents.base.BaseActivity
import com.avassapplication.app.databinding.ActivitySoundSkeletonStateLoadingSoundBinding
import com.avassapplication.app.modules.soundskeletonstateloadingsound.`data`.viewmodel.SoundSkeletonStateLoadingSoundVM
import kotlin.String
import kotlin.Unit

class SoundSkeletonStateLoadingSoundActivity :
    BaseActivity<ActivitySoundSkeletonStateLoadingSoundBinding>(R.layout.activity_sound_skeleton_state_loading_sound)
    {
  private val viewModel: SoundSkeletonStateLoadingSoundVM by
      viewModels<SoundSkeletonStateLoadingSoundVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.soundSkeletonStateLoadingSoundVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SOUND_SKELETON_STATE_LOADING_SOUND_ACTIVITY"

  }
}
