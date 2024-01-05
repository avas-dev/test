package com.avassapplication.app.modules.splashscreenassetsplash.ui

import androidx.activity.viewModels
import com.avassapplication.app.R
import com.avassapplication.app.appcomponents.base.BaseActivity
import com.avassapplication.app.databinding.ActivitySplashScreenAssetSplashBinding
import com.avassapplication.app.modules.splashscreenassetsplash.`data`.viewmodel.SplashScreenAssetSplashVM
import kotlin.String
import kotlin.Unit

class SplashScreenAssetSplashActivity :
    BaseActivity<ActivitySplashScreenAssetSplashBinding>(R.layout.activity_splash_screen_asset_splash)
    {
  private val viewModel: SplashScreenAssetSplashVM by viewModels<SplashScreenAssetSplashVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.splashScreenAssetSplashVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SPLASH_SCREEN_ASSET_SPLASH_ACTIVITY"

  }
}
