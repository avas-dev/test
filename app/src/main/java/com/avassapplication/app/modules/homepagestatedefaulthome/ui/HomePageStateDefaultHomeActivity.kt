package com.avassapplication.app.modules.homepagestatedefaulthome.ui

import android.net.Uri
import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.avassapplication.app.R
import com.avassapplication.app.appcomponents.base.BaseActivity
import com.avassapplication.app.databinding.ActivityHomePageStateDefaultHomeBinding
import com.avassapplication.app.modules.detailpagemainnomenunoloadingrefreshalways.ui.DetailPageMainNomenuNoLoadingRefreshAlwaysActivity
import com.avassapplication.app.modules.homepagestatedefaulthome.`data`.model.ImageSliderSliderbgModel
import com.avassapplication.app.modules.homepagestatedefaulthome.`data`.viewmodel.HomePageStateDefaultHomeVM
import com.avassapplication.app.modules.inappsubscriptionpagepaywallaspectratioscreennom.ui.InAppSubscriptionPagePaywallAspectratioScreenNomActivity
import com.avassapplication.app.modules.loginpageloginpostloginaction.ui.LoginPageLoginPostLoginActionActivity
import com.avassapplication.app.modules.searchmeditationsnoloading.ui.SearchMeditationsNoLoadingActivity
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

class HomePageStateDefaultHomeActivity :
    BaseActivity<ActivityHomePageStateDefaultHomeBinding>(R.layout.activity_home_page_state_default_home)
    {
  private val imageUri: Uri =
      Uri.parse("android.resource://com.avassapplication.app/drawable/img_bg")


  private val imageSliderSliderbgItems: ArrayList<ImageSliderSliderbgModel> =
      arrayListOf(ImageSliderSliderbgModel(imageBg =
  imageUri.toString()),ImageSliderSliderbgModel(imageBg = imageUri.toString()))


  private val viewModel: HomePageStateDefaultHomeVM by viewModels<HomePageStateDefaultHomeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val sliderbgAdapter = SliderbgAdapter(imageSliderSliderbgItems,true)
    binding.imageSliderSliderbg.adapter = sliderbgAdapter
    binding.homePageStateDefaultHomeVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = LoginPageLoginPostLoginActionActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun onPause(): Unit {
      binding.imageSliderSliderbg.pauseAutoScroll()
      super.onPause()
    }

    override fun onResume(): Unit {
      super.onResume()
      binding.imageSliderSliderbg.resumeAutoScroll()
    }

    override fun setUpClicks(): Unit {
      binding.imageIMG.setOnClickListener {
        val destIntent = DetailPageMainNomenuNoLoadingRefreshAlwaysActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      binding.txtSeeall.setOnClickListener {
        val destIntent = SearchMeditationsNoLoadingActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      binding.linearUpgradebutton.setOnClickListener {
        val destIntent = InAppSubscriptionPagePaywallAspectratioScreenNomActivity.getIntent(this,
            null)
        startActivity(destIntent)
      }
      binding.btnUpgrade.setOnClickListener {
        val destIntent = InAppSubscriptionPagePaywallAspectratioScreenNomActivity.getIntent(this,
            null)
        startActivity(destIntent)
      }
      binding.imageIMGOne.setOnClickListener {
        val destIntent = DetailPageMainNomenuNoLoadingRefreshAlwaysActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "HOME_PAGE_STATE_DEFAULT_HOME_ACTIVITY"

    }
  }
