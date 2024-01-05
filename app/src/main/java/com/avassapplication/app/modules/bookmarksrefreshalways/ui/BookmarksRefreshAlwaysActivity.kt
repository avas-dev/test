package com.avassapplication.app.modules.bookmarksrefreshalways.ui

import androidx.activity.viewModels
import com.avassapplication.app.R
import com.avassapplication.app.appcomponents.base.BaseActivity
import com.avassapplication.app.databinding.ActivityBookmarksRefreshAlwaysBinding
import com.avassapplication.app.modules.bookmarksrefreshalways.`data`.viewmodel.BookmarksRefreshAlwaysVM
import com.avassapplication.app.modules.detailpagemainnomenunoloadingrefreshalways.ui.DetailPageMainNomenuNoLoadingRefreshAlwaysActivity
import com.avassapplication.app.modules.inappsubscriptionpagepaywallaspectratioscreennom.ui.InAppSubscriptionPagePaywallAspectratioScreenNomActivity
import kotlin.String
import kotlin.Unit

class BookmarksRefreshAlwaysActivity :
    BaseActivity<ActivityBookmarksRefreshAlwaysBinding>(R.layout.activity_bookmarks_refresh_always)
    {
  private val viewModel: BookmarksRefreshAlwaysVM by viewModels<BookmarksRefreshAlwaysVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.bookmarksRefreshAlwaysVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnUpgrade.setOnClickListener {
      val destIntent = InAppSubscriptionPagePaywallAspectratioScreenNomActivity.getIntent(this,
          null)
      startActivity(destIntent)
    }
    binding.linearUpgradebutton.setOnClickListener {
      val destIntent = InAppSubscriptionPagePaywallAspectratioScreenNomActivity.getIntent(this,
          null)
      startActivity(destIntent)
    }
    binding.imageIMG.setOnClickListener {
      val destIntent = DetailPageMainNomenuNoLoadingRefreshAlwaysActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "BOOKMARKS_REFRESH_ALWAYS_ACTIVITY"

  }
}
