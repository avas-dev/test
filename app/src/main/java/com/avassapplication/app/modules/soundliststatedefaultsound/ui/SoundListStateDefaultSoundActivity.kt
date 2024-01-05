package com.avassapplication.app.modules.soundliststatedefaultsound.ui

import androidx.activity.viewModels
import com.avassapplication.app.R
import com.avassapplication.app.appcomponents.base.BaseActivity
import com.avassapplication.app.databinding.ActivitySoundListStateDefaultSoundBinding
import com.avassapplication.app.modules.inappsubscriptionpagepaywallaspectratioscreennom.ui.InAppSubscriptionPagePaywallAspectratioScreenNomActivity
import com.avassapplication.app.modules.soundliststatedefaultsound.`data`.viewmodel.SoundListStateDefaultSoundVM
import kotlin.String
import kotlin.Unit

class SoundListStateDefaultSoundActivity :
    BaseActivity<ActivitySoundListStateDefaultSoundBinding>(R.layout.activity_sound_list_state_default_sound)
    {
  private val viewModel: SoundListStateDefaultSoundVM by viewModels<SoundListStateDefaultSoundVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.soundListStateDefaultSoundVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearUpgradebutton.setOnClickListener {
      val destIntent = InAppSubscriptionPagePaywallAspectratioScreenNomActivity.getIntent(this,
          null)
      startActivity(destIntent)
    }
    binding.btnUpgrade.setOnClickListener {
      val destIntent = InAppSubscriptionPagePaywallAspectratioScreenNomActivity.getIntent(this,
          null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SOUND_LIST_STATE_DEFAULT_SOUND_ACTIVITY"

  }
}
