package com.avassapplication.app.modules.loginpageloginpostloginaction.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.avassapplication.app.R
import com.avassapplication.app.appcomponents.base.BaseActivity
import com.avassapplication.app.appcomponents.googleauth.GoogleHelper
import com.avassapplication.app.databinding.ActivityLoginPageLoginPostLoginActionBinding
import com.avassapplication.app.modules.loginpageloginpostloginaction.`data`.viewmodel.LoginPageLoginPostLoginActionVM
import com.avassapplication.app.modules.passwordreset.ui.PasswordResetActivity
import com.avassapplication.app.modules.signupsimulation.ui.SignupSimulationActivity
import kotlin.String
import kotlin.Unit

class LoginPageLoginPostLoginActionActivity :
    BaseActivity<ActivityLoginPageLoginPostLoginActionBinding>(R.layout.activity_login_page_login_post_login_action)
    {
  private val viewModel: LoginPageLoginPostLoginActionVM by
      viewModels<LoginPageLoginPostLoginActionVM>()

  private lateinit var googleLogin: GoogleHelper

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loginPageLoginPostLoginActionVM = viewModel
    googleLogin = GoogleHelper(this,
    { accountInfo ->
      },{ error -> 

      })
    }

    override fun setUpClicks(): Unit {
      binding.txtSignup.setOnClickListener {
        val destIntent = SignupSimulationActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      binding.imageGoogle.setOnClickListener {
        googleLogin.login()
      }
      binding.txtSipozabilgesl.setOnClickListener {
        val destIntent = PasswordResetActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "LOGIN_PAGE_LOGIN_POST_LOGIN_ACTION_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, LoginPageLoginPostLoginActionActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
