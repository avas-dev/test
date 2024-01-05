package com.avassapplication.app.modules.categorypagenomenu.ui

import androidx.activity.viewModels
import com.avassapplication.app.R
import com.avassapplication.app.appcomponents.base.BaseActivity
import com.avassapplication.app.databinding.ActivityCategoryPageNomenuBinding
import com.avassapplication.app.modules.categorypagenomenu.`data`.viewmodel.CategoryPageNomenuVM
import com.avassapplication.app.modules.detailpagemainnomenunoloadingrefreshalways.ui.DetailPageMainNomenuNoLoadingRefreshAlwaysActivity
import com.avassapplication.app.modules.inappsubscriptionpagepaywallaspectratioscreennom.ui.InAppSubscriptionPagePaywallAspectratioScreenNomActivity
import kotlin.String
import kotlin.Unit

class CategoryPageNomenuActivity :
    BaseActivity<ActivityCategoryPageNomenuBinding>(R.layout.activity_category_page_nomenu) {
  private val viewModel: CategoryPageNomenuVM by viewModels<CategoryPageNomenuVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.categoryPageNomenuVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnUpgrade.setOnClickListener {
      val destIntent = InAppSubscriptionPagePaywallAspectratioScreenNomActivity.getIntent(this,
          null)
      startActivity(destIntent)
    }
    binding.imageIMG.setOnClickListener {
      val destIntent = DetailPageMainNomenuNoLoadingRefreshAlwaysActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "CATEGORY_PAGE_NOMENU_ACTIVITY"

  }
}
