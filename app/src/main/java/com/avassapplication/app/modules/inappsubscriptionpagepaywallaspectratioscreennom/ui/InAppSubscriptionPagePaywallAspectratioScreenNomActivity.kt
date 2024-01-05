package com.avassapplication.app.modules.inappsubscriptionpagepaywallaspectratioscreennom.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.avassapplication.app.R
import com.avassapplication.app.appcomponents.base.BaseActivity
import com.avassapplication.app.databinding.ActivityInAppSubscriptionPagePaywallAspectratioScreenNomBinding
import com.avassapplication.app.modules.inappsubscriptionpagepaywallaspectratioscreennom.`data`.viewmodel.InAppSubscriptionPagePaywallAspectratioScreenNomVM
import kotlin.String
import kotlin.Unit

class InAppSubscriptionPagePaywallAspectratioScreenNomActivity :
    BaseActivity<ActivityInAppSubscriptionPagePaywallAspectratioScreenNomBinding>(R.layout.activity_in_app_subscription_page_paywall_aspectratio_screen_nom)
    {
  private val viewModel: InAppSubscriptionPagePaywallAspectratioScreenNomVM by
      viewModels<InAppSubscriptionPagePaywallAspectratioScreenNomVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.inAppSubscriptionPagePaywallAspectratioScreenNomVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnClose.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "IN_APP_SUBSCRIPTION_PAGE_PAYWALL_ASPECTRATIO_SCREEN_NOM_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context,
                                                               
                                       
                InAppSubscriptionPagePaywallAspectratioScreenNomActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
