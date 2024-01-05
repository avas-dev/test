package com.avassapplication.app.modules.userprofile.ui

import androidx.activity.viewModels
import com.avassapplication.app.R
import com.avassapplication.app.appcomponents.base.BaseActivity
import com.avassapplication.app.databinding.ActivityUserProfileBinding
import com.avassapplication.app.modules.editprofile.ui.EditProfileActivity
import com.avassapplication.app.modules.inappsubscriptionpagepaywallaspectratioscreennom.ui.InAppSubscriptionPagePaywallAspectratioScreenNomActivity
import com.avassapplication.app.modules.settings.ui.SettingsActivity
import com.avassapplication.app.modules.userprofile.`data`.viewmodel.UserProfileVM
import kotlin.String
import kotlin.Unit

class UserProfileActivity : BaseActivity<ActivityUserProfileBinding>(R.layout.activity_user_profile)
    {
  private val viewModel: UserProfileVM by viewModels<UserProfileVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.userProfileVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnUpgrade.setOnClickListener {
      val destIntent = InAppSubscriptionPagePaywallAspectratioScreenNomActivity.getIntent(this,
          null)
      startActivity(destIntent)
    }
    binding.btnEdit.setOnClickListener {
      val destIntent = EditProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageSettingsOne.setOnClickListener {
      val destIntent = SettingsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageSettings.setOnClickListener {
      val destIntent = SettingsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearUpgradebutton.setOnClickListener {
      val destIntent = InAppSubscriptionPagePaywallAspectratioScreenNomActivity.getIntent(this,
          null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "USER_PROFILE_ACTIVITY"

  }
}
