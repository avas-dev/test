package com.avassapplication.app.modules.onboardingintro.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.avassapplication.app.R
import com.avassapplication.app.appcomponents.base.BaseActivity
import com.avassapplication.app.databinding.ActivityOnboardingIntroBinding
import com.avassapplication.app.modules.onboardingintro.`data`.viewmodel.OnboardingIntroVM
import kotlin.String
import kotlin.Unit

class OnboardingIntroActivity :
    BaseActivity<ActivityOnboardingIntroBinding>(R.layout.activity_onboarding_intro) {
  private val viewModel: OnboardingIntroVM by viewModels<OnboardingIntroVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.onboardingIntroVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "ONBOARDING_INTRO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OnboardingIntroActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
