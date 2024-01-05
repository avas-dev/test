package com.avassapplication.app.modules.intro2nomenu.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.avassapplication.app.R
import com.avassapplication.app.appcomponents.base.BaseActivity
import com.avassapplication.app.databinding.ActivityIntro2NomenuBinding
import com.avassapplication.app.modules.intro2nomenu.`data`.viewmodel.Intro2NomenuVM
import com.avassapplication.app.modules.intro3nomenu.ui.Intro3NomenuActivity
import kotlin.String
import kotlin.Unit

class Intro2NomenuActivity :
    BaseActivity<ActivityIntro2NomenuBinding>(R.layout.activity_intro_2_nomenu) {
  private val viewModel: Intro2NomenuVM by viewModels<Intro2NomenuVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.intro2NomenuVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnArrowleft.setOnClickListener {
      finish()
    }
    binding.frameCTA.setOnClickListener {
      val destIntent = Intro3NomenuActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.frameCTA.setOnClickListener {
      val destIntent = Intro3NomenuActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "INTRO2NOMENU_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Intro2NomenuActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
