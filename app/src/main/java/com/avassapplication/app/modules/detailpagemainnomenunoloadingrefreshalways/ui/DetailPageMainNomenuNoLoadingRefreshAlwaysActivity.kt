package com.avassapplication.app.modules.detailpagemainnomenunoloadingrefreshalways.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.avassapplication.app.R
import com.avassapplication.app.appcomponents.base.BaseActivity
import com.avassapplication.app.databinding.ActivityDetailPageMainNomenuNoLoadingRefreshAlwaysBinding
import com.avassapplication.app.modules.detailpagemainnomenunoloadingrefreshalways.`data`.viewmodel.DetailPageMainNomenuNoLoadingRefreshAlwaysVM
import kotlin.String
import kotlin.Unit

class DetailPageMainNomenuNoLoadingRefreshAlwaysActivity :
    BaseActivity<ActivityDetailPageMainNomenuNoLoadingRefreshAlwaysBinding>(R.layout.activity_detail_page_main_nomenu_no_loading_refresh_always)
    {
  private val viewModel: DetailPageMainNomenuNoLoadingRefreshAlwaysVM by
      viewModels<DetailPageMainNomenuNoLoadingRefreshAlwaysVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.detailPageMainNomenuNoLoadingRefreshAlwaysVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "DETAIL_PAGE_MAIN_NOMENU_NO_LOADING_REFRESH_ALWAYS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context,
                                  DetailPageMainNomenuNoLoadingRefreshAlwaysActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
