package com.avassapplication.app.modules.loginpageloginpostloginaction.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.avassapplication.app.modules.loginpageloginpostloginaction.`data`.model.LoginPageLoginPostLoginActionModel
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import org.koin.core.KoinComponent

class LoginPageLoginPostLoginActionVM : ViewModel(), KoinComponent {
  val loginPageLoginPostLoginActionModel: MutableLiveData<LoginPageLoginPostLoginActionModel> =
      MutableLiveData(LoginPageLoginPostLoginActionModel())


  var navArguments: Bundle? = null


  lateinit var googleAuthResponse: GoogleSignInAccount
}
