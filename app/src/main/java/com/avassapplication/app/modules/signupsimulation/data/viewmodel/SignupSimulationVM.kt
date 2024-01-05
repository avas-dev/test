package com.avassapplication.app.modules.signupsimulation.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.avassapplication.app.modules.signupsimulation.`data`.model.SignupSimulationModel
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import org.koin.core.KoinComponent

class SignupSimulationVM : ViewModel(), KoinComponent {
  val signupSimulationModel: MutableLiveData<SignupSimulationModel> =
      MutableLiveData(SignupSimulationModel())


  var navArguments: Bundle? = null


  lateinit var googleAuthResponse: GoogleSignInAccount
}
