package com.avassapplication.app.modules.signupsimulation.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.avassapplication.app.R
import com.avassapplication.app.appcomponents.base.BaseActivity
import com.avassapplication.app.appcomponents.googleauth.GoogleHelper
import com.avassapplication.app.databinding.ActivitySignupSimulationBinding
import com.avassapplication.app.modules.loginpageloginpostloginaction.ui.LoginPageLoginPostLoginActionActivity
import com.avassapplication.app.modules.signupsimulation.`data`.viewmodel.SignupSimulationVM
import kotlin.String
import kotlin.Unit

class SignupSimulationActivity :
    BaseActivity<ActivitySignupSimulationBinding>(R.layout.activity_signup_simulation) {
  private val viewModel: SignupSimulationVM by viewModels<SignupSimulationVM>()

  private lateinit var googleLogin: GoogleHelper

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signupSimulationVM = viewModel
    googleLogin = GoogleHelper(this,
    { accountInfo ->
      },{ error ->

      })
    }

    override fun setUpClicks(): Unit {
      binding.linearRowgoogle.setOnClickListener {
        googleLogin.login()
      }
      binding.txtLogin.setOnClickListener {
        val destIntent = LoginPageLoginPostLoginActionActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "SIGNUP_SIMULATION_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, SignupSimulationActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
