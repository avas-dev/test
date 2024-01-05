package com.avassapplication.app.modules.notificationsnomenupostlogin.ui

import androidx.activity.viewModels
import com.avassapplication.app.R
import com.avassapplication.app.appcomponents.base.BaseActivity
import com.avassapplication.app.databinding.ActivityNotificationsNomenuPostLoginBinding
import com.avassapplication.app.modules.notificationsnomenupostlogin.`data`.viewmodel.NotificationsNomenuPostLoginVM
import com.avassapplication.app.modules.postlogininfoform.ui.PostLoginInfoFormActivity
import kotlin.String
import kotlin.Unit

class NotificationsNomenuPostLoginActivity :
    BaseActivity<ActivityNotificationsNomenuPostLoginBinding>(R.layout.activity_notifications_nomenu_post_login)
    {
  private val viewModel: NotificationsNomenuPostLoginVM by
      viewModels<NotificationsNomenuPostLoginVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.notificationsNomenuPostLoginVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtSKIP.setOnClickListener {
      val destIntent = PostLoginInfoFormActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "NOTIFICATIONS_NOMENU_POST_LOGIN_ACTIVITY"

  }
}
