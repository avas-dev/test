package com.avassapplication.app.modules.appiconasseticon.ui

import androidx.activity.viewModels
import com.avassapplication.app.R
import com.avassapplication.app.appcomponents.base.BaseActivity
import com.avassapplication.app.databinding.ActivityAppIconAssetIconBinding
import com.avassapplication.app.modules.appiconasseticon.`data`.viewmodel.AppIconAssetIconVM
import kotlin.String
import kotlin.Unit

class AppIconAssetIconActivity :
    BaseActivity<ActivityAppIconAssetIconBinding>(R.layout.activity_app_icon_asset_icon) {
  private val viewModel: AppIconAssetIconVM by viewModels<AppIconAssetIconVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.appIconAssetIconVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "APP_ICON_ASSET_ICON_ACTIVITY"

  }
}
