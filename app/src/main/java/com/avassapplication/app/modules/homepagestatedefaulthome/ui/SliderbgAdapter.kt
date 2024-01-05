package com.avassapplication.app.modules.homepagestatedefaulthome.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.avassapplication.app.databinding.SlideritemHomePageStateDefaultHome1Binding
import com.avassapplication.app.modules.homepagestatedefaulthome.`data`.model.ImageSliderSliderbgModel
import java.util.ArrayList
import kotlin.Boolean
import kotlin.Int

class SliderbgAdapter(
  val dataList: ArrayList<ImageSliderSliderbgModel>,
  val mIsInfinite: Boolean
) : LoopingPagerAdapter<ImageSliderSliderbgModel>(dataList, mIsInfinite) {
  override fun bindView(
    binding: ViewBinding,
    listPosition: Int,
    viewType: Int
  ) {
    if (binding is SlideritemHomePageStateDefaultHome1Binding) {
      binding.imageSliderSliderbgModel = dataList[listPosition]
    }
  }

  override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemHomePageStateDefaultHome1Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}
