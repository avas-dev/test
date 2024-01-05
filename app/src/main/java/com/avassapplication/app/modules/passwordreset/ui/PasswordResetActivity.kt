package com.avassapplication.app.modules.passwordreset.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.avassapplication.app.R
import com.avassapplication.app.appcomponents.base.BaseActivity
import com.avassapplication.app.databinding.ActivityPasswordResetBinding
import com.avassapplication.app.modules.passwordreset.`data`.viewmodel.PasswordResetVM
import kotlin.String
import kotlin.Unit

class PasswordResetActivity :
    BaseActivity<ActivityPasswordResetBinding>(R.layout.activity_password_reset) {
  private val viewModel: PasswordResetVM by viewModels<PasswordResetVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.passwordResetVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "PASSWORD_RESET_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PasswordResetActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
