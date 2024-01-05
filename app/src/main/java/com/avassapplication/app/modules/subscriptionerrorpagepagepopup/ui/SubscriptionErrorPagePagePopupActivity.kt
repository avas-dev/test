package com.avassapplication.app.modules.subscriptionerrorpagepagepopup.ui

import androidx.activity.viewModels
import com.avassapplication.app.R
import com.avassapplication.app.appcomponents.base.BaseActivity
import com.avassapplication.app.databinding.ActivitySubscriptionErrorPagePagePopupBinding
import com.avassapplication.app.modules.subscriptionerrorpagepagepopup.`data`.viewmodel.SubscriptionErrorPagePagePopupVM
import kotlin.String
import kotlin.Unit

class SubscriptionErrorPagePagePopupActivity :
    BaseActivity<ActivitySubscriptionErrorPagePagePopupBinding>(R.layout.activity_subscription_error_page_page_popup)
    {
  private val viewModel: SubscriptionErrorPagePagePopupVM by
      viewModels<SubscriptionErrorPagePagePopupVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.subscriptionErrorPagePagePopupVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SUBSCRIPTION_ERROR_PAGE_PAGE_POPUP_ACTIVITY"

  }
}
