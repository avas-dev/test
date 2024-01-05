package com.avassapplication.app.modules.intro1introoncenomenu.ui

import androidx.activity.viewModels
import com.avassapplication.app.R
import com.avassapplication.app.appcomponents.base.BaseActivity
import com.avassapplication.app.databinding.ActivityIntro1IntroOnceNomenuBinding
import com.avassapplication.app.modules.intro1introoncenomenu.`data`.viewmodel.Intro1IntroOnceNomenuVM
import com.avassapplication.app.modules.intro2nomenu.ui.Intro2NomenuActivity
import kotlin.String
import kotlin.Unit

class Intro1IntroOnceNomenuActivity :
    BaseActivity<ActivityIntro1IntroOnceNomenuBinding>(R.layout.activity_intro_1_intro_once_nomenu)
    {
  private val viewModel: Intro1IntroOnceNomenuVM by viewModels<Intro1IntroOnceNomenuVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.intro1IntroOnceNomenuVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnNaprej.setOnClickListener {
      val destIntent = Intro2NomenuActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "INTRO1INTRO_ONCE_NOMENU_ACTIVITY"

  }
}
