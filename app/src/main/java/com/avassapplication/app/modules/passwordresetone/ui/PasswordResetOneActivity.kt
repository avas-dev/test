package com.avassapplication.app.modules.passwordresetone.ui

import androidx.activity.viewModels
import com.avassapplication.app.R
import com.avassapplication.app.appcomponents.base.BaseActivity
import com.avassapplication.app.databinding.ActivityPasswordResetOneBinding
import com.avassapplication.app.modules.passwordresetone.`data`.viewmodel.PasswordResetOneVM
import kotlin.String
import kotlin.Unit

class PasswordResetOneActivity :
    BaseActivity<ActivityPasswordResetOneBinding>(R.layout.activity_password_reset_one) {
  private val viewModel: PasswordResetOneVM by viewModels<PasswordResetOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.passwordResetOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "PASSWORD_RESET_ONE_ACTIVITY"

  }
}
