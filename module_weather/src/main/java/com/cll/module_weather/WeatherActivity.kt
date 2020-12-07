package com.cll.module_weather

import com.alibaba.android.arouter.facade.annotation.Route
import com.cll.lib_base.base.BaseActivity
import com.cll.lib_base.helper.ARouterHelper

@Route(path = ARouterHelper.PATH_WEATHER)
class WeatherActivity : BaseActivity() {


    override fun getLayoutId(): Int = R.layout.activity_weather

    override fun getTitleText(): String = "WeatherActivity"

    override fun isShowBack(): Boolean = true

    override fun initView() {
    }
}