package com.avassapplication.app.modules.menumenutabs.ui

import androidx.activity.viewModels
import com.avassapplication.app.R
import com.avassapplication.app.appcomponents.base.BaseActivity
import com.avassapplication.app.databinding.ActivityMenuMenuTabsBinding
import com.avassapplication.app.modules.menumenutabs.`data`.viewmodel.MenuMenuTabsVM
import kotlin.String
import kotlin.Unit

class MenuMenuTabsActivity :
    BaseActivity<ActivityMenuMenuTabsBinding>(R.layout.activity_menu_menu_tabs) {
  private val viewModel: MenuMenuTabsVM by viewModels<MenuMenuTabsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.menuMenuTabsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "MENU_MENU_TABS_ACTIVITY"

  }
}
