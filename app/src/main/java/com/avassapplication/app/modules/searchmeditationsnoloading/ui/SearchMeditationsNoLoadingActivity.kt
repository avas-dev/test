package com.avassapplication.app.modules.searchmeditationsnoloading.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.avassapplication.app.R
import com.avassapplication.app.appcomponents.base.BaseActivity
import com.avassapplication.app.databinding.ActivitySearchMeditationsNoLoadingBinding
import com.avassapplication.app.modules.detailpagemainnomenunoloadingrefreshalways.ui.DetailPageMainNomenuNoLoadingRefreshAlwaysActivity
import com.avassapplication.app.modules.searchmeditationsnoloading.`data`.viewmodel.SearchMeditationsNoLoadingVM
import kotlin.String
import kotlin.Unit

class SearchMeditationsNoLoadingActivity :
    BaseActivity<ActivitySearchMeditationsNoLoadingBinding>(R.layout.activity_search_meditations_no_loading)
    {
  private val viewModel: SearchMeditationsNoLoadingVM by viewModels<SearchMeditationsNoLoadingVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.searchMeditationsNoLoadingVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageIMG.setOnClickListener {
      val destIntent = DetailPageMainNomenuNoLoadingRefreshAlwaysActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SEARCH_MEDITATIONS_NO_LOADING_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SearchMeditationsNoLoadingActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
