package com.avassapplication.app.modules.intro3nomenu.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.avassapplication.app.R
import com.avassapplication.app.appcomponents.base.BaseActivity
import com.avassapplication.app.databinding.ActivityIntro3NomenuBinding
import com.avassapplication.app.modules.intro3nomenu.`data`.viewmodel.Intro3NomenuVM
import kotlin.String
import kotlin.Unit

class Intro3NomenuActivity :
    BaseActivity<ActivityIntro3NomenuBinding>(R.layout.activity_intro_3_nomenu) {
  private val viewModel: Intro3NomenuVM by viewModels<Intro3NomenuVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.intro3NomenuVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "INTRO3NOMENU_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Intro3NomenuActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
