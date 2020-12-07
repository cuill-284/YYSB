package com.cll.module_constellation

import com.alibaba.android.arouter.facade.annotation.Route
import com.cll.lib_base.base.BaseActivity
import com.cll.lib_base.helper.ARouterHelper

@Route(path = ARouterHelper.PATH_CONSTELLATION)
class ConstellationActivity : BaseActivity() {
    override fun getLayoutId(): Int = R.layout.activity_constellation

    override fun getTitleText(): String = "Constellation"

    override fun isShowBack(): Boolean = true

    override fun initView() {
    }
}