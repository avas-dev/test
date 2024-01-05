package com.avassapplication.app.modules.postlogininfoform.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.avassapplication.app.R
import com.avassapplication.app.appcomponents.base.BaseActivity
import com.avassapplication.app.databinding.ActivityPostLoginInfoFormBinding
import com.avassapplication.app.modules.onboardingintro.ui.OnboardingIntroActivity
import com.avassapplication.app.modules.postlogininfoform.`data`.viewmodel.PostLoginInfoFormVM
import kotlin.String
import kotlin.Unit

class PostLoginInfoFormActivity :
    BaseActivity<ActivityPostLoginInfoFormBinding>(R.layout.activity_post_login_info_form) {
  private val viewModel: PostLoginInfoFormVM by viewModels<PostLoginInfoFormVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.postLoginInfoFormVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtSKIPactioncl.setOnClickListener {
      val destIntent = OnboardingIntroActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "POST_LOGIN_INFO_FORM_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PostLoginInfoFormActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
