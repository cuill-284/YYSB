package com.cll.module_developer

import com.alibaba.android.arouter.facade.annotation.Route
import com.cll.lib_base.base.BaseActivity
import com.cll.lib_base.helper.ARouterHelper

@Route(path = ARouterHelper.PATH_DEVELOPER)
class DeveloperActivity : BaseActivity()  {
    override fun getLayoutId(): Int = R.layout.activity_developer

    override fun getTitleText(): String = "Developer"

    override fun isShowBack(): Boolean = true

    override fun initView() {
    }
}