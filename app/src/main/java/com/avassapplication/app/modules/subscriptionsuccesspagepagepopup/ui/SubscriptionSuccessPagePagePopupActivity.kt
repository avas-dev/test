package com.avassapplication.app.modules.subscriptionsuccesspagepagepopup.ui

import androidx.activity.viewModels
import com.avassapplication.app.R
import com.avassapplication.app.appcomponents.base.BaseActivity
import com.avassapplication.app.databinding.ActivitySubscriptionSuccessPagePagePopupBinding
import com.avassapplication.app.modules.subscriptionsuccesspagepagepopup.`data`.viewmodel.SubscriptionSuccessPagePagePopupVM
import kotlin.String
import kotlin.Unit

class SubscriptionSuccessPagePagePopupActivity :
    BaseActivity<ActivitySubscriptionSuccessPagePagePopupBinding>(R.layout.activity_subscription_success_page_page_popup)
    {
  private val viewModel: SubscriptionSuccessPagePagePopupVM by
      viewModels<SubscriptionSuccessPagePagePopupVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.subscriptionSuccessPagePagePopupVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SUBSCRIPTION_SUCCESS_PAGE_PAGE_POPUP_ACTIVITY"

  }
}
