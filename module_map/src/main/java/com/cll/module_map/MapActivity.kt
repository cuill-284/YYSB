package com.cll.module_map

import com.alibaba.android.arouter.facade.annotation.Route
import com.cll.lib_base.base.BaseActivity
import com.cll.lib_base.helper.ARouterHelper

@Route(path = ARouterHelper.PATH_MAP)
class MapActivity : BaseActivity()  {

    override fun getLayoutId(): Int = R.layout.activity_map

    override fun getTitleText(): String = "Map"

    override fun isShowBack(): Boolean = true

    override fun initView() {
    }
}